package com.example.demo.controller;

import org.springframework.context.MessageSource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Util.AppUtil;
import com.example.demo.constant.ErrorMessageConst;
import com.example.demo.form.LoginForm;
import com.example.demo.service.LoginService;

import lombok.RequiredArgsConstructor;

/**
 * ログイン画面 Controller
 * 
 * @author AS
 * 
 */
@Controller
@RequiredArgsConstructor
public class LoginController {

    /** ログイン画面 Service */
    private final LoginService service;

    /** passwordEncoder */
    private final PasswordEncoder passwordEncoder;

    /** メッセージソース */
    private final MessageSource messageSource;

    /**
     * 初期表示
     * 
     * @param model モデル
     * @param form  入力画面
     * @return 表示画面
     */
    @GetMapping("/login")
    public String view(Model model, LoginForm form) {
        // Spring MVCでは、コントローラーメソッドの引数にLoginForm formのようにフォームオブジェクトを指定すると、
        // デフォルトでクラス名の先頭を小文字にした名前（この場合はloginForm）でモデルに自動追加されます。
        // そのため、model.addAttributeの呼び出しは不要です。
        // model.addAttribute("loginForm", form);

        return "login";
    }

    /**
     * ログイン
     * 
     * @param model モデル
     * @param form  入力画面
     * @return 表示画面
     */
    @PostMapping("/login")
    public String login(Model model, LoginForm form) {
        var userInfo = service.searchUserByID(form.getLoginId());
        var isCorrectUserAuth = userInfo.isPresent() &&
        // form.getPassword().equals(userInfo.get().getPassword());
                passwordEncoder.matches(form.getPassword(), userInfo.get().getPassword());

        // ログインIDとパスワードの照合結果をチェック
        if (isCorrectUserAuth) {
            return "redirect:/menu";
        } else {
            // TODO エラーメッセージはプロパティファイルで管理する
            // model.addAttribute("errorMsg", "ログインIDまたはパスワードが間違っています。");
            var errorMsg = AppUtil.getMessage(messageSource, ErrorMessageConst.LOGIN_WRONG_INPUT);
            model.addAttribute("errorMsg", errorMsg);
            return "login";
        }
    }

}
