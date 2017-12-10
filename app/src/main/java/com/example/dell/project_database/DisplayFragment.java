package com.example.dell.project_database;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.example.dell.project_database.Models.Customer;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment {

    ArrayAdapter<String> adapter;
    ListView lv;
    ArrayList<String> listItems = new ArrayList<>();



    public DisplayFragment() {
        // Required empty public constructor
    }
    public interface Communicator{
        public void respond(ArrayList<Customer> customers);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        listItems.clear();
        View rootView = inflater.inflate(R.layout.fragment_display, container, false);
         lv = (ListView)rootView.findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,listItems);
        lv.setAdapter(adapter);

        // Inflate the layout for this fragment
        return rootView;
    }


    public void changeData (String myString){

      /*  if (myClasses.get(0) instanceof Customer) {
            for (int i = 0 ; i < myClasses.size();i++)
                listItems.add(((Customer)myClasses.get(i)).toString());
        }
        else if (myClasses.get(0) instanceof Product) {
            for (int i = 0 ; i < myClasses.size();i++)
                listItems.add(((Product)myClasses.get(i)).toString());
        }
        if (myClasses.get(0) instanceof Order) {
            for (int i = 0 ; i < myClasses.size();i++)
                listItems.add(((Order)myClasses.get(i)).toString());
        }*/
      listItems.add(myString);
        adapter.notifyDataSetChanged();
    }

}
