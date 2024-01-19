package org.example.entities;

public class CarOrder {
    private Integer id;
    private Integer car_id;
    private Integer user_id;
    private Integer shop_id; // 4s店的id
    private Integer car_price;
    private String car_type;
    private String car_name;
    private String user_phone;
    private String user_name;
    private String address;
    private String shop_name; // 4s店的名字
    private String shop_address; // 4s店的地址
    private String shop_phone; // 4s店的电话
    private String creat_time;
    private String end_time;
    private String order_type; // 当前订单的状态，等待订单接收/订单处理中/车辆准备中/车辆准备完成/车辆交付完成
}
