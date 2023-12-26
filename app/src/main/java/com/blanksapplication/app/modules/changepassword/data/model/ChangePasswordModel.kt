package com.blanksapplication.app.modules.changepassword.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChangePasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_old_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryourold: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_old)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryournew: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_new)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmNewPas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_new_pas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRenteryournew: String? =
      MyApp.getInstance().resources.getString(R.string.msg_renter_your_new)

)
