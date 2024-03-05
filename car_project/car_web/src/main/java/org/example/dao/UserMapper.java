package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.entities.User;

import java.util.List;

/**
 * @description <功能描述>
 * @author: 马云龙
 * @Date: 2024/1/12 10:42
 */
@Mapper
public interface UserMapper {
    public User getUserInfo(String AccountName);  //  获取用户所有信息
    public String getUserPassword(String account);  //  获取用户密码
    public int accountRegister(User user);   //    用户注册
    public User checkUserById(String IDNumber);  //  注册的时候查看是否有同一个身份证号的用户
    public User checkUserByAccountName(String AccountName);  //  注册的时候查看是否有同一个身份证号的用户
    public int changeUserInfo(User user);  // 修改用户信息
    public int changePassword(User user); // 修改用户密码

//    public List<User> getAllUserInfo();

}
