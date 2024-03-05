package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.entities.Car;
import org.example.entities.User;

import java.util.List;
import java.util.Map;

/**
 * @description <功能描述>
 * @author: 马云龙
 * @Date: 2024/1/12 16:40
 */
@Mapper
public interface CarMapper {
    public List<Car> getCarByType(String type); // 获取这个类型下所有的车辆信息
    public List<Car> getCarByUser(Integer userId); // 获取用户旗下的所有车
    public Car getCarInfo(Integer carId); // 获取这个车的详细信息
    public Car getCarInfoByColor(Car car);
    public Car getCarInfoByLevel(Car car);
    public Integer getCarServicePrice(Map<String , Object> serviceObj);

}
