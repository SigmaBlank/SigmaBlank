package com.blanksapplication.app.modules.notificationsoff.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsOffModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDisplaynotific: String? =
      MyApp.getInstance().resources.getString(R.string.msg_display_notific)

)
