package com.example.demo.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserInfo;
import com.example.demo.form.SignupForm;
import com.example.demo.mapper.SignupMapper;
import com.example.demo.repository.UserInfoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SignupService {
    /** ユーザー情報テーブルDAO */
    private final UserInfoRepository repository;

    /** Signup Mapper */
    private final SignupMapper signupMapper;

    /** パスワードエンコーダ */
    private final PasswordEncoder passwordEncoder;

    /**
     * ユーザー情報テーブル 新規登録
     * 
     * @param form 入力情報
     * @return 登録情報（ユーザー情報Entity）
     */
    public UserInfo resistUserInfo(SignupForm form) {
        var userInfo = signupMapper.signupFormToUserInfo(form);
        var encodedPassword = passwordEncoder.encode(form.getPassword());
        userInfo.setPassword(encodedPassword);

        // 入力データを1件ずつuserInfoへコピー（項目が増えた分だけ実装行も増える）
        // var userInfo = new UserInfo();
        // userInfo.setLoginId(form.getLoginId());
        // userInfo.setPassword(form.getPassword());

        return repository.save(userInfo);
    }
}
