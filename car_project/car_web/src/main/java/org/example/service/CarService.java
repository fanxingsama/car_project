package org.example.service;

//import org.example.dao.CarDao;
import org.example.dao.CarMapper;
import org.example.entities.Car;

import org.example.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 马云龙
 * @create 2024-01-13 20:02
 */
@Service
public class CarService {

    @Autowired
    private CarMapper carMapper;

    public List<Car> getCarByType(String type){
        return carMapper.getCarByType(type);
    }

    public List<Car> getCarByUser(Integer userId){
        return carMapper.getCarByUser(userId);
    }

    public Car getCarInfo(Integer carId){
        return carMapper.getCarInfo(carId);
    }

    public Car getCarInfoByColor(Car car){
        return carMapper.getCarInfoByColor(car);
    }

    public Car getCarInfoByLevel(Car car){
        return carMapper.getCarInfoByLevel(car);
    }

    public Integer getCarServicePrice(String carType, String action){
        Map<String, Object> params = new HashMap<>();
        params.put("carType", carType);
        params.put("action",action);
        return carMapper.getCarServicePrice(params);
    }
}
