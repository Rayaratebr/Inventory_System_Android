package com.example.dell.project_database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dell.project_database.Models.Customer;

public class DeleteCustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_customer);
        Button buttonDelete = (Button) findViewById(R.id.buttonOK);
        Button buttonCancel = (Button) findViewById(R.id.buttonCancel);
        final EditText textCustID = (EditText) findViewById(R.id.custDelID);

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Customer.getCustomersList().get(Integer.parseInt(textCustID.getText().toString()));
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hide the activity
                finish();
//Start Product Main Activity
                Intent myIntent=new Intent(DeleteCustomerActivity.this,
                        MainActivity.class);
                DeleteCustomerActivity.this.startActivity(myIntent);
            }
        });

    }
}
