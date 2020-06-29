package com.hiberus.techtest.response;

import com.hiberus.techtest.entity.Order;

public class DetailOrderResponse {
    private String nameProduct;
    private int quantity;
    private double total;

    public DetailOrderResponse() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
