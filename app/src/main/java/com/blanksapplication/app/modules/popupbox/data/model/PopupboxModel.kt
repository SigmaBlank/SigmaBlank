package com.blanksapplication.app.modules.popupbox.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PopupboxModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThankYou: String? = MyApp.getInstance().resources.getString(R.string.lbl_thank_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_t)

)
