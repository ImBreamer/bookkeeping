package com.book.keeping.bookkeeping.common;

import com.book.keeping.bookkeeping.entity.system.Constant;
import org.springframework.util.AntPathMatcher;

/**
 * 路径匹配
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2020/4/2
 */
public class PathMatcher {

    private static volatile PathMatcher pathMatcher;

    private AntPathMatcher antPathMatcher;

    private PathMatcher() {
        this.antPathMatcher = new AntPathMatcher();
    }

    public static PathMatcher getInstance() {
        if (pathMatcher == null) {
            synchronized (PathMatcher.class) {
                if (pathMatcher == null) {
                    pathMatcher = new PathMatcher();
                }
            }
        }
        return pathMatcher;
    }

    public boolean matcher(String path){
        for(String pattern : Constant.CHECK_EXE_PATH){
            if(antPathMatcher.match(pattern, path)){
                return true;
            }
        }
        return false;
    }
}
