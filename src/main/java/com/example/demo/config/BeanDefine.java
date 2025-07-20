package com.example.demo.config;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
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

    @Bean
    public Mapper dozerMapper() {
        // Dozerは、Javaオブジェクト間のマッピングを行うライブラリです。
        // ここでは、DozerのMapperインスタンスをBeanとして定義しています。
        return new DozerBeanMapper();
    }
}
