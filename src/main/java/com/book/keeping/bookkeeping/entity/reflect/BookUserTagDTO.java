package com.book.keeping.bookkeeping.entity.reflect;

import lombok.Builder;
import lombok.Data;

/**
 * 用户类目表实体类
 * @author zhang.penghao
 * @date 2019/11/18
 */
@Data
@Builder
public class BookUserTagDTO {
    /**
     * 类目ID
     */
    private Long tagId;

    /**
     * 类目名称
     */
    private String tagName;

    /**
     * 类目标识
     */
    private String tagIcon;

    /**
     * 类目类型
     */
    private Boolean tagType;

}