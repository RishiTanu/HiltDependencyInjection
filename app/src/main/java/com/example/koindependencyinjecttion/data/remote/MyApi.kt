package com.example.koindependencyinjecttion.data.remote

import retrofit2.http.GET

interface MyApi {
    @GET("test")
    fun testFun(){

    }
}