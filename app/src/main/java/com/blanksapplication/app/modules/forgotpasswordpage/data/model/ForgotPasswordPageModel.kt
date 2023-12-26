package com.blanksapplication.app.modules.forgotpasswordpage.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgotPasswordPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoworrieswe: String? = MyApp.getInstance().resources.getString(R.string.msg_no_worries_we)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailOne: String? = MyApp.getInstance().resources.getString(R.string.msg_someone_example)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResetPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)

)
