package com.book.keeping.bookkeeping.common.validation.validator;

import com.book.keeping.bookkeeping.common.validation.constraints.DateFormatValidation;
import com.book.keeping.bookkeeping.utils.RegexUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 功能描述
 *
 * @author zhang.penghao
 * @date 2019/3/12 19:36
 */
public class DateFormatValidationValidator implements ConstraintValidator<DateFormatValidation, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(value == null){
            return true;
        }
        return RegexUtil.regexDate(value);
    }
}
