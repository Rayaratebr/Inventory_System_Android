package com.example.dell.project_database;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.LinkedList;

/**
 * Created by dell on 12/8/2017.
 */

public class MyDatabase {
    private Context objContext=null;

    public MyDatabase (Context context){
        objContext = context;
    }
    public Exception createDB(){
        SQLiteDatabase DB = null;

        try{
            ContextWrapper obj = new ContextWrapper(objContext);
            DB = obj.openOrCreateDatabase("ProjectDatabase",
                    android.content.Context.MODE_PRIVATE, null);
            DB.execSQL("CREATE TABLE IF NOT EXISTS tblCustomer "
                    + " (CustomerID INTEGER PRIMARY KEY, CustomerName VARCHAR NOT NULL," +
                    " Address VARCHAR NOT NULL," + "Phone VARCHAR NULL" + " );");
            DB.execSQL("CREATE TABLE IF NOT EXISTS tblOrder "
                    + " (OrderID INTEGER PRIMARY KEY, OrderDate text format 'YYYY-MM-DD' NOT NULL," +
                    "  DueDate text format 'YYYY-MM-DD' NOT NULL," + " );");

            DB.close();
            return null;

        }
        catch(Exception e){
            DB.close();
            return e;
        }
    }

    private SQLiteDatabase getSQLObject() {
        ContextWrapper obj = new ContextWrapper(objContext);
        return obj.openOrCreateDatabase("ProjectDatabase",
                android.content.Context.MODE_PRIVATE, null);
    }

    public Exception Add_Customer(Customer objCustomer) {
        SQLiteDatabase db;
        db = getSQLObject();
        try {
            db.execSQL("insert into tblCustomer" + " values (null," + "'" +
                    objCustomer.getName() + "'," + objCustomer.getAddress() + "," + "'" + objCustomer.getPhone() + "' " + ")");
            db.close();
            return null;
        } catch (Exception e) {
            db.close();
            return e;
        }
    }

    public Exception Add_Order(){
        SQLiteDatabase db;
        db = getSQLObject();
        try{
            //TODO
            db.close();
            return null;
        }
        catch (Exception e){
            db.close();
            return e;
        }
    }


    public LinkedList<Customer> getCustomers() {
        SQLiteDatabase db;
        db = getSQLObject();
        String SqlQuery = "select * from tblCustomer ";
        Cursor objCur = db.rawQuery(SqlQuery, null);
        LinkedList<Customer> lstCustomers = new LinkedList<Customer>();
        if (objCur != null) {
            if (objCur.moveToFirst()) {
                do {
                    Customer objCustomer = new Customer();
                    objCustomer.setCustomerID(objCur.getLong(objCur.getColumnIndex("CustomerID")));
                    objCustomer.setName(objCur.getString(objCur.getColumnIndex("CustomerName")));
                    objCustomer.setAddress(objCur.getString(objCur.getColumnIndex("Address")));
                    objCustomer.setPhone(objCur.getString(objCur.getColumnIndex("Phone")));
                    lstCustomers.addFirst(objCustomer);
                }while (objCur.moveToNext());

            }
        }
        return lstCustomers;
    }
}


