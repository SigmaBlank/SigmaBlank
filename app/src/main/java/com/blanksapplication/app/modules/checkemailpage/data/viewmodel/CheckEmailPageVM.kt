package com.blanksapplication.app.modules.checkemailpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.checkemailpage.`data`.model.CheckEmailPageModel
import org.koin.core.KoinComponent

class CheckEmailPageVM : ViewModel(), KoinComponent {
  val checkEmailPageModel: MutableLiveData<CheckEmailPageModel> =
      MutableLiveData(CheckEmailPageModel())

  var navArguments: Bundle? = null
}
