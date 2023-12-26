package com.blanksapplication.app.modules.checkemailpage.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CheckEmailPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourEmai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_emai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseenteryo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_enter_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_321532)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResetPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)

)
