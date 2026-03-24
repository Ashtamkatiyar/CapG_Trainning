package com.example.orders.entity;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;

public class EntityMapper {

    public static OrderEntity dtoToEntityConverter(OrderRequestDTO request){
        OrderEntity order = new OrderEntity();
        order.setCustomerName(request.getCustomerName());
        order.setEmail(request.getEmail());
        order.setProductName(request.getProductName());
        order.setQuantity(request.getQuantity());
        order.setPricePerUnit(request.getPricePerUnit());
        return order;
    }

    public static OrderRequestDTO EntityToOrderRequestDtoConverter(OrderEntity orderEntity){
        return new OrderRequestDTO(
                orderEntity.getCustomerName(),
                orderEntity.getEmail(),
                orderEntity.getProductName(),
                orderEntity.getQuantity(),
                orderEntity.getPricePerUnit()
        );
    }

    public static OrderResponseDTO EntityToOrderResponseDtoConverter(OrderEntity orderEntity){
        if(orderEntity==null) return null;
        OrderResponseDTO dto = new OrderResponseDTO(
                orderEntity.getCustomerName(),
                orderEntity.getEmail(),
                orderEntity.getProductName(),
                orderEntity.getQuantity(),
                orderEntity.getPricePerUnit(),
                orderEntity.getTotalAmount()
        );
        dto.setOrderId(orderEntity.getId());
        return dto;
    }
}