package com.book.keeping.bookkeeping.controller;

import com.alibaba.fastjson.JSONObject;
import com.book.keeping.bookkeeping.common.result.Result;
import com.book.keeping.bookkeeping.entity.BookUserTag;
import com.book.keeping.bookkeeping.entity.KeepingBook;
import com.book.keeping.bookkeeping.service.TagService;
import com.book.keeping.bookkeeping.utils.TokenUtil;
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
@RequestMapping(value = "/tag")
public class TagController {

    @Autowired
    TagService tagService;

    @PostMapping
    public Result insertTag(String userId, @RequestBody BookUserTag tag) {
        tag.setUserId(userId);
        return Result.success(tagService.insertTag(tag));
    }

    @GetMapping
    public Result listUserTag(String userId) {
        return Result.success(tagService.listUserTag(userId));
    }

    @DeleteMapping("/{id}")
    public Result deleteUserTag(@PathVariable Integer id,String userId) {
        return Result.success(tagService.deleteUserTag(id,userId));
    }
}
