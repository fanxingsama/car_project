package org.example.dao;

import org.example.entities.Car;

import java.util.List;

/**
 * @description <功能描述>
 * @author: 马云龙
 * @Date: 2024/1/12 16:40
 */
public interface CarDao {
    public List<Car> getAllCar();
    public Car getCarInfo(Integer carId);
}
