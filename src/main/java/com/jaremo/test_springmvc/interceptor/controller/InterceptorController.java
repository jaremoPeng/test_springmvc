package com.jaremo.test_springmvc.interceptor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.OutputStream;

@Controller
public class InterceptorController {

    @Autowired
    JdbcTemplate jt;

    @RequestMapping("/inter")
    public String case1(OutputStream out) throws IOException{
        out.write("welcome".getBytes());
        return null;
    }

    @RequestMapping("/koukuan")
    public String case2(Integer money , OutputStream out) throws IOException{
        String sql = "update account set abalance = abalance - "+money+" where aid = 1";
        jt.execute(sql);

        String querySql = "select abalance from account where aid = 1";
        String result = "剩余余额: "+jt.queryForObject(querySql,Integer.class);

        out.write(result.getBytes("utf-8"));
        return  null;
    }
}
