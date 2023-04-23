package com.hzx.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/getOrderist")
    public void getOrderist(){
        System.out.println("获取订单列表信息");
    }
}
