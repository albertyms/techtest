package com.hiberus.techtest.request;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class OrderRequest {
    @NotNull(message = "ID Client cannot be null")
    private Long clientId;
    @NotNull(message = "Address cannot be null")
    private String address;
    @NotNull(message = "Date cannot be null.")
    private Date date;
    @NotNull(message = "The product cannot be null")
    private List<ProductOrderRequest> products;

    public OrderRequest() {
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<ProductOrderRequest> getProducts() {
        return products;
    }

    public void setProducts(List<ProductOrderRequest> products) {
        this.products = products;
    }
}
