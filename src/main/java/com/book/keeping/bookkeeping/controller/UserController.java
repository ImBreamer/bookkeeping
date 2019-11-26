package com.book.keeping.bookkeeping.controller;

import com.book.keeping.bookkeeping.common.result.Result;
import com.book.keeping.bookkeeping.config.http.HttpService;
import com.book.keeping.bookkeeping.entity.User;
import com.book.keeping.bookkeeping.entity.parameter.WeiXinPostInfo;
import com.book.keeping.bookkeeping.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    UserService userService;

    @GetMapping
    public Result listUser( User user) {
//        if(true){
//            throw new TokenInvalidException();
//        }
        return Result.success(userService.listUser(1, 1));
    }

    @PostMapping
    public Result insertUser(String userId,@RequestBody User user) {
        user.setUserId(userId);
        return Result.success(userService.listUser(1, 1));
    }

    /**
     * 初次授权  获取 token 用信息
     *
     * 之后登陆 获取用户信息
     *
     * */
    @PostMapping("/wx/info")
    public Result checkWeiXinInfo(@RequestBody WeiXinPostInfo weiXinPostInfo) throws Exception {
        return userService.checkWeiXinInfo(weiXinPostInfo);
    }
}


