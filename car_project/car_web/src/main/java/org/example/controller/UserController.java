package org.example.controller;

import org.common.entities.CommonResult;
import org.example.entities.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 马云龙
 * @Date: 2024/1/12 10:33
 */

@RestController
@RequestMapping("User")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public CommonResult register(@RequestBody User user){
        int result = userService.register(user);
        if (result > 0){
            return new CommonResult(200, "用户注册成功", null);
        }else {
            return new CommonResult(444, "用户注册失败，身份证或者用户名重复", null);
        }
    }

    @PostMapping("/login")
    public CommonResult login(@RequestBody User user){
        int result = userService.login(user);
        if (result > 0){
            return new CommonResult(200, "用户登录成功", null);
        }else {
            return new CommonResult(444, "账户错误或者密码错误", null);
        }
    }

    @GetMapping("/userInfo")
    public CommonResult getUserInfo(@RequestBody User user){
        User user_ = userService.getUserInfo(user);
        return new CommonResult(200, "获取用户数据成功", user_);
    }

    @PostMapping("chageUserInfo")
    public CommonResult changeUserInfo(@RequestBody User user){
        userService.changeUserInfo(user);
        return new CommonResult(200, "用户数据修改成功", null);
    }
}