package com.book.keeping.bookkeeping.common.validation.constraints;

import com.book.keeping.bookkeeping.common.validation.validator.EmailValidationValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 自定义邮箱参数验证
 * @author zhang.penghao
 * @date 2018/12/11 13:44
 */
@Documented
@Constraint(
        validatedBy = EmailValidationValidator.class
)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailValidation {

    String message() default "邮箱不规则";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
