package com.blanksapplication.app.modules.forgotpasswordpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.forgotpasswordpage.`data`.model.ForgotPasswordPageModel
import org.koin.core.KoinComponent

class ForgotPasswordPageVM : ViewModel(), KoinComponent {
  val forgotPasswordPageModel: MutableLiveData<ForgotPasswordPageModel> =
      MutableLiveData(ForgotPasswordPageModel())

  var navArguments: Bundle? = null
}
