package com.blanksapplication.app.modules.done.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.done.`data`.model.DoneModel
import org.koin.core.KoinComponent

class DoneVM : ViewModel(), KoinComponent {
  val doneModel: MutableLiveData<DoneModel> = MutableLiveData(DoneModel())

  var navArguments: Bundle? = null
}
