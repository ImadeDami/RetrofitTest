package com.retrofittest.hannah;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface NaMarkets {

    @GET("nasurvey/allemp.php")
    Call<List<Post>> getPosts();

    @POST("nasurvey/submit.php")
    Call<Post> createPost(@Body Post post);
}
