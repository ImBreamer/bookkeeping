package com.book.keeping.bookkeeping.service.impl;

import com.book.keeping.bookkeeping.entity.BookUserAccount;
import com.book.keeping.bookkeeping.mapper.BookUserAccountMapper;
import com.book.keeping.bookkeeping.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2020/1/7
 */
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AccountServiceImpl implements AccountService {

    private final BookUserAccountMapper accountMapper;

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
