package com.book.keeping.bookkeeping.service;

import java.util.concurrent.Future;

/**
 * 功能描述
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2020/4/1
 */
public interface TestService {
    Future<String> hello();
    Future<String> goodBye();
}
