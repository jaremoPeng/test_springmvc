package com.jaremo.test_springmvc.validater;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Component
public class UserInfo {
    @NotEmpty(message = "用户名不能为空") // @NotNull 判断是 !=null  @NotEmpty 其实判断是 != ""
    private String userName;
    @NotEmpty(message = "密码不能为空")
    private String password;
    @NotEmpty(message = "二次输入密码不能为空")
    private String repassword;
    @NotEmpty(message = "年龄不能为空")
    @Min(value = 1 , message = "年龄必须大于1")
    @Max(value = 100 , message = "年龄必须小于100")
    private String age;
    @NotEmpty(message = "电话号码不能为空")
    @Size(min = 11,max = 11,message = "电话号码的长度不为十一位") // 验证表单数据的长度
    private String phone;
    @NotEmpty(message = "电话号码不能为空")
    @Pattern(regexp = ".+@.+\\..+",message = "邮箱的格式不正确") // 验证表单数据的格式
    private String email;
    @NotEmpty(message = "出生日期不能为空")
    @Pattern(regexp = "\\d+-\\d+-\\d+",message = "日期的格式不正确")
    private String birthDate;
    @Pattern(regexp = "http://\\swww\\..+\\..+",message = "网址的格式不正确")
    private String privyUrl;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPrivyUrl() {
        return privyUrl;
    }

    public void setPrivyUrl(String privyUrl) {
        this.privyUrl = privyUrl;
    }
}
