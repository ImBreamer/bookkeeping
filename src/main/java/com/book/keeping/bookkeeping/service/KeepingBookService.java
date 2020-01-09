package com.book.keeping.bookkeeping.service;

import com.book.keeping.bookkeeping.common.result.Result;
import com.book.keeping.bookkeeping.entity.KeepingBook;
import com.book.keeping.bookkeeping.entity.reflect.KeepingBookListItem;
import com.book.keeping.bookkeeping.entity.reflect.UserMonthDayBook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 功能描述
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2019/11/7
 */
public interface KeepingBookService {

    /**
     * 功能描述:
     * @author zhang.penghao
     * @param month 月份
     * @param userId 用户ID
     * @date 2019/11/18
     * @return {@link UserMonthDayBook}
     */
    List<UserMonthDayBook> listUserMonthDayBook(String month, String userId);

    /**
     * 功能描述:
     * @author zhang.penghao
     * @param bookDate 账单日期
     * @param userId 用户ID
     * @date 2019/11/18
     * @return {@link KeepingBookListItem}
     */
    List<KeepingBookListItem> listUserDayBook(String bookDate, String userId);

    /**
     * 功能描述:
     * @author zhang.penghao
     * @param keepingBook 账单 {@link KeepingBook}
     * @date 2019/11/18
     * @return {@link KeepingBookListItem}
     */
    int insertKeepingBook(KeepingBook keepingBook);


    /**
     * 功能描述: 年度类目分布 -- 饼图
     * @author zhang.penghao
     * @date 2020/1/9
     */
    public Result listUserYearTagBookPie(String year, String userId){
        return Result.success(keepingBookService.listUserYearTagBookPie(year,userId));
    }

    /**
     * 功能描述: 年度类目账单列表
     * @author zhang.penghao
     * @date 2020/1/9
     */
    public Result listUserYearTagBookList(String year,int tag, String userId){
        return Result.success(keepingBookService.listUserYearTagBookList(year,tag,userId));
    }

    /**
     * 功能描述: 年度月度分布 -- 饼图
     * @author zhang.penghao
     * @date 2020/1/9
     */
    public Result listUserYearMonthBookPie(String year, String userId){
        return Result.success(keepingBookService.listUserYearMonthBookPie(year,userId));
    }

    /**
     * 功能描述: 年度类目账单列表
     * @author zhang.penghao
     * @date 2020/1/9
     */
    listUserYearMonthBookList(String year,int month, String userId);
}
