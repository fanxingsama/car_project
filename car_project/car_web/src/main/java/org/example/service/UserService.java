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

    public int register(User user){
//        核验这个用户的身份证号或者用户名是否已经在数据库中出现了
        User user_1 = userMapper.checkUserById(user.getUserIDNumber());
        User user_2 = userMapper.checkUserByAccountName(user.getAccountName());
        if (user_1 == null && user_2 == null){
            return userMapper.accountRegister(user);
        }else {
            return 0;
        }
    }

    public int login(User user){
        String password = userMapper.getUserPassword(user.getAccountName());
        if (Objects.equals(password, user.getPassword())){
            return 1;
        }else {
            return 0;
        }
    }

    public User getUserInfo(User user){
        return userMapper.getUserInfo(user.getAccountName());
    }

    public int changeUserInfo(User user){
        return userMapper.changeUserInfo(user);
    }


}
