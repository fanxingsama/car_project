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
public class RepairOrder {
    private Integer id;
    private Integer carId;
    private Integer userId;
    private Integer shopId; // 4s店的id
    private Integer repairPrice;
    private String carType;
    private String carName;
    private String DamageCondition; // 汽车受损情况
    private String userPhone;
    private String userName;
    private String userID;
    private String shopName; // 4s店的名字
    private String shopAddress; // 4s店的地址
    private String shopPhone; // 4s店的电话
    private String creatTime;
    private String endTime;
    private String orderType; // 当前订单的状态,等待订单接收/订单处理中/车辆维修中/车辆维修完成/订单完成
}
