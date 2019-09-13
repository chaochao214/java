package com.twc.keth._05JdbcDemoInfo.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface JdbcInfo {
        String driverClass() default "com.mysql.jdbc.Driver";
        String url();
        String username() default "root";
        String password();

}
