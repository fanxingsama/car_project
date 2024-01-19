package org.example.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @description <功能描述>
 * @author: 马云龙
 * @Date: 2024/1/12 10:33
 */

@RestController
@RequestMapping("User")
public class UserController {



//    @PostMapping("/register")
//    public CommonResult register(@RequestBody User user){
//
////        核验这个用户的身份证号是否已经在数据库中出现了
//        if (userDao.checkUser(user.getIDNumber()) == 0){
//            int result = userDao.accountRegister(user);
//            return new CommonResult(200, "插入数据成功", result);
//        }else {
////
//            return new CommonResult(444, "插入失败", null);
//        }
//    }
//
//    @GetMapping("/login")
//    public CommonResult login(@RequestBody User user){
//        User user_ = userDao.getUserInfo(user.getAccountName());
//        if (Objects.equals(user_.getPassword(), user.getPassword())){
//            return new CommonResult(200, "用户登录成功", null);
//        }else {
//            return new CommonResult(444, "密码错误", null);
//        }
//    }
}
