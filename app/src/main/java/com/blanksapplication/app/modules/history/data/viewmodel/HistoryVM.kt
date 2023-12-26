package com.blanksapplication.app.modules.history.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.history.`data`.model.HistoryModel
import org.koin.core.KoinComponent

class HistoryVM : ViewModel(), KoinComponent {
  val historyModel: MutableLiveData<HistoryModel> = MutableLiveData(HistoryModel())

  var navArguments: Bundle? = null
}
