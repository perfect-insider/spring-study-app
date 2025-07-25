package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * メニュー画面 Controller
 * 
 * @author AS
 * 
 */
@Controller
public class MenuController {
    /**
     * 初期表示
     * 
     * @return 表示画面
     */
    @GetMapping("/menu")
    public String view() {
        // "menu"という名前のテンプレートを返す
        return "menu";
    }

}
