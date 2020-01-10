package com.book.keeping.bookkeeping.mapper;

import com.book.keeping.bookkeeping.common.BaseMapper;
import com.book.keeping.bookkeeping.entity.KeepingBook;
import com.book.keeping.bookkeeping.entity.reflect.KeepingBookListItem;
import com.book.keeping.bookkeeping.entity.reflect.KeepingBookPieObject;
import com.book.keeping.bookkeeping.entity.reflect.UserMonthDayBook;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 账单Mapper
 * @author zhang.penghao
 * @date 2019/11/18
 */
public interface KeepingBookMapper extends BaseMapper<KeepingBook> {

    /**
     * 功能描述:
     * @author zhang.penghao
     * @param month 月份
     * @param userId 用户ID
     * @date 2019/11/18
     * @return {@link UserMonthDayBook}
     */
    List<UserMonthDayBook> listUserMonthDayBook(@Param("month") String month, @Param("userId") String userId);

    /**
     * 功能描述:
     * @author zhang.penghao
     * @param bookDate 账单日期
     * @param userId 用户ID
     * @date 2019/11/18
     * @return {@link KeepingBookListItem}
     */
    List<KeepingBookListItem> listUserDayBook(@Param("bookDate") String bookDate, @Param("userId") String userId);

    /**
     * 功能描述:
     * @author zhang.penghao
     * @param book 账单{@link KeepingBook}
     * @date 2019/12/10
     * @return int
     */
    int InsertKeepingBookOrigin(@Param("book") KeepingBook book);


    /**
     * 功能描述: 年度类目分布 -- 饼图
     * @param year 账单年份
     * @param userId 用户ID
     * @author zhang.penghao
     * @date 2020/1/9
     * @return {@link KeepingBookPieObject}
     */
    KeepingBookPieObject listUserYearTagBookPie(@Param("year") String year,@Param("userId") String userId);

    /**
     * 功能描述: 年度类目账单列表
     * @param year 账单年份
     * @param tag 账单类目
     * @param userId 用户ID
     * @author zhang.penghao
     * @date 2020/1/9
     * @return {@link KeepingBookListItem}
     */
    List<KeepingBookListItem> listUserYearTagBookList(@Param("year") String year,
                                                      @Param("tag") int tag,
                                                      @Param("userId") String userId);

    /**
     * 功能描述: 年度月度分布 -- 饼图
     * @param year 账单年份
     * @param userId 用户ID
     * @author zhang.penghao
     * @date 2020/1/9
     * @return {@link KeepingBookPieObject}
     */
    KeepingBookPieObject listUserYearMonthBookPie(@Param("year") String year,@Param("userId") String userId);

    /**
     * 功能描述: 年度类目账单列表
     * @param month 账单月度
     * @param userId 用户ID
     * @author zhang.penghao
     * @date 2020/1/9
     * @return {@link KeepingBookListItem}
     */
    List<KeepingBookListItem> listUserYearMonthBookList(@Param("month") String month,
                                                        @Param("userId") String userId);
}