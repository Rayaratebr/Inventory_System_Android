package com.example.dell.project_database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import static com.example.dell.project_database.R.id.buttonAddCust;

public class MainActivity extends AppCompatActivity implements DisplayFragment.Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    @Override
    public void respond(ArrayList<Customer> customers) {
        DisplayFragment dFragment = (DisplayFragment)getFragmentManager().findFragmentById(R.id.dispFragment);
        for (Customer m : customers) dFragment.changeData(m.writeString());
    }

}
