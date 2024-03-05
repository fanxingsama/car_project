package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.entities.*;

import java.util.List;
import java.util.Map;

/**
 * @description <功能描述>
 * @author: 马云龙
 * @Date: 2024/1/12 16:24
 */
@Mapper
public interface OrderMapper {
    public int insertOrder(Map<String, Object> Order);
    public List<CarOrder> getAllPurchaseOrder(Integer userId);  // 获取该用户所有的订单，包括购买，维修，保养
    public List<CarOrder> getAllRepairOrder(Integer userId);
    public List<CarOrder> getAllMaintainOrder(Integer userId);
    public CarOrder getOrderInfo(Integer orderID); // 获取单个订单的详细情况


}
