package com.jaremo.test_springmvc.validater.controller;

import com.jaremo.test_springmvc.validater.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class ValidaterController {

    @RequestMapping("/verify")
    public String formDataVarify(@Valid UserInfo user, BindingResult errors){ // @Valid 启用
        if(user.getPhone()!=null && !("".equals(user.getPhone().trim()))){
            Integer result = 0;
            try{
                result = Integer.parseInt(user.getPhone());
            }catch (Exception e){
                errors.addError(new FieldError("userInfo" , "phone" , "电话号码不为数字"));
            }
        }


        if(!(user.getPassword().equals(user.getRepassword()))){
            // 这是使用编程式校验  BindingResult类有addError()方法,可添加其他的错误  new FieldError(对象 , 属性 , 错误信息)
            errors.addError(new FieldError("userInfo" , "repassword" , "两次输入的密码不一样"));
        }
        if(errors.hasErrors()){
            return "/validater/validate.jsp";
        }
        return "/validater/success.jsp";
    }
}
