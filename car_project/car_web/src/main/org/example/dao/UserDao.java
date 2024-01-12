package org.example.dao;

import org.example.entities.User;

import java.util.List;

/**
 * @description <功能描述>
 * @author: 马云龙
 * @Date: 2024/1/12 10:42
 */
public interface UserDao {
    public int accountRegister(User user);

    public int accountLogin();

    public int changeUserInfo();

    public User getUserInfo(String account);

    public int checkUser(String IDNumber);

    public List<User> getAllUserInfo();

}
