package com.upiiz.Practica_IV.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderModelLibro {
    private int id;
    private Date date;
    private CustomerModel customer;
    private List<OrderLineModelLibro> orderLines;

    public OrderModelLibro() {

    }
    public OrderModelLibro(int id, Date date, CustomerModel customer, List<OrderLineModelLibro> orderLine) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.orderLines = new ArrayList<OrderLineModelLibro>();
        this.orderLines.addAll(orderLine);
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

    public List<OrderLineModelLibro> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLineModelLibro> orderLines) {
        this.orderLines = orderLines;
    }
    public void addOrderLine(OrderLineModelLibro orderLine) {
        this.orderLines.add(orderLine);
    }
}