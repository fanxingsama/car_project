package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.entities.Car;

import java.util.List;

/**
 * @description <功能描述>
 * @author: 马云龙
 * @Date: 2024/1/12 16:40
 */
@Mapper
public interface CarMapper {
    public List<Car> getAllCar(); // 获取所有的车辆信息
    public Car getCarInfo(Car car); // 获取这个车的详细信息

    public int buyCar(); // 用户购买车辆
}
