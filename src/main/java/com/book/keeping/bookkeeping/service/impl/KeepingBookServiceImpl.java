package com.book.keeping.bookkeeping.service.impl;

import com.book.keeping.bookkeeping.entity.KeepingBook;
import com.book.keeping.bookkeeping.entity.reflect.KeepingBookListItem;
import com.book.keeping.bookkeeping.entity.reflect.KeepingBookPieObject;
import com.book.keeping.bookkeeping.entity.reflect.UserMonthDayBook;
import com.book.keeping.bookkeeping.mapper.KeepingBookMapper;
import com.book.keeping.bookkeeping.service.KeepingBookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.List;

/**
 * 功能描述
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2019/11/7
 */
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class KeepingBookServiceImpl  implements KeepingBookService {

    private final KeepingBookMapper keepingBookMapper;

    @Override
    public List<KeepingBookListItem> listBook(String startTime, String endTime,
                                              BigDecimal startCoast, BigDecimal endCoast,
                                              String bookTag, String bookAccount,
                                              String userId) {
        String[] tags = StringUtils.split(bookTag, ",");
        String[] accounts = StringUtils.split(bookAccount, ",");
        return keepingBookMapper.listBook(null, null, null, null, null, null, null);
    }

    /**
     * @see KeepingBookService#listUserMonthDayBook(String, String)
     */
    @Override
    public List<UserMonthDayBook> listUserMonthDayBook(String month, String userId) {
        return keepingBookMapper.listUserMonthDayBook(month,userId);
    }

    /**
     * @see KeepingBookService#listUserDayBook(String, String)
     * */
    @Override
    public List<KeepingBookListItem> listUserDayBook(String month, String userId) {
        return keepingBookMapper.listUserDayBook(month,userId);
    }

    /**
     * @see KeepingBookService#insertKeepingBook(KeepingBook)
     * */
    @Override
    public int insertKeepingBook(KeepingBook keepingBook) {
        log.info("{}", keepingBook);
        return keepingBookMapper.InsertKeepingBookOrigin(keepingBook);
    }

    @Override
    public KeepingBookPieObject listUserYearTagBookPie(String year, String userId) {
        return null;
    }

    @Override
    public List<KeepingBookListItem> listUserYearTagBookList(String year, int tag, String userId) {
        return null;
    }

    @Override
    public KeepingBookPieObject listUserYearMonthBookPie(String year, String userId) {
        return null;
    }

    @Override
    public List<KeepingBookListItem> listUserYearMonthBookList(String  month, String userId) {
        return null;
    }
}
