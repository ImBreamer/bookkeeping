package com.book.keeping.bookkeeping.controller;

import com.alibaba.fastjson.JSONObject;
import com.book.keeping.bookkeeping.common.result.Result;
import com.book.keeping.bookkeeping.utils.TokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/setToken")
    public Result setToken(String userId) {
        JSONObject result = new JSONObject();
        String token = TokenUtil.createToken(userId);
        redisTemplate.opsForValue().set(userId,token);
        result.put("userId", userId);
        result.put("token", token);
        return Result.success(result);
    }
}
