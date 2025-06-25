package com.example.springboot_mall.service;

import com.example.springboot_mall.dto.CreateOrderRequest;
import com.example.springboot_mall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
