package test;

import com.twc.pojo.Article;
import com.twc.service.impl.ArticleService;
import org.elasticsearch.client.transport.TransportClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: twc
 * @Date 2019/6/21 9:44
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringDataTest {
    @Autowired
    private ArticleService articleService;
    /*@Autowired
    private TransportClient client;*/
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    /**
     * 创建索引和映射
     */
    @Test
    public void createIndex() {
        elasticsearchTemplate.createIndex(Article.class);
        elasticsearchTemplate.putMapping(Article.class);

    }
    @Test
    public void saveArticle(){
        Article article =  new Article();
        article.setId(100);
        article.setTitle("测试SpringData ElasticSearch"); article.setContent("Spring Data ElasticSearch 基于 spring data API 简化 elasticSearch操作，将原始操作elasticSearch的客户端API 进行封装 \n" + " Spring Data为Elasticsearch Elasticsearch项目提供集成搜索引擎"); articleService.save(article);

    }


}
