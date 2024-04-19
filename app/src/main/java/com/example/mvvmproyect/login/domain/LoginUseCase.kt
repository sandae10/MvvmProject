package com.example.mvvmproyect.login.domain

import com.example.mvvmproyect.login.data.network.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val repository: LoginRepository) {

    suspend operator fun invoke(user :String, password: String): Boolean{
        return repository.doLogin(user, password)
    }
}