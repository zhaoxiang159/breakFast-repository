package com.hzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class OrderApplication
{
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
        System.out.println("*********************** Order服务启动成功 ***********************");
    }
}
