package com.example.dell.project_database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class AddOrderActivity extends AppCompatActivity {



    final List<String> dayslist = new ArrayList<>();
    final List<String> monthslist = new ArrayList<>();
    final List<String> yearslist = new ArrayList<>();

    Spinner daysSpinnerG;
    Spinner monthsSpinnerG;
    Spinner yearsSpinnerG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_order);

        final Spinner daysSpinner = (Spinner) findViewById(R.id.spinnerDayOrder);
        final Spinner monthsSpinner = (Spinner) findViewById(R.id.spinnerMonthOrder);
        final Spinner yearsSpinner = (Spinner) findViewById(R.id.spinnerYearOrder);

        daysSpinnerG = daysSpinner;
        monthsSpinnerG = monthsSpinner;
        yearsSpinnerG = yearsSpinner;

        /************** filing day,month,year spinners ***************/
        fillDateLists();


        ArrayAdapter<String> daysAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, dayslist);
        daysAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        daysSpinner.setAdapter(daysAdapter);

        ArrayAdapter<String> monthsAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, monthslist);
        monthsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        monthsSpinner.setAdapter(monthsAdapter);

        ArrayAdapter<String> yearsAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, yearslist);
        yearsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearsSpinner.setAdapter(yearsAdapter);

        /************** End of filing day,month,year spinners ***************/

        /************** Matching month with max dates Number***********/

        monthsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
                // TODO Auto-generated method stub

                final List<String> dayslist = new ArrayList<>();
                if(monthsSpinner.getSelectedItem().toString().equalsIgnoreCase("January")||
                   monthsSpinner.getSelectedItem().toString().equalsIgnoreCase("March")||
                   monthsSpinner.getSelectedItem().toString().equalsIgnoreCase("May")||
                   monthsSpinner.getSelectedItem().toString().equalsIgnoreCase("July")||
                   monthsSpinner.getSelectedItem().toString().equalsIgnoreCase("August")||
                   monthsSpinner.getSelectedItem().toString().equalsIgnoreCase("October")||
                   monthsSpinner.getSelectedItem().toString().equalsIgnoreCase("December")){

                    //fill Days List
                    int i;
                    for(i=1; i<=31;i++){
                        if(i<10){
                            dayslist.add("0"+i);
                        }else{
                            dayslist.add(i+"");
                        }

                    }

                    ArrayAdapter<String> daysAdapter = new ArrayAdapter<String>(AddOrderActivity.this,
                            android.R.layout.simple_list_item_1, dayslist);
                    daysAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    daysSpinnerG.setAdapter(daysAdapter);


                }

                else if(monthsSpinner.getSelectedItem().toString().equalsIgnoreCase("April")||
                        monthsSpinner.getSelectedItem().toString().equalsIgnoreCase("September")||
                        monthsSpinner.getSelectedItem().toString().equalsIgnoreCase("November")||
                        monthsSpinner.getSelectedItem().toString().equalsIgnoreCase("June")){

                    //fill Days List
                    int i;
                    for(i=1; i<=30;i++){
                        if(i<10){
                            dayslist.add("0"+i);
                        }else{
                            dayslist.add(i+"");
                        }

                    }

                    ArrayAdapter<String> daysAdapter = new ArrayAdapter<String>(AddOrderActivity.this,
                            android.R.layout.simple_list_item_1, dayslist);
                    daysAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    daysSpinnerG.setAdapter(daysAdapter);


                }else{
                    //fill Days List
                    int i;

                    if (Integer.parseInt(yearsSpinner.getSelectedItem().toString())%4 == 0){
                        for(i=1; i<=29;i++){
                            if(i<10){
                                dayslist.add("0"+i);
                            }else{
                                dayslist.add(i+"");
                            }

                        }
                    }else{
                        for(i=1; i<=28;i++){
                            if(i<10){
                                dayslist.add("0"+i);
                            }else{
                                dayslist.add(i+"");
                            }

                        }
                    }


                    ArrayAdapter<String> daysAdapter = new ArrayAdapter<String>(AddOrderActivity.this,
                            android.R.layout.simple_list_item_1, dayslist);
                    daysAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    daysSpinnerG.setAdapter(daysAdapter);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });
    }

    void fillDateLists(){

        //fill Days List
        int i;
        for(i=1; i<=31;i++){
            if(i<10){
                this.dayslist.add("0"+i);
            }else{
                this.dayslist.add(i+"");
            }

        }
        //fill Months List
        this.monthslist.add("January");
        this.monthslist.add("February");
        this.monthslist.add("March");
        this.monthslist.add("April");
        this.monthslist.add("May");
        this.monthslist.add("June");
        this.monthslist.add("July");
        this.monthslist.add("August");
        this.monthslist.add("September");
        this.monthslist.add("October");
        this.monthslist.add("November");
        this.monthslist.add("December");

        //fill Years List

        for(i=2015; i<=2048;i++){
            this.yearslist.add(i+"");
        }
    }
}
