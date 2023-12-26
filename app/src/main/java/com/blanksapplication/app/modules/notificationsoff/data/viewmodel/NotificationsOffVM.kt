package com.blanksapplication.app.modules.notificationsoff.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.notificationsoff.`data`.model.NotificationsOffModel
import org.koin.core.KoinComponent

class NotificationsOffVM : ViewModel(), KoinComponent {
  val notificationsOffModel: MutableLiveData<NotificationsOffModel> =
      MutableLiveData(NotificationsOffModel())

  var navArguments: Bundle? = null
}
