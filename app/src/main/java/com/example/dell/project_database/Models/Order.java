package com.example.dell.project_database.Models;

import com.example.dell.project_database.MyClasses;

import java.util.ArrayList;


public class Order implements MyClasses {
    private long id;
    private String order_date;
    private String order_due_date;
    private long customer_id;
//    private ArrayList<Product> products;


    public Order() {
    }

    public Order(String order_date, String order_due_date) {
        this.order_date = order_date;
        this.order_due_date = order_due_date;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public String getOrderDate() {
        return order_date;
    }

    public void setOrderDate(String order_date) {
        this.order_date = order_date;
    }

    public String getOrderDueDate() {
        return order_due_date;
    }

    public void setOrderDueDate(String order_due_date) {
        this.order_due_date = order_due_date;
    }



//    public ArrayList<Product> getProducts() {
//        return products;
//    }
//
//    public void setProducts(ArrayList<Product> products) {
//        this.products = products;
//    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + id +
                ", orderDate=" + order_date +
                ", orderDueDate=" + order_due_date +
                ", customer=" + customer_id +
//                ", products=" + products +
                '}';
    }

    @Override
    public String writeString() {
        return "Order{" +
                "orderID=" + id +
                ", orderDate=" + order_date +
                ", orderDueDate=" + order_due_date +
                ", customer=" + customer_id +
//                ", products=" + products +
                '}';
    }
}
