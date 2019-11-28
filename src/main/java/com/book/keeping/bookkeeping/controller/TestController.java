package com.book.keeping.bookkeeping.controller;

import com.book.keeping.bookkeeping.common.result.Result;
import com.book.keeping.bookkeeping.entity.parameter.WeiXinPostInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @PostMapping("/set")
    public Result setRedis() {
        redisTemplate.opsForValue().set("breamer", "1234", 3, TimeUnit.MINUTES);
        return Result.success();
    }

    @GetMapping("/get")
    public Result getRedis(String key) {
        return Result.success(redisTemplate.opsForValue().get(key));
    }
}
