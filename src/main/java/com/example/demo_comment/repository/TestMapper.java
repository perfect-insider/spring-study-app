package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Test;

@Mapper
public interface TestMapper {
    // user_infoテーブルの全レコードを取得し、Testオブジェクトのリストとして返す
    @Select("SELECT * FROM user_info")
    // selectAllメソッド実行時に、Testクラスが自動的にインスタンス化される
    List<Test> selectAll();
}
