package com.book.keeping.bookkeeping.service;

import com.book.keeping.bookkeeping.entity.BookUserAccount;
import com.book.keeping.bookkeeping.entity.reflect.KeepingBookListItem;
import com.book.keeping.bookkeeping.entity.reflect.UserMonthDayBook;

import java.util.List;

/**
 * 功能描述
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2019/11/7
 */
public interface AccountService {

    /**
     * 功能描述:删除用户账户
     * @author zhang.penghao
     * @param id 账户ID
     * @param userId 用户ID
     * @date 2019/11/18
     * @return int
     */
    int deleteUserAccount(int id, String userId);

    /**
     * 功能描述:查询用户下所有账户
     * @author zhang.penghao
     * @param userId 用户ID
     * @date 2019/11/18
     * @return {@link BookUserAccount}
     */
    List<BookUserAccount> listUserAccount(String userId);

    /**
     * 功能描述: 添加用户账单账户
     * @author zhang.penghao
     * @param account 账单 {@link BookUserAccount}
     * @date 2019/11/18
     * @return int
     */
    int insertAccount(BookUserAccount account);


}
