package org.example.controller;

import org.common.entities.CommonResult;
import org.example.entities.Car;
import org.example.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description 汽车方面前端功能的转接
 * @author: 马云龙
 * @Date: 2024/1/12 16:22
 */

@RestController
@RequestMapping("Car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/getCarByUser")
    public CommonResult getAllCar(Integer userId){
        List<Car> cars = carService.getCarByUser(userId);
        if (cars != null){
            return new CommonResult(200, "用户汽车数据返回成功", cars);
        }else {
            return new CommonResult(400, "用户暂时没有汽车", null);
        }
    }

    @PostMapping("/getCarInfo")
    public CommonResult getCarInfo(Integer carId){
        Car car_ = carService.getCarInfo(carId);
        return new CommonResult(200, "汽车数据返回成功", car_);
    }

    @PostMapping("/getCarByType")
    public CommonResult getCarByType(String carType){
        List<Car> cars = carService.getCarByType(carType);
        return new CommonResult(200, "汽车数据返回成功", cars);
    }

    @PostMapping("/getCarByColor")
    public CommonResult getCarByColor(@RequestBody Car car){
        Car car_ = carService.getCarInfoByColor(car);
        return new CommonResult(200, "汽车数据返回成功", car_);
    }

    @PostMapping("/getCarByLevel")
    public CommonResult getCarByLevel(@RequestBody Car car){
        Car car_ = carService.getCarInfoByLevel(car);
        return new CommonResult(200, "汽车数据返回成功", car_);
    }

}
