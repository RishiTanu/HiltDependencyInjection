package com.example.koindependencyinjecttion.di

import android.app.Application
import com.example.koindependencyinjecttion.data.remote.MyApi
import com.example.koindependencyinjecttion.data.repository.MyRepositoryImpl
import com.example.koindependencyinjecttion.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
/*@InstallIn(ActivityComponent::class)
@InstallIn(ActivityRetainedComponent::class)
@InstallIn(FragmentComponent::class)
@InstallIn(ServiceComponent::class)
@InstallIn(ComponentActivity::class)*/
object AppModule {


    @Singleton
    @Provides
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://")
            //.addConverterFactory(GsonConverterFactory())
            .build()
            .create(MyApi::class.java)
    }

    /*@Singleton
    @Provides
    fun provideMyRepository(
        myApi: MyApi,
        @ApplicationContext application: Application,
        @Named("Single1") hello: String,
    ): MyRepository {
        return MyRepositoryImpl(myApi, application)
    }*/

    @Named("Single1")
    @Singleton
    @Provides
    fun provideString1() = "String 1"

    @Named("Single1")
    @Singleton
    @Provides
    fun provideString2() = "String 2"
}