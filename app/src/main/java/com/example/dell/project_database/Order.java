package com.example.dell.project_database;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by dell on 12/8/2017.
 */

public class Order implements MyClasses{
    private long orderID;
    private Date orderDate;
    private Date orderDueDate;
    private boolean voidInd = false;
    private Customer customer;//TODO: must be checked [we may need customerID only]
    private ArrayList<Product> products;


    public Order(Date orderDate, Date orderDueDate, boolean voidInd, Customer customer) {
        this.orderDate = orderDate;
        this.orderDueDate = orderDueDate;
        this.voidInd = voidInd;
        this.customer = customer;
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        orderID = orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        orderDate = orderDate;
    }

    public Date getOrderDueDate() {
        return orderDueDate;
    }

    public void setOrderDueDate(Date dueDate) {
        orderDueDate = dueDate;
    }


    public boolean isVoidInd() {
        return voidInd;
    }

    public void setVoidInd(boolean voidInd) {
        this.voidInd = voidInd;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderDate=" + orderDate +
                ", orderDueDate=" + orderDueDate +
                ", voidInd=" + voidInd +
                ", customer=" + customer +
                ", products=" + products +
                '}';
    }

    @Override
    public String writeString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderDate=" + orderDate +
                ", orderDueDate=" + orderDueDate +
                ", voidInd=" + voidInd +
                ", customer=" + customer +
                ", products=" + products +
                '}';
    }
}
