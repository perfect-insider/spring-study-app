package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserInfo;

/**
 * ユーザー情報テーブル DAO
 * 
 * @author AS
 * 
 */
// @RepositoryはSpringのリポジトリを示すアノテーション
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {
    // JpaRepositoryを継承することで、基本的なCRUD操作が自動で提供される
    // ここではUserInfoエンティティの主キーの型はStringであることを示している
    // 今回のPKはloginId
}
