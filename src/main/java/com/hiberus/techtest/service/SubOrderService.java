package com.hiberus.techtest.service;

import com.hiberus.techtest.entity.SubOrder;
import com.hiberus.techtest.repository.SubOrderRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SubOrderService {
    private Logger logger = LogManager.getLogger(SubOrderService.class);

    @Autowired
    SubOrderRepository subOrderRepository;

    public SubOrder createSubOrder(SubOrder subOrder){
        return subOrderRepository.save(subOrder);
    }
}
