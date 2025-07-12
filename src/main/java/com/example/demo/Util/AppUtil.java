package com.example.demo.Util;

import java.util.Locale;

import org.springframework.context.MessageSource;

/**
 * アプリケーション共通クラス
 * 
 * @author AS
 * 
 */
public class AppUtil {
    public static String getMessage(MessageSource messageSource, String key, Object... params) {
        // MessageSourceを使用して、指定されたキーに対応するメッセージを取得します。
        // paramsは、メッセージ内のプレースホルダーに挿入される値です。
        // ...は可変長引数で、引数で渡さなくても良い。
        return messageSource.getMessage(key, params, Locale.JAPAN);
    }
}
