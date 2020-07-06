package com.github.livingwithhippos.unchained.base.network

import com.github.livingwithhippos.unchained.user.model.UserApi
import com.github.livingwithhippos.unchained.utilities.BASE_URL
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

//todo: move d.i. here
class ApiFactory(val token: String) {
    //todo: check if client id is correct, or a personal one is needed beside the first auth

    //Creating Auth Interceptor to add the authentication header
    private val authInterceptor = Interceptor { chain ->
        val newUrl = chain.request().url
            .newBuilder()
            .build()

        val newRequest = chain.request()
            .newBuilder()
            .addHeader("Authorization", "Bearer $token")
            .url(newUrl)
            .build()

        chain.proceed(newRequest)
    }

    //OkhttpClient for building http request url
    private val debridClient: OkHttpClient = OkHttpClient().newBuilder()
        .addInterceptor(authInterceptor)
        .build()

    //todo: remove logger when finished
    val logInterceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    //OkhttpClient for building http request url
    private val logClient: OkHttpClient = OkHttpClient().newBuilder()
        .addInterceptor(authInterceptor)
        .addInterceptor(logInterceptor)
        .build()

    fun retrofit(): Retrofit = Retrofit.Builder()
        .client(logClient)
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()


    val userApi: UserApi = retrofit().create(
        UserApi::class.java
    )

}