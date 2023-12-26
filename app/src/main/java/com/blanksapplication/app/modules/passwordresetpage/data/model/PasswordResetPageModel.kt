package com.blanksapplication.app.modules.passwordresetpage.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PasswordResetPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordReset: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_password_reset)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourpasswordh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_password_h)

)
