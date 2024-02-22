package org.example.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description 后端的不同HTTP端口之间访问需要通过RestTemplate
 * @author: 马云龙
 * @Date: 2024/1/11 14:51
 */

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //让这个RestTemplate在请求时拥有客户端负载均衡的能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}