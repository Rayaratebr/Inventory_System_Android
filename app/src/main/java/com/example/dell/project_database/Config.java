package com.example.dell.project_database;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Config {
    public static final String BASE_URL = "http://192.168.1.16:8000/api/";
//    public static final String BASE_URL = "http://172.19.49.37:8000/api/";
    public static MyApiEndPointInterface apiService;

}
