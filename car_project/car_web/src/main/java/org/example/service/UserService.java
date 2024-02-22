package org.example.service;

import org.common.entities.CommonResult;
import org.example.dao.UserMapper;
import org.example.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author 马云龙
 * @create 2024-01-17 17:43
 */

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public CommonResult register(User user){

//        核验这个用户的身份证号是否已经在数据库中出现了
        if (userMapper.checkUser(user.getIDNumber()) == null){
            int result = userMapper.accountRegister(user);
            return new CommonResult(200, "插入数据成功", result);
        }else {
//
            return new CommonResult(444, "插入失败", null);
        }
    }

    public CommonResult login(User user){
        User user_ = userMapper.getUserInfo(user.getAccountName());
        if (Objects.equals(user_.getPassword(), user.getPassword())){
            return new CommonResult(200, "用户登录成功", null);
        }else {
            return new CommonResult(444, "密码错误", null);
        }
    }
}
