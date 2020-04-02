package com.book.keeping.bookkeeping.config.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 系统启动运行特定配置
 *
 * @author zhang.penghao
 * @date 2018/12/25 11:31
 */
@Component
@Slf4j
public class CacheApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("test runner = {} {}", "ApplicationRunner", "CacheApplicationRunner");
    }
}
