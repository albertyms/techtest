package com.hiberus.techtest.service;

import com.hiberus.techtest.request.ProductOrderRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BillService {
    private Logger logger = LogManager.getLogger(BillService.class);

    public double createBilling(List<ProductOrderRequest> products) {
        double total = 0;
        try {
            total = products.stream().mapToDouble(product -> product.getCost() * product.getQuantity()).sum();
            return total;
        } catch (Exception e) {
            logger.error("Error:", e);
            return total;
        }
    }

    private double createBillingDb(List<ProductOrderRequest> products) {
        double total = 0;
        try {
            total = products.stream().mapToDouble(product -> product.getCost() * product.getQuantity()).sum();
            return total;
        } catch (Exception e) {
            logger.error("Error:", e);
            return total;
        }
    }

}
