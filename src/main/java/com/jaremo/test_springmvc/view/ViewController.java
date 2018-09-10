package com.jaremo.test_springmvc.view;

import com.jaremo.test_springmvc.bean.User;
import com.jaremo.test_springmvc.validater.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class ViewController {

    // test modelAndview
    @RequestMapping("/sjfks")
    public ModelAndView case1(@Valid UserInfo userInfo , BindingResult errors){
        ModelAndView mav = new ModelAndView(); // 也可以在构造器里面设置转发的url
        if(errors.hasErrors()){
            mav.setViewName("/view/view.jsp"); // 这里设置转发的url
            mav.addObject("user",userInfo); // 这个方法使用来设置attribute
            return mav;
        }
        return null;
    }

    @RequestMapping("/modelview")
    public String case2(Map map){ // 其中和map有一样功能相似的  还有model , modelmap
        User user = new User();
        user.setId("36");
        user.setName("东皇");
        map.put("user" , user);
        return "/view/showuser.jsp";
    }

    @RequestMapping("/zhujie")
    public String case3(@ModelAttribute("user") UserInfo userInfo){
        System.out.println(userInfo.getBirthDate());
        return null;
    }

    @RequestMapping("/temp")
    public String case4(@Valid Temp temp , BindingResult errors){
        if(errors.hasErrors()){
            return "/view/view.jsp";
        }
        return null;
    }
}
