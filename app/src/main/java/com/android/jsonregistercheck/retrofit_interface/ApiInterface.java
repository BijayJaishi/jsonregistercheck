package com.android.jsonregistercheck.retrofit_interface;

import com.android.jsonregistercheck.model.College_Aboutus;
import com.android.jsonregistercheck.model.College_list;
import com.android.jsonregistercheck.model.Review_withdetails;
import com.android.jsonregistercheck.model.UserDataModel;

import java.util.List;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by user on 8/6/2018.
 */

public interface ApiInterface {

    @POST("practiceone.php")
    Call<ResponseBody> submitData (@Body RequestBody body);

    @GET("usercheck.php")
    Call<UserDataModel>getUserProfileData(@Query("id") String id);


    @GET("collegelist.php")
    Call<List<College_list>> getMenu();

    @POST("login.php")
    Call<ResponseBody> postLoginData(@Body RequestBody body);

    @GET("get_information.php")
    Call<List<College_Aboutus>> getdetails(@Query("college_id")String collegeid);

    @POST("postReview")
    Call<ResponseBody> postReview (@Body RequestBody body);

    @GET("get_review.php")
    Call<List<Review_withdetails>> getReview(@Query("college_id") String menu_items_id);




}
