package com.capstone.invoicemanager.connection

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient { // it's a singleton , meaning there's only one instance of this object throughout
    // the application's lifecycle

    fun create(): Retrofit {

        val okHttpClient = OkHttpClient
            .Builder()
            .build()

        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:9000/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

}