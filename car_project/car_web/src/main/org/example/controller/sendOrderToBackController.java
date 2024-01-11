package org.example.controller;

import org.common.entities.CommonResult;
import org.example.entities.CarOrder;

import org.springframework.web.client.RestTemplate;


/**
 * @description  将订单信息发送给后台
 * @author: 马云龙
 * @Date: 2024/1/11 14:51
 */

public class sendOrderToBackController
{
    public static final String BACK_URL = "https://localhost:8081";

    private RestTemplate restTemplate;

    public CommonResult<CarOrder>

}
