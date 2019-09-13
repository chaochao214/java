package com.twc.pojo;

import java.io.Serializable;

/**
 * @Author: twc
 * @Date 2019/7/3 10:45
 **/
public class Article implements Serializable {
    private long id;
    private String title;
    private String content;

    public Article(long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
