package com.book.keeping.bookkeeping.controller;


import com.book.keeping.bookkeeping.common.result.Result;
import com.book.keeping.bookkeeping.entity.KeepingBook;
import com.book.keeping.bookkeeping.service.KeepingBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 账单控制层
 * @author zhang.penghao
 * @date 2019/11/18
 */
@RestController
@RequestMapping(value = "/book")
public class KeepingBookController {

    @Autowired
    KeepingBookService keepingBookService;

    @GetMapping("/test")
    public Result listUserMonthDayBook(String month, String userId){
        return Result.success(keepingBookService.listUserMonthDayBook(month,userId));
    }


    @PostMapping
    public Result insertKeepingBook(String userId, @Validated @RequestBody KeepingBook keepingBook){
        keepingBook.setUserId(userId);
        return Result.success(keepingBookService.insertKeepingBook(keepingBook));
    }

}
