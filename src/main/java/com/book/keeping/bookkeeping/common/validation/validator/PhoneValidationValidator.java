package com.book.keeping.bookkeeping.common.validation.validator;

import com.book.keeping.bookkeeping.common.validation.constraints.PhoneValidation;
import com.book.keeping.bookkeeping.utils.RegexUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 手机号参数验证实现
 * @author zhang.penghao
 * @date 2018/12/11 14:17
 */
public class PhoneValidationValidator  implements ConstraintValidator<PhoneValidation, String> {

    @Override
    public void initialize(PhoneValidation constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(value == null || value.length() == 0){
            return true;
        }
        if(value.trim().length() == 0){
            return false;
        }
        return RegexUtil.regexPhone(value);
    }
}
