package com.hiberus.techtest.service;

import com.hiberus.techtest.request.OrderRequest;
import com.hiberus.techtest.response.LogisticResponse;
import com.hiberus.techtest.util.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class LogisticService {
    private Logger logger = LogManager.getLogger(LogisticService.class);

    public LogisticResponse createShipping(OrderRequest orderRequest) {
        LogisticResponse logisticResponse = new LogisticResponse();
        try {
            logger.info("into al method createShipping");
            logisticResponse.setAddress(orderRequest.getAddress());
            logisticResponse.setIdClient(orderRequest.getClientId());
            Random r = new Random();
            logisticResponse.setNumGuide(r.nextInt((900000 - 100000) + 1) + 100000);
            logisticResponse.setStatus(Status.SENT.getAction());
            logger.info("Sent info in method createShipping");
            return logisticResponse;
        } catch (Exception e) {
            logger.error("Error:", e);
            return logisticResponse;
        }
    }

    public LogisticResponse createShippingDb(OrderRequest orderRequest) {
        LogisticResponse logisticResponse = new LogisticResponse();
        try {
            logger.info("into al method createShipping");
            logisticResponse.setAddress(orderRequest.getAddress());
            logisticResponse.setIdClient(orderRequest.getClientId());
            Random r = new Random();
            logisticResponse.setNumGuide(r.nextInt((900000 - 100000) + 1) + 100000);
            logisticResponse.setStatus(Status.SENT.getAction());
            logger.info("Sent info in method createShipping");
            return logisticResponse;
        } catch (Exception e) {
            logger.error("Error:", e);
            return logisticResponse;
        }
    }
}
