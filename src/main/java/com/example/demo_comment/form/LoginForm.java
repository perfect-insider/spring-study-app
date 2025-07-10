package com.example.demo.form;

// Lombokの@Dataアノテーションを使用して、
// ゲッター、セッター、toString、equals、hashCodeメソッドを自動生成
import lombok.Data;

// ログインフォームのデータを保持するクラス
@Data
public class LoginForm {
    // ユーザーのログインIDを保持するフィールド
    private String loginId;

    // ユーザーのパスワードを保持するフィールド
    private String password;
}
