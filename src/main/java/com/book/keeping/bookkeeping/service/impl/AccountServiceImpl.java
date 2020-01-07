package com.book.keeping.bookkeeping.service.impl;

import com.book.keeping.bookkeeping.entity.BookUserAccount;
import com.book.keeping.bookkeeping.service.AccountService;

import java.util.List;

/**
 * 功能描述
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2020/1/7
 */
public class AccountServiceImpl implements AccountService {
    @Override
    public int deleteUserAccount(int id, String userId) {
        return 0;
    }

    @Override
    public List<BookUserAccount> listUserAccount(String userId) {
        return null;
    }

    @Override
    public int insertAccount(BookUserAccount account) {
        return 0;
    }
}
