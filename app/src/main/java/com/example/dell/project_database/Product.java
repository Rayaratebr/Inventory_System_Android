package com.example.dell.project_database;

/**
 * Created by dell on 12/8/2017.
 */

public class Product implements MyClasses{
    private int ID;
    private double standardPrice;
    private int quantity;
    private String unit;//TODO: check what is it
    private boolean voidInd;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(double standardPrice) {
        this.standardPrice = standardPrice;
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

    public boolean isVoidInd() {
        return voidInd;
    }

    public void setVoidInd(boolean voidInd) {
        this.voidInd = voidInd;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", standardPrice=" + standardPrice +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", voidInd=" + voidInd +
                '}';
    }

    @Override
    public String writeString() {
        return "Product{" +
                "ID=" + ID +
                ", standardPrice=" + standardPrice +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", voidInd=" + voidInd +
                '}';
    }
}
