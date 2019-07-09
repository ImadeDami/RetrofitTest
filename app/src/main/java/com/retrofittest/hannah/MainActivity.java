package com.retrofittest.hannah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.io.IOException;


import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.Call;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    EditText FirstNamme;
    EditText SecondName;
   // RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstNamme = findViewById(R.id.first_name);
        SecondName = findViewById(R.id.second_name);
       // radioGroup = findViewById(R.id.submit_radio);


    }

   /* Retrofit retrofit = new Retrofit.Builder().baseUrl("http://namarkets.com/")
            .build();
    PostData api = retrofit.create(PostData.class);

    String json = "{\n" +
            "            \"firstName\": \""+ FirstNamme + "\",\n" +
            "            \"secondName\": \""+ SecondName + "\",\n" +
            "            \"gender\": \""+ radioGroup +"\"}";

    RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), json);

    api.postUser(requestBody).enqueue(new Callback<ResponseBody>() {
        @Override
        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
            try{
                Log.d("debug1",response.body().string());
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        @Override
        public void onFailure(Call<ResponseBody> call, Throwable throwable) {

        }
    }); */
}
