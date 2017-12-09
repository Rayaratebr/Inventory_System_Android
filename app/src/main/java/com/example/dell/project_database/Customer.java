package com.example.dell.project_database;


import java.util.ArrayList;

/**
 * Created by dell on 12/8/2017.
 */

public class Customer implements MyClasses{
    private String Name;
    private String Address;
    private String Phone;
    private long CustomerID;
    private boolean voidInd = false;
    private static ArrayList<Customer> customersList = new ArrayList<>();

    public static ArrayList<Customer> getCustomersList() {
        return customersList;
    }

    public Customer(){

    }

    public Customer(String name, String address, String phone) {
        this.Name = name;
        this.Phone= phone;
        this.Address=address;
    }

    public long getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(long customerID) {
        CustomerID = customerID;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
    public boolean isVoidInd() {

        return voidInd;
    }

    public void setVoidInd(boolean voidInd) {

        this.voidInd = voidInd;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                ", CustomerID=" + CustomerID +
                ", voidInd=" + voidInd +
                '}';
    }


    @Override
    public String writeString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                ", CustomerID=" + CustomerID +
                ", voidInd=" + voidInd +
                '}';
    }
}
