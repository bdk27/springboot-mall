package com.example.springboot_mall.service;

import com.example.springboot_mall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
