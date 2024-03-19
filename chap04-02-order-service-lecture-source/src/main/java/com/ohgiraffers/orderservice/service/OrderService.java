package com.ohgiraffers.orderservice.service;

import com.ohgiraffers.orderservice.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    List<OrderDTO> getUserOrder(String userId);
}
