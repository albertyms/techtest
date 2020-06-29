package com.hiberus.techtest.response;

import java.util.List;

public class OrderResponse {
    private int numOrder;
    private double totalOrder;
    private int numShippingGuide;
    private String statusShipping;
    private List<DetailOrderResponse> detailOrderResponse;

    public OrderResponse(double totalOrder, int numShippingGuide, String statusShipping, int numOrder) {
        this.totalOrder = totalOrder;
        this.numShippingGuide = numShippingGuide;
        this.statusShipping = statusShipping;
        this.numOrder = numOrder;
    }

    public OrderResponse(double totalOrder, int numShippingGuide, String statusShipping, int numOrder, List<DetailOrderResponse> detailOrderResponse) {
        this.totalOrder = totalOrder;
        this.numShippingGuide = numShippingGuide;
        this.statusShipping = statusShipping;
        this.numOrder = numOrder;
        this.detailOrderResponse = detailOrderResponse;
    }

    public int getNumOrder() {
        return numOrder;
    }

    public void setNumOrder(int numOrder) {
        this.numOrder = numOrder;
    }

    public double getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(double totalOrder) {
        this.totalOrder = totalOrder;
    }

    public double getNumShippingGuide() {
        return numShippingGuide;
    }

    public void setNumShippingGuide(int numShippingGuide) {
        this.numShippingGuide = numShippingGuide;
    }

    public String getStatusShipping() {
        return statusShipping;
    }

    public void setStatusShipping(String statusShipping) {
        this.statusShipping = statusShipping;
    }

    public List<DetailOrderResponse> getDetailOrderResponse() {
        return detailOrderResponse;
    }

    public void setDetailOrderResponse(List<DetailOrderResponse> detailOrderResponse) {
        this.detailOrderResponse = detailOrderResponse;
    }
}
