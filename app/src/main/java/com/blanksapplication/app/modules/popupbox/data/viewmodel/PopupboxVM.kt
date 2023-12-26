package com.blanksapplication.app.modules.popupbox.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.popupbox.`data`.model.PopupboxModel
import org.koin.core.KoinComponent

class PopupboxVM : ViewModel(), KoinComponent {
  val popupboxModel: MutableLiveData<PopupboxModel> = MutableLiveData(PopupboxModel())

  var navArguments: Bundle? = null
}
