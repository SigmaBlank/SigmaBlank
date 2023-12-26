package com.blanksapplication.app.modules.passwordresetpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.passwordresetpage.`data`.model.PasswordResetPageModel
import org.koin.core.KoinComponent

class PasswordResetPageVM : ViewModel(), KoinComponent {
  val passwordResetPageModel: MutableLiveData<PasswordResetPageModel> =
      MutableLiveData(PasswordResetPageModel())

  var navArguments: Bundle? = null
}
