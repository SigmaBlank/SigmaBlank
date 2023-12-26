package com.blanksapplication.app.modules.popupboxone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.popupboxone.`data`.model.PopupboxOneModel
import org.koin.core.KoinComponent

class PopupboxOneVM : ViewModel(), KoinComponent {
  val popupboxOneModel: MutableLiveData<PopupboxOneModel> = MutableLiveData(PopupboxOneModel())

  var navArguments: Bundle? = null
}
