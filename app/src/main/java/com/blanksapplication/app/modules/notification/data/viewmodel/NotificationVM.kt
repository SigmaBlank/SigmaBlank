package com.blanksapplication.app.modules.notification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.notification.`data`.model.ListrectanglenineRowModel
import com.blanksapplication.app.modules.notification.`data`.model.ListrectanglenineTwoRowModel
import com.blanksapplication.app.modules.notification.`data`.model.NotificationModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationVM : ViewModel(), KoinComponent {
  val notificationModel: MutableLiveData<NotificationModel> = MutableLiveData(NotificationModel())

  var navArguments: Bundle? = null

  val listrectanglenineList: MutableLiveData<MutableList<ListrectanglenineRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectanglenineTwoList: MutableLiveData<MutableList<ListrectanglenineTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
