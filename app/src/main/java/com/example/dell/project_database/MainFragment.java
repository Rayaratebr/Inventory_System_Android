package com.example.dell.project_database;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    DisplayFragment.Communicator communicator;
    static int customerSequence = 0;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button buttonAddCust = (Button) getActivity().findViewById(R.id.buttonAddCust);
        Button buttonDelCust = (Button) getActivity().findViewById(R.id.buttonDelCust);
        Button buttonDisCust = (Button) getActivity().findViewById(R.id.buttonDisCust);

        Button buttonAddOrder = (Button) getActivity().findViewById(R.id.buttonOrdAdd);
        Button buttonDelOrder = (Button) getActivity().findViewById(R.id.buttonOrdDel);
        Button buttonDisOrder = (Button) getActivity().findViewById(R.id.buttonOrdDis);

        Button buttonAddPro = (Button) getActivity().findViewById(R.id.buttonProAdd);
        Button buttonUpdatePro = (Button) getActivity().findViewById(R.id.buttonProUpdate);
        Button buttonDisPro = (Button) getActivity().findViewById(R.id.buttonProDis);



        buttonAddCust.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent myIntent = new Intent(getActivity(),
                        AddCustomerActivity.class);
                getActivity().startActivity(myIntent);
                getActivity().finish();
            }
        });

        buttonDelCust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonDisCust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO check errors
               /* ArrayList<MyClasses> m = new ArrayList<MyClasses>();
                Customer raya = new Customer();
                raya.setName("Raya");
                raya.setPhone("+98+97");
                raya.setAddress("kijiu");
                m.add(raya);*/
                communicator.respond(Customer.getCustomersList());
            }
        });
        buttonDelCust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getActivity(),
                        DeleteCustomerActivity.class);
                getActivity().startActivity(myIntent);
                getActivity().finish();

            }
        });

        buttonAddOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getActivity(),
                        AddOrderActivity.class);
                getActivity().startActivity(myIntent);
                getActivity().finish();
            }
        });
    }
}
