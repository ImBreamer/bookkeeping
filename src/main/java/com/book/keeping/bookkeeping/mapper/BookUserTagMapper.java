package com.book.keeping.bookkeeping.mapper;

import com.book.keeping.bookkeeping.common.BaseMapper;
import com.book.keeping.bookkeeping.entity.BookUserTag;
import com.book.keeping.bookkeeping.entity.reflect.BookUserTagDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户类目Mapper
 * @author zhang.penghao
 * @date 2019/11/18
 */
public interface BookUserTagMapper extends BaseMapper<BookUserTag> {
    /**
     * 功能描述:删除用户类目
     * @author zhang.penghao
     * @param id 账户ID
     * @param userId 用户ID
     * @date 2019/11/18
     * @return int
     */
    int deleteUserTag(@Param("id") int id,@Param("userId") String userId);

    /**
     * 功能描述:查询用户下所有账户
     * @author zhang.penghao
     * @param userId 用户ID
     * @date 2019/11/18
     * @return {@link BookUserTagDTO}
     */
    List<BookUserTagDTO> listUserTag(String userId);

}