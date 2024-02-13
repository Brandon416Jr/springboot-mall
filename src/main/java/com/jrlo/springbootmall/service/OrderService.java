package com.jrlo.springbootmall.service;

import com.jrlo.springbootmall.dto.CreateOrderRequest;
import com.jrlo.springbootmall.dto.OrderQueryParams;
import com.jrlo.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
