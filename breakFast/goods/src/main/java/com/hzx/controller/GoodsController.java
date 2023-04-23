package com.hzx.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequestMapping("/goods")
public class GoodsController {

    @ResponseBody
    @RequestMapping("/getGoodsList")
    public String getGoodsList(){
        System.out.println("获取商品列表信息");
        return "获取商品列表信息";
    }
}
