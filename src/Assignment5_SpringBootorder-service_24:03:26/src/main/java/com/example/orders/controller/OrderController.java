package com.example.orders.controller;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.EntityMapper;
import com.example.orders.entity.OrderEntity;
import com.example.orders.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")

public class OrderController {
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    private OrderService orderService;


    @PostMapping
    public ResponseEntity<OrderResponseDTO> create(@Valid @RequestBody OrderRequestDTO request) {
        OrderEntity oe=orderService.createOrder(request);
        OrderResponseDTO orderResponseDTO=EntityMapper.EntityToOrderResponseDtoConverter(oe);
       return new ResponseEntity<>(orderResponseDTO,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponseDTO> getById(@PathVariable Long id) {
        OrderEntity oe=orderService.getOrderById(id);
        OrderResponseDTO orderResponseDTO=EntityMapper.EntityToOrderResponseDtoConverter(oe);
    	return  ResponseEntity.ok(orderResponseDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
           orderService.deleteOrder(id);
        return  ResponseEntity.ok("Order deleted successfully");
    }
}
