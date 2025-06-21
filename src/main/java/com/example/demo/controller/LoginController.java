package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.LoginForm;
import com.example.demo.service.LoginService;

import lombok.RequiredArgsConstructor;

// Spring MVCのコントローラークラスとして定義
/**
 * ログイン画面を表示し、ログイン処理を行うコントローラークラス。
 */
@Controller
@RequiredArgsConstructor
public class LoginController {

    private final LoginService service;

    // ログイン画面を表示するためのGETリクエストを処理
    @GetMapping("/login")
    public String view(Model model, LoginForm form) {
        // Spring MVCでは、コントローラーメソッドの引数にLoginForm formのようにフォームオブジェクトを指定すると、
        // デフォルトでクラス名の先頭を小文字にした名前（この場合はloginForm）でモデルに自動追加されます。
        // そのため、model.addAttributeの呼び出しは不要です。
        // model.addAttribute("loginForm", form);

        // "login"という名前のテンプレートを返す
        return "login";
    }

    // ログイン処理を行うためのPOSTリクエストを処理
    @PostMapping("/login")
    public String login(Model model, LoginForm form) {
        var userInfo = service.searchUserByID(form.getLoginId());
        var isCorrectUserAuth = userInfo.isPresent() &&
                form.getPassword().equals(userInfo.get().getPassword());

        // ユーザー認証が成功した場合の処理
        if (isCorrectUserAuth) {
            // 認証成功時の処理（menu.htmlへリダイレクト）
            return "redirect:/menu";
        } else {
            // 認証失敗時の処理（エラーメッセージを表示）
            // modelにエラーメッセージを追加
            model.addAttribute("errorMsg", "ログインIDまたはパスワードが間違っています。");
            // "login"という名前のテンプレートを返す
            return "login";
        }
    }

}
