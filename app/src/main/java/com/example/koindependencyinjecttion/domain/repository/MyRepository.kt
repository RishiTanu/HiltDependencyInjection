package com.example.koindependencyinjecttion.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}