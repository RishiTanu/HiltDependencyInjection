package com.example.koindependencyinjecttion.data.repository

import android.app.Application
import com.example.koindependencyinjecttion.R
import com.example.koindependencyinjecttion.data.remote.MyApi
import com.example.koindependencyinjecttion.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi,
    application: Application
): MyRepository {

    init {
        val appName = application.getString(R.string.app_name)
        println("Hello $appName")
    }

    override suspend fun doNetworkCall() {

    }
}