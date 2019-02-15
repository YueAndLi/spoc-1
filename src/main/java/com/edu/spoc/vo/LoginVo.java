package com.edu.spoc.vo;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class LoginVo {
    @NotBlank(message = "用户名或密码错误")
    @Length(min = 5, max = 18, message = "用户名或密码错误")
    private String username;
    @NotBlank(message = "用户名或密码错误")
    @Length(min = 6, max = 18, message = "用户名或密码错误")
    private String password;
    //    @Length(min = 4, max = 4, message = "验证码格式错误")
    private String verificationCode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
