package com.jaremo.test_springmvc.test_restful;

import com.jaremo.test_springmvc.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Test {
    @Autowired
    private JdbcTemplate jt;

    @RequestMapping(value = "/**/user" , method = RequestMethod.POST)
    public String add(User user){
        String sql = "insert into user(id , name) values("+user.getId()+",'"+user.getName()+"')";
        jt.execute(sql);
        return null;
    }
}
