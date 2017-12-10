package com.example.dell.project_database.Models;

import com.example.dell.project_database.MyClasses;

/**
 * Created by dell on 12/8/2017.
 */

public class Product implements MyClasses {
    private int id;
    private double standard_price;
    private int quantity;
    private String unit;//TODO: check what is it

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getStandard_price() {
        return standard_price;
    }

    public void setStandard_price(double standard_price) {
        this.standard_price = standard_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", standard_price=" + standard_price +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';
    }

    @Override
    public String writeString() {
        return "Product{" +
                "id=" + id +
                ", standard_price=" + standard_price +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';
    }
}
