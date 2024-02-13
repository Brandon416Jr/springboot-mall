package com.jrlo.springbootmall.service;

import com.jrlo.springbootmall.dto.CreateOrderRequest;
import com.jrlo.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
