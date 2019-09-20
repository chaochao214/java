package com.twc.dao;

import com.twc.pojo.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author: twc
 * @Date 2019/6/21 9:23
 **/
public interface ArticleRepository extends ElasticsearchRepository<Article,Integer>{

}
