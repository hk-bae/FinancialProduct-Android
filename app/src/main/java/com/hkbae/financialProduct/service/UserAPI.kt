package com.hkbae.financialProduct.service


import com.hkbae.financialProduct.model.User
import io.reactivex.Single
import retrofit2.http.*

interface UserAPI {

    @GET("/user/login/")
    fun login(
        @Query("id") id:String,
        @Query("password") password:String
    ) : Single<User>

    @GET("/user/exist/")
    fun getUserCountById( //id에 따른 사용자 정보 요청
        @Query("id") id : String
    ) : Single<Int>

    @POST("/user/")
    fun postUser( //사용자 정보 insert 요청
        @Body user : User
    ): Single<Int>

    companion object {
        const val SERVER_URL: String = "http://10.0.2.2:8080"
    }


}