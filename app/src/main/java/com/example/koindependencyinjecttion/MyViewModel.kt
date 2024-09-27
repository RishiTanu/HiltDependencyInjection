package com.example.koindependencyinjecttion

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.koindependencyinjecttion.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: Lazy<MyRepository>,

):ViewModel() {

}