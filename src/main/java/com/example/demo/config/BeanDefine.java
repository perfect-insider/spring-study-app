package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Bean定義クラス
 */
@Configuration
public class BeanDefine {

    @Bean
    PasswordEncoder passwordEncoder() {
        // BCryptPasswordEncoderは、パスワードをハッシュ化するためのエンコーダーです。
        // これにより、パスワードを安全に保存できます。
        return new BCryptPasswordEncoder();
    }
}
