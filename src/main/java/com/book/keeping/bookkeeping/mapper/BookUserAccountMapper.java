package com.book.keeping.bookkeeping.mapper;

import com.book.keeping.bookkeeping.common.BaseMapper;
import com.book.keeping.bookkeeping.entity.BookUserAccount;
import com.book.keeping.bookkeeping.entity.reflect.BookUserAccountDTO;
import org.apache.ibatis.annotations.Param;

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
    int deleteUserAccount(@Param("id")int id,@Param("userId") String userId);

    /**
     * 功能描述:查询用户下所有账户
     * @author zhang.penghao
     * @param userId 用户ID
     * @date 2019/11/18
     * @return {@link BookUserAccountDTO}
     */
    List<BookUserAccountDTO> listUserAccount(String userId);

}