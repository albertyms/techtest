package com.hiberus.techtest.request;

import javax.validation.constraints.NotNull;

public class ProductOrderRequest {
    @NotNull(message = "id product not null")
    private int id;
    @NotNull(message = "quantity not null")
    private int quantity;
    @NotNull(message = "cost not null")
    private double cost;

    public ProductOrderRequest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
