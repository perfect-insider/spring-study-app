package com.example.demo.form;

import lombok.Data;

/**
 * ログイン画面 Form
 * 
 * @author AS
 */
@Data
public class LoginForm {
    /** ログインID */
    private String loginId;

    /** パスワード */
    private String password;
}
