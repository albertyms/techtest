package com.hiberus.techtest.response;

import java.util.Objects;

public class LogisticResponse {
    private int numGuide;
    private String address;
    private String status;
    private Long idClient;

    public LogisticResponse() {
    }

    public int getNumGuide() {
        return numGuide;
    }

    public void setNumGuide(int numGuide) {
        this.numGuide = numGuide;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }
}
