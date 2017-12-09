package com.example.dell.project_database;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MyApiEndPointInterface {

    @GET("customers")
    Call<List<Customer>> getAllCustomers();

    @GET("products")
    Call<List<Product>> getAllProducts();

    @GET("orders")
    Call<List<Order>> getAllOrders();

    @GET("payments")
    Call<List<Customer>> getAllPayments();



//    @GET("students/{user_id}")
//    Call<Student> getStudentInfo(@Path("user_id") String userId);
//
//    @GET("quizes/{quiz_id}")
//    Call<List<Question>> getQuestions(@Path("quiz_id") String quizId);
//
//    @GET("quizes/active/{stu_id}")
//    Call<List<Quiz>> getActiveQuizes(@Path("stu_id") int stu_id);
//
//    @GET("quizes/upcomming")
//    Call<List<Quiz>> getUpcommingQuizes();
//
//    @FormUrlEncoded
//    @POST("grades/set_grade")
//    Call<String> setStudentGrade(@Field("stu_id") int stuId,
//                                 @Field("quiz_id") int quizId,
//                                 @Field("grade") double grade
//    );
}


