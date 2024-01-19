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
    public List<Car> getAllCar();
    public Car getCarInfo(Car car);
}
