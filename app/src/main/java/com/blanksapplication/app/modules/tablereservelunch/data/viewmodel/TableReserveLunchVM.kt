package com.blanksapplication.app.modules.tablereservelunch.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.tablereservelunch.`data`.model.TableReserveLunchModel
import org.koin.core.KoinComponent

class TableReserveLunchVM : ViewModel(), KoinComponent {
  val tableReserveLunchModel: MutableLiveData<TableReserveLunchModel> =
      MutableLiveData(TableReserveLunchModel())

  var navArguments: Bundle? = null
}
