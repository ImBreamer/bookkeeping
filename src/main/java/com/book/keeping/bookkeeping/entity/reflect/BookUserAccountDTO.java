package com.book.keeping.bookkeeping.entity.reflect;

import lombok.Data;

/**
 * 用户类目表实体类
 * @author zhang.penghao
 * @date 2019/11/18
 */
@Data
public class BookUserAccountDTO {
    /**
     * 类目ID
     */
    private Long accountId;

    /**
     * 类目名称
     */
    private String accountName;

    /**
     * 类目类型
     */
    private Boolean accountType;

}