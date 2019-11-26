package com.book.keeping.bookkeeping.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.book.keeping.bookkeeping.common.result.Result;
import com.book.keeping.bookkeeping.common.result.ResultEnum;
import com.book.keeping.bookkeeping.config.http.HttpService;
import com.book.keeping.bookkeeping.entity.User;
import com.book.keeping.bookkeeping.entity.parameter.WeiXinPostInfo;
import com.book.keeping.bookkeeping.mapper.UserMapper;
import com.book.keeping.bookkeeping.service.UserService;
import com.book.keeping.bookkeeping.utils.GlobalIdUtil;
import com.book.keeping.bookkeeping.utils.TokenUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2019/11/7
 */
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {
    private final String APP_ID = "wx6553d8ca833c75af";
    private final String SECRET_ID = "c5cceae911489c4d691d52ecf746ccba";
    private final UserMapper userMapper;
    private final HttpService httpService;

    /**
     * @see UserService#listUser(Integer, Integer)
     * */
    @Override
    public PageInfo<User> listUser(Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List<User> users =  userMapper.selectAll();
        return new PageInfo<>(users);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public Result checkWeiXinInfo(WeiXinPostInfo weiXinPostInfo)  throws Exception {
        String uri = "https://api.weixin.qq.com/sns/jscode2session?appid=" + APP_ID
                + "&secret=" + SECRET_ID
                + "&grant_type=authorization_code&js_code="
                + weiXinPostInfo.getJsCode();
        JSONObject result  = (JSONObject)JSON.parse(httpService.doGet(uri));
        log.info(weiXinPostInfo.toString());
        log.info(result.toString());
        if(result.getInteger("errcode") == null){
            User user = new User();
            user.setOpenId(result.getString("openid"));
            List<User> userList = userMapper.select(user);
            if(userList.size() > 0){
                user = userList.get(0);
            }else{
                String userId = GlobalIdUtil.nextId();
                user.setNickName(weiXinPostInfo.getNickName());
                user.setUserId(userId);
                user.setOpenId(result.getString("openid"));
                user.setFaceImage(weiXinPostInfo.getAvatarUrl());
                user.setPassword(DigestUtils.sha1Hex(userId.substring(0,8)));
                user.setStatus(0);
            }
            if(userMapper.insert(user) > 0){
                result.put("userId", user.getUserId());
                result.put("token", TokenUtil.createToken(user.getUserId()));
                return Result.success(result);
            }else{
                return Result.error(ResultEnum.FAIL_ERROR_PARAM);
            }
        }else{
            return Result.error(result.getInteger("errcode"), result.getString("errmsg"));
        }
    }

}
