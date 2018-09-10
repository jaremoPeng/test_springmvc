package com.jaremo.test_springmvc.view;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Component
public class Temp {
    @NotEmpty(message = "电话号码不能为空")
    @Pattern(regexp = "135|158\\d{8}",message = "电话号码不以135或者158开头")
    @Size(min = 11,max = 11,message = "电话号码的长度不为十一位")
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
