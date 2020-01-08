package com.book.keeping.bookkeeping.utils;

import java.util.regex.Pattern;

/**
 * 功能描述
 *
 * @author zhang.penghao
 * @date 2019/3/9 09:53
 */
public class RegexUtil {

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "\"^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$\""
    );

    private static final Pattern PHONE_PATTERN = Pattern.compile(
            "^(((13[0-9])|(14[579])|(15([0-3]|[5-9]))|(16[6])|(17[0135678])|(18[0-9])|(19[89]))\\d{8})$"
    );

    private static final Pattern DATE_FORMAT_PATTERN = Pattern.compile(
            "^((?!0000)[0-9]{4}-((0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-8])|(0[13-9]|1[0-2])-(29|30)" +
                    "|(0[13578]|1[02])-31)|([0-9]{2}(0[48]|[2468][048]|[13579][26])|(0[48]|[2468][048]|[13579][26])00)-02-29)$"
    );

    public static boolean regexEmail(String email){
        return EMAIL_PATTERN.matcher(email).matches();
    }
    public static boolean regexPhone(String phone){
        return PHONE_PATTERN.matcher(phone).matches();
    }
    public static boolean regexDate(String date){
        return DATE_FORMAT_PATTERN.matcher(date).matches();
    }
}
