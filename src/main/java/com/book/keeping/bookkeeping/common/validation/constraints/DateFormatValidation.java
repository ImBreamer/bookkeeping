package com.book.keeping.bookkeeping.common.validation.constraints;

import com.book.keeping.bookkeeping.common.validation.validator.DateFormatValidationValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 自定义非空字符串参数验证
 * @author zhang.penghao
 * @date 2018/12/11 16:34
 */
@Documented
@Constraint(
        validatedBy = DateFormatValidationValidator.class
)
@Target({ ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface  DateFormatValidation {

    String message() default "日期参数格式错误-(yyyy-MM-dd)";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}