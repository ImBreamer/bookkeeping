package com.book.keeping.bookkeeping.service;

import com.book.keeping.bookkeeping.common.result.Result;
import com.book.keeping.bookkeeping.entity.KeepingBook;
import com.book.keeping.bookkeeping.entity.reflect.KeepingBookListItem;
import com.book.keeping.bookkeeping.entity.reflect.KeepingBookPieObject;
import com.book.keeping.bookkeeping.entity.reflect.UserMonthDayBook;

import java.math.BigDecimal;
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
     * 功能描述: 账单筛选
     * @author zhang.penghao
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @param startCoast 金额筛选起点
     * @param endCoast 金额筛选终点
     * @param bookTag 账单类目
     * @param bookAccount 账单账户
     * @param userId 用户ID
     * @date 2020/1/13
     * @return {@link KeepingBookListItem}
     */
    List<KeepingBookListItem> listBook(String startTime, String endTime,
                    BigDecimal startCoast, BigDecimal endCoast,
                    String bookTag, String bookAccount,
                    String userId);

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
     * @param year 账单年份
     * @param userId 用户ID
     * @author zhang.penghao
     * @date 2020/1/9
     * @return {@link KeepingBookPieObject}
     */
    KeepingBookPieObject listUserYearTagBookPie(String year, String userId);

    /**
     * 功能描述: 年度类目账单列表
     * @param year 账单年份
     * @param tag 账单类目
     * @param userId 用户ID
     * @author zhang.penghao
     * @date 2020/1/9
     * @return {@link KeepingBookListItem}
     */
    List<KeepingBookListItem> listUserYearTagBookList(String year,int tag, String userId);

    /**
     * 功能描述: 年度月度分布 -- 饼图
     * @param year 账单年份
     * @param userId 用户ID
     * @author zhang.penghao
     * @date 2020/1/9
     * @return {@link KeepingBookPieObject}
     */
    KeepingBookPieObject listUserYearMonthBookPie(String year, String userId);

    /**
     * 功能描述: 年度类目账单列表
     * @param month 账单月度
     * @param userId 用户ID
     * @author zhang.penghao
     * @date 2020/1/9
     * @return {@link KeepingBookListItem}
     */
    List<KeepingBookListItem> listUserYearMonthBookList(String month, String userId);
}
