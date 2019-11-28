package com.book.keeping.bookkeeping.entity.system;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component
public class Constant {

    public static final String TOKEN_SLAT = "LetUsGoSky";
    public static final String TOKEN_HEADER = "beBetter";
    public static final String CHECK_TOKEN_INDEX = "checkTokenInvalid";
    public static Set<String> CHECK_EXE_PATH;

    @Value("${exclude.path}")
    public void setExcludePath(String url) {

        CHECK_EXE_PATH = new HashSet<>(Arrays.asList(url.trim().split(",")));
    }
}
