package com.android.jsonregistercheck.authentication;

import android.content.Context;
import android.content.SharedPreferences;

import com.android.jsonregistercheck.model.UserDataModel;
import com.android.jsonregistercheck.retrofit_apiclient.RetrofitClient;
import com.android.jsonregistercheck.retrofit_interface.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by user on 8/8/2018.
 */

public class UserProfileData {
    Context context;
    SharedPreferences sharedPreferences;
    String image,username,customer_id,email,password;

    public UserProfileData(Context context) {
        this.context = context;

    }


    //////////// method to get the user data based on phone number

    public void getUserData(String id){

        ApiInterface userApi = RetrofitClient.getFormData().create(ApiInterface.class);

        Call<UserDataModel>userDataModelCall = userApi.getUserProfileData(id);

        userDataModelCall.enqueue(new Callback<UserDataModel>() {
            @Override
            public void onResponse(Call<UserDataModel> call, Response<UserDataModel> response) {

                ///////// assigning the response data in string variable

                image = response.body().getMessage().getImage();
                username = response.body().getMessage().getUsername();
                customer_id = response.body().getMessage().getId();
                email = response.body().getMessage().getEmail();
                password = response.body().getMessage().getPassword();
                ////////// save user profile data in shared preference

                sharedPreferences = context.getSharedPreferences("UserDetail",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("username",username);
                editor.putString("password",password);
                editor.putString("id",customer_id);
                editor.putString("email",email);
                editor.putString("image",image);
                editor.apply();
            }

            @Override
            public void onFailure(Call<UserDataModel> call, Throwable t) {

                System.out.println("Error "+t.getMessage());

            }
        });

    }

}
