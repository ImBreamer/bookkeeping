package com.book.keeping.bookkeeping.service;

import com.book.keeping.bookkeeping.entity.BookUserAccount;
import com.book.keeping.bookkeeping.entity.BookUserTag;
import com.book.keeping.bookkeeping.entity.reflect.BookUserTagDTO;

import java.util.List;

/**
 * 功能描述
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2019/11/7
 */
public interface TagService {

    /**
     * 功能描述:删除用户类目
     * @author zhang.penghao
     * @param id 账户ID
     * @param userId 用户ID
     * @date 2019/11/18
     * @return int
     */
    int deleteUserTag(int id, String userId);

    /**
     * 功能描述:查询用户下所有账户
     * @author zhang.penghao
     * @param userId 用户ID
     * @date 2019/11/18
     * @return {@link BookUserAccount}
     */
    List<BookUserTagDTO> listUserTag(String userId);

    /**
     * 功能描述: 添加用户账单账户
     * @author zhang.penghao
     * @param tag 账单 {@link BookUserTag}
     * @date 2019/11/18
     * @return int
     */
    int insertTag(BookUserTag tag);


}
