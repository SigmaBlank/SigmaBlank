package com.blanksapplication.app.modules.notification.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotificationda: String? = MyApp.getInstance().resources.getString(R.string.lbl_recent)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotificationdaOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_yesterday)

)
