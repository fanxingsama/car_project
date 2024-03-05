package org.example.controller;

import org.common.entities.CommonResult;
import org.example.entities.Car;
import org.example.entities.CarOrder;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 马云龙
 * @create 2024-01-19 16:05
 * @description
 */
@RestController
@RequestMapping("Order")
public class OrderController {

    @Autowired
    OrderService orderService;

//    @GetMapping("/getPurchaseOrder")
//    public CommonResult getAllPurchaseOrder(Integer userId){
//        List<CarOrder> order = orderService.getAllPurchaseOrder(userId);
//        return new CommonResult(200, "汽车购买数据返回成功", order);
//    }
//
//    @GetMapping("/getRepairOrder")
//    public CommonResult getAllRepairOrder(Integer userId){
//        List<CarOrder> order = orderService.getAllRepairOrder(userId);
//        return new CommonResult(200, "汽车维修数据返回成功", order);
//    }
//
//    @GetMapping("/getMaintainOrder")
//    public CommonResult getAllMaintainOrder(Integer userId){
//        List<CarOrder> order = orderService.getAllMaintainOrder(userId);
//        return new CommonResult(200, "汽车保养数据返回成功", order);
//    }
//
    @GetMapping("/getOrderInfo")
    public CommonResult getOrderInfo(Integer orderId){
        CarOrder order = orderService.getOrderInfo(orderId);
        return new CommonResult(200, "汽车订单详细数据返回成功", order);
    }

    @GetMapping("/getOrder")
    public CommonResult getOrder(Integer userId, String action){
        switch (action){
            case "purchase":
                List<CarOrder> order_1 = orderService.getAllPurchaseOrder(userId);
                return new CommonResult(200, "汽车购买订单数据返回成功", order_1);
            case "repair":
                List<CarOrder> order_2 = orderService.getAllRepairOrder(userId);
                return new CommonResult(200, "汽车维修订单数据返回成功", order_2);
            case "maintain":
                List<CarOrder> order_3 = orderService.getAllMaintainOrder(userId);
                return new CommonResult(200, "汽车保养订单数据返回成功", order_3);
            default:
                return new CommonResult(400, "汽车订单数据返回失败", null);
        }
    }

    @PostMapping("/insertOrder")
    public CommonResult insertOrder(Integer userId, Integer carId, Integer shopId, Integer salesManId, String action){
        int result = orderService.insertOrder(userId, carId, shopId, salesManId, action);
        return new CommonResult(200, "数据插入成功", result);
    }

}
