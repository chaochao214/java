package com.twc;

import org.elasticsearch.action.admin.indices.mapping.put.PutMappingRequest;
import org.elasticsearch.client.Requests;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;

/**
 * @Author: twc
 * @Date 2019/6/20 21:54
 **/

public class test01 {
    public void fun03() throws IOException, ExecutionException, InterruptedException {
        //1.创建客户端对象,设置连接地址
        PreBuiltTransportClient client = new PreBuiltTransportClient(Settings.EMPTY);
        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
        //2.创建索引
        client.admin().indices().prepareCreate("blog02").get();
        //3.创建映射
        XContentBuilder builder = XContentFactory.jsonBuilder()
                .startObject()
                .startObject("article")
                .startObject("properties")
                .startObject("id").field("type", "long").field("store", "true").endObject()
                .startObject("title").field("type", "text").field("analyzer", "ik_smart").field("store", "true").endObject()
                .startObject("content").field("type", "text").field("analyzer", "ik_smart").field("store", "true").endObject()
                .endObject()
                .endObject()
                .endObject();
        PutMappingRequest mapping = Requests.putMappingRequest("blog02").type("article").source(builder);
        client.admin().indices().putMapping(mapping).get();
        //释放资源
        client.close();
    }
}
