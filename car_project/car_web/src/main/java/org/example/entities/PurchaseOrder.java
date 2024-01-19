package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description <功能描述>
 * @author: 马云龙
 * @Date: 2024/1/12 16:29
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrder {
    private Integer id;
    private Integer carId;
    private Integer userId;
    private Integer shopId; // 4s店的id
    private Integer repairPrice;
    private String carType;
    private String carName;
    private String userPhone;
    private String userName;
    private String userID;
    private String shopName; // 4s店的名字
    private String shopAddress; // 4s店的地址
    private String shopPhone; // 4s店的电话
    private String creatTime;
    private String endTime;
    private String orderType;
}
