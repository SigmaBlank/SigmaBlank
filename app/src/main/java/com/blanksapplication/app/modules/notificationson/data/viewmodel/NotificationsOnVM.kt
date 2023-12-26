package com.blanksapplication.app.modules.notificationson.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.notificationson.`data`.model.NotificationsOnModel
import org.koin.core.KoinComponent

class NotificationsOnVM : ViewModel(), KoinComponent {
  val notificationsOnModel: MutableLiveData<NotificationsOnModel> =
      MutableLiveData(NotificationsOnModel())

  var navArguments: Bundle? = null
}
