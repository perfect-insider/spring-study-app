package com.example.demo.model;

import lombok.Data;

@Data
public class Test {
    // user_infoテーブルの1レコード分のデータを保持するモデルクラス
    // getter/setter等はLombokの@Dataで自動生成
    private String login_id;
    private String password;
}