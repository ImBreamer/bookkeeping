package com.book.keeping.bookkeeping.entity.reflect;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 功能描述: 饼图实体
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2020/1/10
 */
@Data
public class KeepingBookPieObject {

    /**
     * 饼图label -- 类目名称 月度名称 周度名称
     */
    private String name;

    /**
     * 饼图数据-- 账单汇总
     */
    private BigDecimal data;

    /**
     * 触发事件参数 -- 类目 月度 周度
     */
    private String paramKey;

    /**
     * 触发事件参数特殊标识
     */
    private String keyMark;


}
