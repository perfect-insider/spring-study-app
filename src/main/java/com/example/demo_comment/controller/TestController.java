package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.TestService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TestController {
    private final TestService service;

    // listにアクセス
    @GetMapping("/list")
    public ModelAndView testList(ModelAndView mav) {
        // TestServiceクラスのselectAllメソッドを呼び出して、user_infoテーブルの全データを取得
        mav.addObject("page", service.selectAll());
        // 表示するテンプレート(list.html)を指定
        mav.setViewName("list");
        return mav;
    }
}
