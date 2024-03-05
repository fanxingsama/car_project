package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 马云龙
 * @Date: 2024/2/27 14:39
 * @description 汽车订单（购买、维修、保养）
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarOrder {
    private Integer id;
    private Integer carId;
    private String carType;
    private String carName;
    private Integer userId;
    private String userPhone;
    private String userName;
    private String userAddress;
    private Integer shopId; // 4s店的id
    private String shopName; // 4s店的名字
    private String shopAddress; // 4s店的地址
    private String shopPhone; // 4s店的电话
    private Integer salesManId; // 销售员id
    private String salesManName; // 销售员姓名
    private Integer price; // 订单价格
    private String action; // 枚举类包括 purchase, repair, maintain
    private String creatTime;
    private String endTime;
    private String orderType; // 当前订单的状态，等待订单接收/订单处理中/车辆准备中/车辆准备完成/车辆交付完成
}
