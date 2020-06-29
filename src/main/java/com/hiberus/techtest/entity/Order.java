package com.hiberus.techtest.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order", schema="public")
public class Order {

    @GenericGenerator(
            name = "orderGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "orders_sequence"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1"),
            }
    )

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "orderGenerator")
    private Long id;
    @Column(name = "num_order")
    private int numOrder;
    @Column(name = "total_order")
    private double totalOrder;
    @Column(name = "address")
    private String address;
    @Column(name = "date_order")
    private Date dateOrder;
    @Column(name = "num_shipping")
    private int numShipping;

    public Order() {
    }

    public Order(Long id, int numOrder, double totalOrder, String address, Date dateOrder, int numShipping) {
        this.id = id;
        this.numOrder = numOrder;
        this.totalOrder = totalOrder;
        this.address = address;
        this.dateOrder = dateOrder;
        this.numShipping = numShipping;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public int getNumShipping() {
        return numShipping;
    }

    public void setNumShipping(int numShipping) {
        this.numShipping = numShipping;
    }

}
