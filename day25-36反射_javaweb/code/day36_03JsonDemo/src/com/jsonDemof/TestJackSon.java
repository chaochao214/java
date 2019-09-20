package com.jsonDemof;

import com.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: twc
 * @Date 2019/5/6 20:53
 **/
public class TestJackSon {
    @Test
    public void test01() {
        Student student = new Student(18, "lucy", "深圳");
        ObjectMapper mapper = new ObjectMapper();

        try {
            String s = mapper.writeValueAsString(student);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02() {
        Map<String, Object> map = new HashMap<>();
        map.put("username", "jay");
        map.put("password", "123");
        map.put("nickname", "周杰棍");
        ObjectMapper mapper = new ObjectMapper();

        try {
            String s = mapper.writeValueAsString(map);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }


            }
