package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.entities.MaintainOrder;
import org.example.entities.PurchaseOrder;
import org.example.entities.RepairOrder;

import java.util.List;

/**
 * @description <功能描述>
 * @author: 马云龙
 * @Date: 2024/1/12 16:24
 */
@Mapper
public interface OrderMapper {
    public int insertPurchaseOrder(PurchaseOrder purchaseOrder);
    public int insertMaintainOrder(MaintainOrder maintainOrder);
    public int insertRepairOrder(RepairOrder repairOrder);
    public List<PurchaseOrder> getAllPurchaseOrder(String Account);
    public List<MaintainOrder> getAllMaintainOrder(String Account);
    public List<RepairOrder> getAllRepairOrder(String Account);
    public PurchaseOrder getPurchaseOrder(Integer orderID);
    public PurchaseOrder getMaintainOrder(Integer orderID);
    public PurchaseOrder getRepairOrder(Integer orderID);
}
