package com.blanksapplication.app.modules.notificationson.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsOnModel(
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
