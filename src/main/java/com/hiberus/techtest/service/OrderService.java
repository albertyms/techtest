package com.hiberus.techtest.service;

import com.hiberus.techtest.entity.Order;
import com.hiberus.techtest.repository.OrderRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {
    private Logger logger = LogManager.getLogger(OrderService.class);

    @Autowired
    OrderRepository orderRepository;

    public Long createOrder(Order order){
        try {
            return orderRepository.save(order).getId();
        } catch (Exception e) {
            logger.error("Error:", e);
            return null;
        }
    }


}
