package com.arash.altafi.mvc.controllers


import com.arash.altafi.mvc.models.User
import com.arash.altafi.mvc.views.ILoginView


class LoginController(private val view: ILoginView) : ILoginController {

    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        when (user.isValid()) {
            0 -> {
                view.onLoginError("Please enter Email")
            }
            1 -> {
                view.onLoginError("Please enter A valid Email")
            }
            2 -> {
                view.onLoginError("Please enter Password")
            }
            3 -> {
                view.onLoginError("Please enter Password greater the 6 char")
            }
            else -> {
                view.onLoginSuccess("login Successful")
            }
        }
    }
}