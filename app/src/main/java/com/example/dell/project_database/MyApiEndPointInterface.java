package com.example.dell.project_database;


import com.example.dell.project_database.Models.Customer;
import com.example.dell.project_database.Models.Order;
import com.example.dell.project_database.Models.Payment;
import com.example.dell.project_database.Models.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MyApiEndPointInterface {

    /*
    *
    * Customer APIs
    * */

    @GET("customers")
    Call<List<Customer>> getAllCustomers();

    @POST("customers")
    Call<String> storeCustomer(@Body Customer customer);

    /*
    *
    * Payment APIs
    * */

    @GET("payments")
    Call<List<Customer>> getAllPayments();

    @POST("payments")
    Call<String> storePayment(@Body Payment payment);

    @POST("customers/{customer_id}/payments")
    Call<String> storeCustomerPayment(@Path("customer_id") int customer_id, @Body Payment payment);


    /*
    *
    * Products APIs
    * */
    @GET("products")
    Call<List<Product>> getAllProducts();

    @POST("products")
    Call<String> storeProduct(@Body Product product);

      /*
        *
        * Orders APIs
        * */
    @GET("orders")
    Call<List<Order>> getAllOrders();

    @POST("orders")
    Call<String> storeOrder(@Body Order order);

    @POST("customers/{customer_id}/orders")
    Call<String> storeCustomerOrder(@Path("customer_id") int customer_id, @Body Order order);



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


