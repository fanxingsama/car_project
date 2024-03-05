package org.example.service;

import org.example.dao.CarMapper;
import org.example.dao.OrderMapper;
import org.example.entities.Car;
import org.example.entities.CarOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @description <功能描述>
 * @author: 马云龙
 * @Date: 2024/2/27 11:12
 */
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private CarService carService;

    public int insertOrder(Integer userId, Integer carId, Integer shopId, Integer salesManId, String action){

        Map<String, Object> params = new HashMap<>();
        params.put("userId", userId);
        params.put("carId",carId);
        params.put("shopId",shopId);
        params.put("salesManId",salesManId);
        params.put("action", action);

        LocalDateTime time_ = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");   // 设置日期时间的格式
        String creatTime = time_.format(formatter);   // 格式化当前日期时间
        params.put("creatTime", creatTime);

        String orderType = "进行中";
        params.put("orderType", orderType);
        if (Objects.equals(action, "purchase")){
            Car car_1 = carService.getCarInfo(carId);
            Integer price_1 = car_1.getPrice();
            params.put("price", price_1);
        }else {
            Car car_2 = carService.getCarInfo(carId);
            Integer price_2 = carService.getCarServicePrice(car_2.getCarType(), action);
            params.put("price", price_2);
        }
        return orderMapper.insertOrder(params);
    }
    public List<CarOrder> getAllPurchaseOrder(Integer userId){
        return orderMapper.getAllPurchaseOrder(userId);
    }

    public List<CarOrder> getAllRepairOrder(Integer userId){
        return orderMapper.getAllRepairOrder(userId);
    }

    public List<CarOrder> getAllMaintainOrder(Integer userId){
        return orderMapper.getAllMaintainOrder(userId);
    }

    public CarOrder getOrderInfo(Integer orderId){
        return orderMapper.getOrderInfo(orderId);
    }

}
