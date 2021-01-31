package com.hkbae.FinancialProduct.service


import com.hkbae.FinancialProduct.model.User
import retrofit2.Call
import retrofit2.http.*

interface UserAPI {

    @GET("/user/login/")
    fun login(
        @Query("id") id:String,
        @Query("password") password:String
    ) : Call<User>

    @GET("/user/exist/")
    fun getUserCount( //id에 따른 사용자 정보 요청
        @Query("id") id : String
    ) : Call<Int>

    @POST("/user/")
    fun postUser( //사용자 정보 insert 요청
        @Body user : User
    ):Call<Int>

    companion object {
        const val SERVER_URL: String = "http://172.26.17.61:8080"
            //"http://172.26.30.249:8080"
    }


}