package com.hzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class GoodsApplication
{
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
        System.out.println("*********************** Goods服务启动成功 ***********************");
    }
}
