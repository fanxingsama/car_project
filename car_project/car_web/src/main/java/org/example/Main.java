package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 马云龙
 * @create 2024-01-13 20:02
 */

@SpringBootApplication
//@MapperScan("org.example.dao")
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

    }
}