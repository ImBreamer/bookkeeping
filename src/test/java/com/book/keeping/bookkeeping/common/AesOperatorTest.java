package com.book.keeping.bookkeeping.common;

import com.book.keeping.bookkeeping.entity.reflect.BookUserTagDTO;
import com.book.keeping.bookkeeping.utils.GlobalIdUtil;
import com.book.keeping.bookkeeping.utils.TokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author chen.hailin
 * @version V1.0
 * @date 2019/3/21 13:46
 */
@Slf4j
public class AesOperatorTest {

    public static void main(String[] args) throws Exception {
//        String s = GlobalIdUtil.nextId();
//        String token = TokenUtil.createToken(String.valueOf(s));
//        log.info("{}", s);
//           log.info(token);
//        log.info(TokenUtil.getUserId(token));

       String s = "/book/user/wx/info,/book/test/set,/book/test/get";
       List<String> set =  Arrays.asList(s.trim().split(","));
       for(String ss : set){
           log.info(ss);
       }
       log.info("{}",set.contains("/book/test/set"));
        BookUserTagDTO.builder().build();

    }
}
