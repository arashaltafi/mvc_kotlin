package com.arash.altafi.mvc.views

interface ILoginView {
    fun onLoginSuccess(message: String?)
    fun onLoginError(message: String?)
}