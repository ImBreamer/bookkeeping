package com.book.keeping.bookkeeping.common.validation.constraints;

import com.book.keeping.bookkeeping.common.validation.validator.PhoneValidationValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 自定义手机号参数验证
 * @author zhang.penghao
 * @date 2018/12/11 13:44
 */
@Documented
@Constraint(
        validatedBy = PhoneValidationValidator.class
)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneValidation {

    String message() default "手机号不规则";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
