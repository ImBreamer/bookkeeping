package com.book.keeping.bookkeeping.controller;

import com.book.keeping.bookkeeping.common.result.Result;
import com.book.keeping.bookkeeping.entity.KeepingBook;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * 功能描述
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2019/11/28
 */
@Slf4j
@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @PostMapping
    public Result setRedis(String userId, @RequestBody KeepingBook keepingBook) {
        return Result.success();
    }

    @GetMapping
    public Result getRedis(String userId) {
        return Result.success(redisTemplate.opsForValue().get(userId));
    }
}
