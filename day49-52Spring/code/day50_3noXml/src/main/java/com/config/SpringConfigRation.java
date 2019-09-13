package com.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;

/**
 * @Author: twc
 * @Date 2019/5/26 21:18
 **/
@Configuration
@ComponentScan(value = {"com"})
public class SpringConfigRation {
    @Bean(name = "runner")
    @Scope("prototype")
    public QueryRunner createQueryRunner(DataSource dataSource) {
        return new QueryRunner(dataSource);

    }

    @Bean(name = "ds")
    public DataSource createDataSource() {
        try {
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass("com.mysql.jdbc.Driver");
            ds.setJdbcUrl("jdbc:mysql://localhost:3306/day50springioc");
            ds.setUser("root");
            ds.setPassword("root");
            return ds;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
