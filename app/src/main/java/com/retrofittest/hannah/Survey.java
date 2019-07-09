package com.retrofittest.hannah;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Survey {

    @POST("nasuvey/submit.php")
    Call<Posst> createPost(@Body Posst post);
}
