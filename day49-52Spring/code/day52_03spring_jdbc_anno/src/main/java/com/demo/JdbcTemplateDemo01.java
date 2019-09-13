package com.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.DriverManager;

/**
 * @Author: twc
 * @Date 2019/5/30 21:23
 **/
public class JdbcTemplateDemo01 {
    public static void main(String[] args) {
        DriverManagerDataSource ds =  new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/day50springioc");
        ds.setUsername("root");
        ds.setPassword("root");

        JdbcTemplate jt =  new JdbcTemplate();

        jt.setDataSource(ds);

        jt.execute("insert into account(name,money)values('ddd',1000)");
    }
}
