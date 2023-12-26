package com.blanksapplication.app.modules.popupboxone.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PopupboxOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_sure_de)

)
