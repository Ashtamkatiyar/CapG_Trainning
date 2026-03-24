package com.example.orders.service;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.entity.EntityMapper;
import com.example.orders.entity.OrderEntity;
import com.example.orders.exception.OrderNotFoundException;
import com.example.orders.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orepo;

    public OrderServiceImpl(OrderRepository orepo) {
        this.orepo = orepo;
    }

    @Override
    public OrderEntity createOrder(OrderRequestDTO request) {
        OrderEntity orderEntity = EntityMapper.dtoToEntityConverter(request);

        Double total = orderEntity.getPricePerUnit() * orderEntity.getQuantity();
        orderEntity.setTotalAmount(total);

        return orepo.save(orderEntity);
    }

    @Override
    public OrderEntity getOrderById(Long id) {
     Optional<OrderEntity> op=orepo.findById(id);
     if(op.isPresent()){
         return op.get();
     }
     else throw new OrderNotFoundException();
    }

    @Override
    public void deleteOrder(Long id) {
        Boolean exists=orepo.existsById(id);
        if(exists){
             orepo.deleteById(id);
        }
        else throw new OrderNotFoundException();
    }
}
