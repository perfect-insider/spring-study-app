package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
    // メニュー画面を表示するためのGETリクエストを処理
    @GetMapping("/menu")
    public String view() {
        // "menu"という名前のテンプレートを返す
        return "menu";
    }

}
