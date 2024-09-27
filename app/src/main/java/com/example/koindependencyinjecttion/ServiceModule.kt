package com.example.koindependencyinjecttion

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.koindependencyinjecttion.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class ServiceModule @Inject constructor(
    private val noteRepository: MyRepository,
) : Service() {
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}