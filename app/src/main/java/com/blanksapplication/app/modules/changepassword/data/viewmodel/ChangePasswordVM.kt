package com.blanksapplication.app.modules.changepassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.changepassword.`data`.model.ChangePasswordModel
import org.koin.core.KoinComponent

class ChangePasswordVM : ViewModel(), KoinComponent {
  val changePasswordModel: MutableLiveData<ChangePasswordModel> =
      MutableLiveData(ChangePasswordModel())

  var navArguments: Bundle? = null
}
