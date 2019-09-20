package com.twc.service.impl;

import com.twc.dao.ArticleRepository;
import com.twc.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: twc
 * @Date 2019/6/21 9:26
 **/
@Service
public class ArticleService implements com.twc.service.ArticleService {

    @Autowired
    private ArticleRepository articleRepository;


    @Override
    public void save(Article article) {
        articleRepository.save(article);

    }
}
