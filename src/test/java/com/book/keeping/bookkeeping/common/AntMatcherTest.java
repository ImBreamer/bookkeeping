package com.book.keeping.bookkeeping.common;

import com.book.keeping.bookkeeping.entity.system.Constant;
import org.springframework.boot.autoconfigure.security.servlet.AntPathRequestMatcherProvider;
import org.springframework.util.AntPathMatcher;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 功能描述
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2020/4/2
 */
public class AntMatcherTest {
    public static void main(String[] args) {
        AntPathMatcher matcher = new AntPathMatcher();


        matcher.combine("/user/**","/test/**");


//        System.out.println( matcher.match("/user/**","/user/lol/lll"));

        Constant.CHECK_EXE_PATH = new HashSet<>(Arrays.asList("/user/**,/test/**,/test/**,/test1/**,/test2/**,/test3/**".trim().split(",")));
        System.out.println(PathMatcher.getInstance().matcher("/test3/lol/lll"));
        System.out.println(System.currentTimeMillis());
        System.out.println(PathMatcher.getInstance().matcher("/test3/lol/lll"));
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println(Constant.CHECK_EXE_PATH.contains("/test3/lol/lll"));
        System.out.println(System.currentTimeMillis());

    }
}
