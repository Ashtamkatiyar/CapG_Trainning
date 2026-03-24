package com.example.orders.mapper;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;

public class OrderMapper {

    public static OrderEntity toEntity(OrderRequestDTO request) {
        OrderEntity e = new OrderEntity(request.getCustomerName(), request.getEmail(), request.getProductName(), request.getQuantity(), request.getPricePerUnit());
        return e;
    }

    public static OrderResponseDTO toResponseDTO(OrderEntity entity) {
        OrderResponseDTO dto = new OrderResponseDTO();
        return dto;
    }
}
