package org.example.service;

//import org.example.dao.CarDao;
import org.example.dao.CarMapper;
import org.example.entities.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 马云龙
 * @create 2024-01-13 20:02
 */
@Service
public class CarService {

    @Autowired
    private CarMapper carMapper;

    public String test(){
        List<Car> list= carMapper.getAllCar();
        return "list";
    }
}
