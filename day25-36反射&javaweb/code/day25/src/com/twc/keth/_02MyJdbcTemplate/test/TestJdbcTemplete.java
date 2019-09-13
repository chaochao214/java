package com.twc.keth._02MyJdbcTemplate.test;

import com.twc.keth._01reflect.Student;
import com.twc.keth._02MyJdbcTemplate.MyJdbcTemplate;
import com.twc.keth._02MyJdbcTemplate.utils.JDBCUtil;

public class TestJdbcTemplete {
    public static void main(String[] args) {
        MyJdbcTemplate myJdbcTemplate = new MyJdbcTemplate(JDBCUtil.getDataSource());
        String sql = "select * from student where id=?";

        Student student = myJdbcTemplate.queryForObject(sql, Student.class, 2);
        System.out.println(student);
    }
}
