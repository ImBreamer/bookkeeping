package com.book.keeping.bookkeeping.common.validation.validator;

import com.book.keeping.bookkeeping.common.validation.constraints.EmailValidation;
import com.book.keeping.bookkeeping.utils.RegexUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 邮箱参数验证实现
 * @author zhang.penghao
 * @date 2018/12/11 14:17
 */
public class EmailValidationValidator implements ConstraintValidator<EmailValidation, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(value == null){
            return true;
        }
        if(value.trim().length() == 0){
            return false;
        }
        return RegexUtil.regexEmail(value);
    }
}
