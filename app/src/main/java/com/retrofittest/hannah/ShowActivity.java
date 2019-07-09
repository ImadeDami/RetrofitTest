package com.retrofittest.hannah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ShowActivity extends AppCompatActivity {

    TextView all_data;

    private Survey survey;

    public void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_show);

        all_data = findViewById(R.id.all_data);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://namarkets.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NaMarkets naMarkets = retrofit.create(NaMarkets.class);

        Call<List<Post>> call = naMarkets.getPosts();

        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {

                if(!response.isSuccessful()){
                    all_data.setText("Code: " + response.code());
                    return;
                }

                List<Post> submit = response.body();

                for (Post post: submit) {
                    String content = "";
                    content += "first name: " + post.getFirstName() + "\n";
                    content += "second name: " + post.getSecondName() + "\n";
                    content += "gender: " + post.getGender() + "\n\n";

                    all_data.append(content);
                }

            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
               all_data.setText(t.getMessage());
            }
        });
    }
}
