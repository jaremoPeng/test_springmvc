package com.jaremo.test_springmvc.test_restful;

import com.jaremo.test_springmvc.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Test {
    @Autowired
    private JdbcTemplate jt;

    @RequestMapping("/test")
    public String test(String id){
        System.out.println(id);
        return  null;
    }

    @RequestMapping(value = "/user" , method = RequestMethod.POST)
    public String add(HttpServletRequest request){
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String sql = "insert into user(uid , uname) values("+id+",'"+name+"')";
        jt.execute(sql);
        return null;
    }

    @RequestMapping(value = "/user/{uid}" , method = RequestMethod.DELETE)
    public String delete(@PathVariable String uid){
        String sql = "DELETE FROM user WHERE uid = "+uid;
        jt.execute(sql);
        return null;
    }

    @RequestMapping(value = "/user/{uid}" , method = RequestMethod.PUT)
    public String update(@PathVariable String uid , HttpServletRequest request){
        String uname = request.getParameter("uname");
        String sql = "UPDATE user SET uname='"+uname+"' WHERE uid= "+uid;
        jt.execute(sql);
        return "forward:/index.jsp";
    }
}
