package com.hiberus.techtest.service;

import com.hiberus.techtest.entity.Product;
import com.hiberus.techtest.repository.ProductRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductService {
    private Logger logger = LogManager.getLogger(ProductService.class);

    @Autowired
    ProductRepository productRepository;

    public Optional<Product> getProduct(Long idProduct){
        return productRepository.findById(idProduct);
    }

}
