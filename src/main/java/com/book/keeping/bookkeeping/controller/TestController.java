package com.book.keeping.bookkeeping.controller;

import com.alibaba.fastjson.JSONObject;
import com.book.keeping.bookkeeping.common.result.Result;
import com.book.keeping.bookkeeping.service.TestService;
import com.book.keeping.bookkeeping.utils.TokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

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

    @Autowired
    TestService testService;

    @PostMapping("/set")
    public Result setRedis() {
        redisTemplate.opsForValue().set("breamer", "1234", 3, TimeUnit.MINUTES);
        return Result.success();
    }

    @GetMapping("/get")
    public Result getRedis(String key) {
        return Result.success(redisTemplate.opsForValue().get(key));
    }

    @GetMapping("/setToken")
    public Result setToken(String userId) {
        JSONObject result = new JSONObject();
        String token = TokenUtil.createToken(userId);
        redisTemplate.opsForValue().set(userId,token);
        result.put("userId", userId);
        result.put("token", token);
        return Result.success(result);
    }

    @GetMapping("/async")
    public Result testAsync() throws InterruptedException, ExecutionException, TimeoutException {
        Future<String> hello = testService.hello();
        Future<String> goodBye = testService.goodBye();
        JSONObject json = new JSONObject();
        json.put("hello", hello.get(5, TimeUnit.SECONDS));
        json.put("goodBye", goodBye.get(5, TimeUnit.SECONDS));
        return Result.success(json);
    }
}
