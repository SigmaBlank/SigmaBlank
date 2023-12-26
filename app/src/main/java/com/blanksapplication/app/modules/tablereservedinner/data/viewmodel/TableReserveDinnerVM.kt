package com.blanksapplication.app.modules.tablereservedinner.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.tablereservedinner.`data`.model.TableReserveDinnerModel
import org.koin.core.KoinComponent

class TableReserveDinnerVM : ViewModel(), KoinComponent {
  val tableReserveDinnerModel: MutableLiveData<TableReserveDinnerModel> =
      MutableLiveData(TableReserveDinnerModel())

  var navArguments: Bundle? = null
}
