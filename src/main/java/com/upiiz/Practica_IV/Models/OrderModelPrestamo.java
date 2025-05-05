package com.upiiz.Practica_IV.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderModelPrestamo {
    private int id;
    private Date date;
    private CustomerModel customer;
    private List<OrderLineModelPrestamo> orderLines;

    public OrderModelPrestamo() {

    }
    public OrderModelPrestamo(int id, Date date, CustomerModel customer) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.orderLines = new ArrayList<>();
        this.orderLines.addAll(orderLines);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CustomerModel getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerModel customer) {
        this.customer = customer;
    }

    public List<OrderLineModelPrestamo> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLineModelPrestamo> orderLines) {
        this.orderLines = orderLines;
    }
}