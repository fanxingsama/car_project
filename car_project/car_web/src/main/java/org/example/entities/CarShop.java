package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 马云龙
 * @create 2024-02-24 10:00
 * @description 汽车4s店的pojo
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarShop {
    private Integer id;
    private String shopName;
    private String address;
    private String phone;
}
