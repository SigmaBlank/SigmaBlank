package com.blanksapplication.app.modules.beginpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.beginpage.`data`.model.BeginPageModel
import org.koin.core.KoinComponent

class BeginPageVM : ViewModel(), KoinComponent {
  val beginPageModel: MutableLiveData<BeginPageModel> = MutableLiveData(BeginPageModel())

  var navArguments: Bundle? = null
}
