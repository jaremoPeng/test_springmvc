package com.jaremo.test_springmvc.locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.Locale;

@Controller
public class LocaleController {
    @Autowired
    @Qualifier(value = "messageSource")
    MessageSource ms;

    @RequestMapping("/locale") // outputstream用于输出   locale是用于接受的浏览器的字符编码,OutputStream out , Locale locale
    public String case1(){
        return "/view/localeshow.jsp";
    }
}
