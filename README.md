# Spring Boot Login App
このプロジェクトは学習目的で作成したSpring Boot + PostgreSQL + JPAのログインサイトです。

## ✅ 実装済み機能
- ログイン認証

## 📚 使用技術
- Java 21
- Spring Boot 3.5.0
- PostgreSQL
- JPA（Hibernate）
- lombok
- thymeleaf

## 主なファイル
src/main/java/com/example/demo/controller/LoginController.java
src/main/java/com/example/demo/entity/UserInfo.java
src/main/java/com/example/demo/repository/UserInfoRepository.java
src/main/java/com/example/demo/service/LoginService.java
src/main/java/com/example/demo/form/LoginForm.java
src/main/resources/templates/login.html
src/main/resources/templates/menu.html

## 💡 学び・メモ
- MVCの基礎
- アノテーションの使い方
- クラス図、シーケンス図を生成して処理の流れを理解
- DBとの連携

## 🔜 今後の予定
- プロジェクト中のファイルの整理
- ユーザー登録機能の実装
- その他機能拡張