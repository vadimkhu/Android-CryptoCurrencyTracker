package com.example.cracker

import android.content.res.Resources
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers

interface RetrofitGetInterface {

    @GET("/v1/cryptocurrency/listings/latest?limit=10")
    @Headers("X-CMC_PRO_API_KEY: ebb6a393-51b9-405a-8e5f-62a1c7ad914e")
    fun getCryptocurrency(): Single<ResponseDTO>

    companion object Factory {
        fun create(): RetrofitGetInterface {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create()) // говорим чем парсим
                .baseUrl("https://pro-api.coinmarketcap.com/") // базовая часть ссылки
                .build()

            return retrofit.create(RetrofitGetInterface::class.java)
        }
    }
}