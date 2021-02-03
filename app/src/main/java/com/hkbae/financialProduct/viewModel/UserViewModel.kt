package com.hkbae.financialProduct.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.hkbae.financialProduct.model.User
import com.hkbae.financialProduct.repository.UserRepository


class UserViewModel(application : Application) : AndroidViewModel(application){

    var liveData : MutableLiveData<User> = MutableLiveData()
    var userRepository : UserRepository = UserRepository(liveData)


    //로그인 가능한 아이디인지 확인
    fun login(id:String,password:String){
        userRepository.login(id,password)
    }

    fun getUserCountById(user: User){
        userRepository.getUserCountById(user)
    }

    fun postUser(){
        userRepository.postUser()
    }

}

