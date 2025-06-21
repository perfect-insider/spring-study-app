package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Test;
import com.example.demo.repository.TestMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional
@Service
public class TestService {
    // TestMapperインタフェース
    private final TestMapper mapper;

    // TestMapperのselectAllメソッドを呼び出して、user_infoテーブルの全データを取得し返す
    public List<Test> selectAll() {
        return mapper.selectAll();
    }
}
