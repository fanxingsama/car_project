package org.example.controller;

import org.common.entities.CommonResult;
import org.example.entities.Car;
import org.example.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description 汽车方面前端功能的转接
 * @author: 马云龙
 * @Date: 2024/1/12 16:22
 */

@RestController
@RequestMapping("User")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/test")
    public CommonResult getAllCar(){
        return new CommonResult(200, "插入数据成功", "good");
    }

}
