package com.hiberus.techtest.controller;

import com.hiberus.techtest.entity.Order;
import com.hiberus.techtest.entity.Product;
import com.hiberus.techtest.entity.SubOrder;
import com.hiberus.techtest.request.OrderRequest;
import com.hiberus.techtest.response.DetailOrderResponse;
import com.hiberus.techtest.response.LogisticResponse;
import com.hiberus.techtest.response.OrderResponse;
import com.hiberus.techtest.service.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(path = "/api/order")
public class OrderController {

    private Logger logger = LogManager.getLogger(OrderController.class);

    @Autowired
    BillService billService;

    @Autowired
    LogisticService logisticService;

    @Autowired
    OrderService orderService;

    @Autowired
    SubOrderService subOrderService;

    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity createOrder(@Validated @RequestBody OrderRequest orderRequest) {

        double total = billService.createBilling(orderRequest.getProducts());
        LogisticResponse logisticResponse = logisticService.createShipping(orderRequest);
        Random r = new Random();
        OrderResponse orderResponse = new OrderResponse(total, logisticResponse.getNumGuide(), logisticResponse.getStatus(), r.nextInt((900000 - 100000) + 1) + 100000);

        return ResponseEntity.ok(orderResponse);
    }

    @PostMapping("/db")
    public ResponseEntity createOrderDb(@Validated @RequestBody OrderRequest orderRequest) {

        double total = billService.createBilling(orderRequest.getProducts());
        LogisticResponse logisticResponse = logisticService.createShipping(orderRequest);

        Random r = new Random();
        int numOrder = r.nextInt((900000 - 100000) + 1) + 100000;

        Order order = new Order();
        order.setAddress(orderRequest.getAddress());
        order.setDateOrder(orderRequest.getDate());
        order.setNumOrder(numOrder);
        order.setNumShipping(logisticResponse.getNumGuide());
        order.setTotalOrder(total);
        order.setId(orderService.createOrder(order));

        List<DetailOrderResponse> details = new ArrayList<>();

        orderRequest.getProducts().forEach(product -> {
            if (productService.getProduct((long) (product.getId())).isPresent()) {
                DetailOrderResponse detail = new DetailOrderResponse();
                Product productE = productService.getProduct((long) (product.getId())).get();
                SubOrder subOrder = new SubOrder();
                subOrder.setOrder(order);
                subOrder.setProduct(productE);
                subOrder.setQuantity(product.getQuantity());
                subOrderService.createSubOrder(subOrder);
                detail.setNameProduct(productE.getName());
                detail.setQuantity(subOrder.getQuantity());
                detail.setTotal(product.getCost() * product.getQuantity());
                details.add(detail);
            }
        });

        OrderResponse orderResponse = new OrderResponse(total, logisticResponse.getNumGuide(), logisticResponse.getStatus(), numOrder, details);

        return ResponseEntity.ok(orderResponse);
    }

}
