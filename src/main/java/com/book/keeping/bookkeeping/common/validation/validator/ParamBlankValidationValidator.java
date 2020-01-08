package com.book.keeping.bookkeeping.common.validation.validator;

import com.book.keeping.bookkeeping.common.validation.constraints.ParamBlankValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 自定义非空字符串参数验证实现
 * @author zhang.penghao
 * @date 2018/12/11 16:39
 */
public class ParamBlankValidationValidator implements ConstraintValidator<ParamBlankValidation, String> {
    @Override
    public void initialize(ParamBlankValidation constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(value == null){
            return true;
        }
        return value.length() != 0 && value.trim().length() != 0;
    }
}
