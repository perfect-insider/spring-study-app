package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserInfo;
import com.example.demo.repository.UserInfoRepository;

import lombok.RequiredArgsConstructor;

/**
 * ログイン処理を行うサービスクラス。
 * ユーザー情報の検索を担当します。
 */
// @ServiceはSpringのサービスを示すアノテーション
@Service
// @RequiredArgsConstructorはLombokのアノテーション。
// finalで宣言したインスタンスに対して、newしたものを注入するコンストラクタを自動生成する。
@RequiredArgsConstructor
public class LoginService {
    private final UserInfoRepository repository;

    // Optionalは、return値が存在するかもしれないし、存在しないかもしれないことを示すコンテナ
    // Optionalを使うことで、nullチェックを明示的に行うことができる
    public Optional<UserInfo> searchUserByID(String loginId) {
        // UserInfoRepositoryのfindByIdメソッドを呼び出して、loginIdに対応するユーザー情報を取得
        return repository.findById(loginId);
    }
}
