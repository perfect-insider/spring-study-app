package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報を表すエンティティクラス。
 * このクラスは、データベースのuser_infoテーブルに対応しています。
 */
// @EntityはJPAのエンティティを示すアノテーション
@Entity
@Table(name = "user_info")
@Data
public class UserInfo {
    // @Idはエンティティの主キーを示すアノテーション
    @Id
    // @columnはDBのカラム名と異なる場合に紐づけを行うアノテーション
    @Column(name = "login_id")
    private String loginId;

    // passwordはカラム名がDBと一致しているため、@Columnアノテーションは不要
    private String password;
}
