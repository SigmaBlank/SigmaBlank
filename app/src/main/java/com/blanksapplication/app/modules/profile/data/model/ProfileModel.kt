package com.blanksapplication.app.modules.profile.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUserOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_user01)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_someone_example)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSix: String? = MyApp.getInstance().resources.getString(R.string.msg_delete_my_accou)

)
