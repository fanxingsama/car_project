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
    private String username;
    private String accountName;
    private String password;
    private String phone;
    private String address;
    private String IDNumber;
    private String bandIDNumber;
}
