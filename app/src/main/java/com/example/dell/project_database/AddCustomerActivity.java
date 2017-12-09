package com.example.dell.project_database;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class AddCustomerActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);
        final Context cont = this;
        Button buttonAdd = (Button) findViewById(R.id.buttonFinalAddCust);
        Button buttonBack = (Button) findViewById(R.id.buttonBackCust);
        Button buttonAsOrd = (Button) findViewById(R.id.butAssignOrd);
        Button buttonAsPay = (Button) findViewById(R.id.butAssignPay);
        final EditText txtCustomerName =(EditText)
                findViewById(R.id.txtCustomerName);
        final EditText txtAddress =(EditText)
                findViewById(R.id.txtAddress);
        final EditText txtPhone =(EditText)
                findViewById(R.id.txtPhone);
        final AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);



        final TextView customerID = (TextView) findViewById(R.id.textviewCustID);
        final int customerId = MainFragment.customerSequence;
        (MainFragment.customerSequence)++;
        customerID.setText("#"+customerId);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Customer objCustomer = new Customer();
                if ((txtCustomerName.getText().toString()).matches("\\w+\\d+.*")){
                    dlgAlert.setMessage("Customer name can't contain numbers!");
                    dlgAlert.setTitle("Error Message");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                }
                else
                {
                    objCustomer.setName(txtCustomerName.getText().toString());
                    objCustomer.setAddress(txtAddress.getText().toString());
                    objCustomer.setPhone(txtPhone.getText().toString());
                    objCustomer.setCustomerID(customerId);
                    objCustomer.setVoidInd(true);
                    customerID.setText("#"+(customerId+1));
                    txtCustomerName.setText("");
                    txtPhone.setText("");
                    txtAddress.setText("");

                    Customer.getCustomersList().add(objCustomer);
                }



            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hide the activity
                finish();
//Start Product Main Activity
                Intent myIntent=new Intent(AddCustomerActivity.this,
                        MainActivity.class);
                AddCustomerActivity.this.startActivity(myIntent);
            }
        });
    }

}
