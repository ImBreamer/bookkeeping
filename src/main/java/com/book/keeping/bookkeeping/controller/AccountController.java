package com.book.keeping.bookkeeping.controller;

import com.book.keeping.bookkeeping.common.result.Result;
import com.book.keeping.bookkeeping.entity.BookUserAccount;
import com.book.keeping.bookkeeping.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    AccountService accountService;

    @PostMapping
    public Result insertAccount(String userId,@Validated @RequestBody BookUserAccount account) {
        account.setUserId(userId);
        return Result.success(accountService.insertAccount(account));
    }

    @GetMapping
    public Result listUserAccount(String userId) {
        return Result.success(accountService.listUserAccount(userId));
    }

    @DeleteMapping("/{id}")
    public Result deleteUserAccount(@PathVariable Integer id,String userId) {
        return Result.success(accountService.deleteUserAccount(id,userId));
    }
}
