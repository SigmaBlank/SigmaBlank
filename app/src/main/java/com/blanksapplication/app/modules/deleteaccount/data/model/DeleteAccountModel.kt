package com.blanksapplication.app.modules.deleteaccount.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DeleteAccountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDeleteAccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_delete_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_sure_wa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGiveussomefe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_give_us_some_fe)

)
