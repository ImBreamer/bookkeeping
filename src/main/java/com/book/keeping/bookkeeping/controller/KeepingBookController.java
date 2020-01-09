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

    /**
     * 功能描述: 记账
     * @author zhang.penghao
     * @date 2020/1/9
     */
    @PostMapping
    public Result insertKeepingBook(String userId, @Validated @RequestBody KeepingBook keepingBook){
        keepingBook.setUserId(userId);
        return Result.success(keepingBookService.insertKeepingBook(keepingBook));
    }

    /**
     * 功能描述: 年度类目分布 -- 饼图
     * @author zhang.penghao
     * @date 2020/1/9
     */
    @GetMapping("/year/tag/pie")
    public Result listUserYearTagBookPie(String year, String userId){
        return Result.success(keepingBookService.listUserYearTagBookPie(year,userId));
    }

    /**
     * 功能描述: 年度类目账单列表
     * @author zhang.penghao
     * @date 2020/1/9
     */
    @GetMapping("/year/tag/list")
    public Result listUserYearTagBookList(String year,int tag, String userId){
        return Result.success(keepingBookService.listUserYearTagBookList(year,tag,userId));
    }

    /**
     * 功能描述: 年度月度分布 -- 饼图
     * @author zhang.penghao
     * @date 2020/1/9
     */
    @GetMapping("/year/month/pie")
    public Result listUserYearMonthBookPie(String year, String userId){
        return Result.success(keepingBookService.listUserYearMonthBookPie(year,userId));
    }

    /**
     * 功能描述: 年度类目账单列表
     * @author zhang.penghao
     * @date 2020/1/9
     */
    @GetMapping("/year/month/list")
    public Result listUserYearMonthBookList(String year,int month, String userId){
        return Result.success(keepingBookService.listUserYearMonthBookList(year,month,userId));
    }

    //TODO
    //TODO  年度月度账单列表
    //TODO  月度类目分布 -- 饼图
    //TODO  月度类目账单列表
    //TODO  月度日期分布 -- 饼图
    //TODO  月度日期账单列表
    //TODO  周度类目分布 -- 饼图
    //TODO  周度类目账单列表
    //TODO  周度日期分布 -- 饼图
    //TODO  周度日期账单列表


}
