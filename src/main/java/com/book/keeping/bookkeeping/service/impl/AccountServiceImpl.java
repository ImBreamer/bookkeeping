package com.book.keeping.bookkeeping.service.impl;

import com.book.keeping.bookkeeping.entity.BookUserAccount;
import com.book.keeping.bookkeeping.entity.reflect.BookUserAccountDTO;
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
        return accountMapper.deleteUserAccount(id,userId);
    }

    @Override
    public List<BookUserAccountDTO> listUserAccount(String userId) {
        return accountMapper.listUserAccount(userId);
    }

    @Override
    public int insertAccount(BookUserAccount account) {
        return accountMapper.insert(account);
    }
}
