package com.book.keeping.bookkeeping.common.validation.constraints;

import com.book.keeping.bookkeeping.common.validation.validator.ParamBlankValidationValidator;

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
        validatedBy = ParamBlankValidationValidator.class
)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface  ParamBlankValidation {

    String message() default "参数格式错误";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
