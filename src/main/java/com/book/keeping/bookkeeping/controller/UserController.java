package com.book.keeping.bookkeeping.controller;

import com.book.keeping.bookkeeping.common.exception.TokenInvalidException;
import com.book.keeping.bookkeeping.common.result.Result;
import com.book.keeping.bookkeeping.config.http.HttpService;
import com.book.keeping.bookkeeping.entity.KeepingBook;
import com.book.keeping.bookkeeping.entity.User;
import com.book.keeping.bookkeeping.entity.reflect.UserMonthDayBook;
import com.book.keeping.bookkeeping.service.UserService;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制层
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2019/11/7
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final String APP_ID = "wx6553d8ca833c75af";
    private final String SECRET_ID = "c5cceae911489c4d691d52ecf746ccba";

    @Autowired
    UserService userService;

    @Autowired
    HttpService httpService;

    @GetMapping
    public Result listUser( String userId, Integer page, Integer pageSize) {
//        if(true){
//            throw new TokenInvalidException();
//        }
        log.info(userId + "***************************");
        return Result.success(userService.listUser(page, pageSize));
    }

    @GetMapping("/wx/info")
    public String checkWinXinInfo(String jsCode) throws Exception {
        String uri = "https://api.weixin.qq.com/sns/jscode2session?appid=" + APP_ID
                + "&secret=" + SECRET_ID
                + "&grant_type=authorization_code&js_code="
                + jsCode;
        return httpService.doGet(uri);
    }
}


