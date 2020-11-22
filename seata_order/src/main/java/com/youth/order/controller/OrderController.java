package com.youth.order.controller;

import com.youth.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/createOrder")
    public boolean createOrder(){
        boolean order = orderService.createOrder();
        return order;
    }
}
