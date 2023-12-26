package com.blanksapplication.app.modules.notification.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectanglenineTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourreservatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_reservatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_hours_ago)

)
