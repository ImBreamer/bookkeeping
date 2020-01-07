package com.book.keeping.bookkeeping.mapper;

import com.book.keeping.bookkeeping.common.BaseMapper;
import com.book.keeping.bookkeeping.entity.BookUserAccount;

import java.util.List;

/**
 * 用户账户Mapper
 * @author zhang.penghao
 * @date 2019/11/18
 */
public interface BookUserAccountMapper extends BaseMapper<BookUserAccount> {

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