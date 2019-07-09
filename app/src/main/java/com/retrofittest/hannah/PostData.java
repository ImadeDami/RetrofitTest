package com.retrofittest.hannah;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PostData {

    @POST("nasurvey/submit.php/")

    // wrap the response in a Call object with the type of the expected result
    Call<ResponseBody> postUser (@Body RequestBody requestBody);


}
