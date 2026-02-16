package com.example.rateflow

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

data class User(
    val username: String,
    val fName: String,
    val lName: String,
    val email: String,
    val password: String
)

interface ApiService {

    @POST("api/auth/register")
    fun registerUser(@Body user: User): Call<User>

    @POST("api/auth/login")
    fun loginUser(@Body user: User): Call<User>
}
