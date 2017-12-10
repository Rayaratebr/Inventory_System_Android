package com.example.dell.project_database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dell.project_database.Models.Customer;

import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements DisplayFragment.Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Config.BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Config.apiService = retrofit.create(MyApiEndPointInterface.class);
    }





    @Override
    public void respond(ArrayList<Customer> customers) {
        DisplayFragment dFragment = (DisplayFragment)getFragmentManager().findFragmentById(R.id.dispFragment);
        for (Customer m : customers) dFragment.changeData(m.writeString());
    }

}
