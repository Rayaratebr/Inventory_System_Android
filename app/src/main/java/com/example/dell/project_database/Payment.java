package com.example.dell.project_database;

import java.util.Date;

/**
 * Created by dell on 12/8/2017.
 */

public class Payment {
    private int ID;
    private double amount;
    private Date paymentDate;//TODO: check date type
    private Customer customer;//TODO: must be checked [we may need customerID only]
    private boolean voidInd;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isVoidInd() {
        return voidInd;
    }

    public void setVoidInd(boolean voidInd) {
        this.voidInd = voidInd;
    }
}
