package com.example.final_project;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {
    @GET
    Call<NewsModal> getNews(@Url String url);

//    @GET
//    Call<NewsModal>getNewsByCategory(@Url String url);
}
