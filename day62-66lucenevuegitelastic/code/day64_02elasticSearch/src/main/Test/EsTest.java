import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: twc
 * @Date 2019/6/20 21:01
 **/
public class EsTest {
    @Test
    public void fun01() throws UnknownHostException {
        // 创建客户端连接对象

        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY);
        client.addTransportAddress(new InetSocketTransportAddress(
                InetAddress.getByName("127.0.0.1"), 9300
        ));
        // 创建文档数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 1);
        map.put("title", "ElasticSearch是一个基于Lucene的搜索服务器");
        map.put("content", "ElasticSearch是一个基于Lucene的搜索服务器。它提供了一个分布式多用户能力的全文搜索引擎，基于RESTful web接口。Elasticsearch是用Java开发的，并作为Apache许可条款下的开放源码发布，是当前流行的企业级搜索引擎。设计用于云计算中，能够达到实时搜索，稳定，可靠，快速，安装使用方便。");
        // 创建索引
        client.prepareIndex("blog", "article", "1").setSource(map).get();
        // 4. 释放资源
        client.close();
    }

    //查询全部
    @Test
    public void fun02() throws UnknownHostException {
        //创建客户端连接对象，设置连接地址
        PreBuiltTransportClient client = new PreBuiltTransportClient(Settings.EMPTY);
        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
        //指定索引库类型
        SearchRequestBuilder searchRequestBuilder = client.prepareSearch("blog").setTypes("article");
        //3. 设置查询条件，进行查询
        SearchResponse searchResponse =
                searchRequestBuilder.setQuery(QueryBuilders.matchAllQuery()).get();
        //处理结果
        SearchHits hits = searchResponse.getHits();
        System.out.println("条数=" + hits.totalHits);
        // 关闭资源
        client.close();
    }


    // 字符串搜索StringQuery()
    @Test
    public void  test3() throws UnknownHostException {
        //创建客户端访问对象
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddress(
                new InetSocketTransportAddress(
                        InetAddress.getByName("127.0.0.1"), 9300));
        // 设置查询条件

        SearchResponse searchResponse = client.prepareSearch("blog").setTypes("article")
                .setQuery(QueryBuilders.queryStringQuery("搜索").field("title")) // 默认在所有的字段上进行搜索，搜索“搜素”；如果添加.field("title")：表示只在title字段进行搜索
                .get();
        // 处理结果
        SearchHits hits = searchResponse.getHits();
        System.out.println("共查询"+hits.getTotalHits()+"条");
        Iterator<SearchHit> ite = hits.iterator();
        while(ite.hasNext()){
            SearchHit searchHit = ite.next();
            System.out.println(searchHit.getSourceAsString());
            System.out.println(searchHit.getSource().get("title"));
        }
        //关闭资源
        client.close();

    }



}
