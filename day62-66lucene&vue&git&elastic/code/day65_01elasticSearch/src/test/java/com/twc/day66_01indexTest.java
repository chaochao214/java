package com.twc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twc.pojo.Article;
import org.elasticsearch.action.admin.indices.mapping.put.PutMappingRequest;
import org.elasticsearch.client.Requests;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;

/**
 * @Author: twc
 * @Date 2019/7/3 10:30
 **/
public class day66_01indexTest {
    public day66_01indexTest() throws JsonProcessingException {
    }

    @Test
    //创建索引
    public void fun01() throws Exception {
        //1.创建客户端对象,设置连接地址
        PreBuiltTransportClient client = new PreBuiltTransportClient(Settings.EMPTY);
        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
        //2.创建索引
        client.admin().indices().prepareCreate("blog02").get();
        //3.释放资源
        client.close();
    }

    //删除索引
    @Test
    public void fun02() throws Exception {
        //1.创建客户端对象,设置连接地址
        PreBuiltTransportClient client = new PreBuiltTransportClient(Settings.EMPTY);
        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
        //2.删除索引
        client.admin().indices().prepareDelete("blog02").get();
        //3.释放资源
        client.close();
    }

    //创建映射
    @Test
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

        //4.释放资源
        client.close();


    }

    //    使用jackson转换实体
    @Test
    public void testJackson() throws UnknownHostException, JsonProcessingException {
        //1.创建客户端对象,设置连接地址
        PreBuiltTransportClient client = new PreBuiltTransportClient(Settings.EMPTY);
        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));

        //2.创建文档 {"id":1,"title":"",content:""}
        Article article = new Article(2, "搜索使用ES", "ES索索也就还行");
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(article);
        client.prepareIndex("blog02", "article", article.getId() + "").setSource(jsonStr).get();
        //3. 释放资源
        client.close();

    }
}
