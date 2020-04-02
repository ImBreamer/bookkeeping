package com.book.keeping.bookkeeping.service.impl;

import com.book.keeping.bookkeeping.service.TestService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * 功能描述
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2020/4/1
 */
@Slf4j
@Service
public class TestServiceImpl implements TestService {

    @SneakyThrows
    @Async("taskExecutor")
    @Override
    public Future<String> hello() {
        log.info("------------- hello start -----------");
        Thread.sleep(2000);
        log.info("------------- hello end -----------");
        return new AsyncResult<>("hello");
    }

    @SneakyThrows
    @Async("taskExecutor")
    @Override
    public Future<String> goodBye() {
        log.info("------------- good bye start -----------");
        Thread.sleep(3000);
        log.info("------------- good bye end -----------");
        return new AsyncResult<>("good bye");
    }
}
