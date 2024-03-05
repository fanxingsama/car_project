package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 马云龙
 * @create 2024-01-06 15:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String userName;
    private String accountName; // 用户名
    private String password;
    private String phone;
    private String address;
    private String userIDNumber; // 身份证号
    private String bandIDNumber; // 银行卡号
}
