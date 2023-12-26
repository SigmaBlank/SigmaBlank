package com.blanksapplication.app.modules.tablereservationindoor.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.tablereservationindoor.`data`.model.TableReservationIndoorModel
import org.koin.core.KoinComponent

class TableReservationIndoorVM : ViewModel(), KoinComponent {
  val tableReservationIndoorModel: MutableLiveData<TableReservationIndoorModel> =
      MutableLiveData(TableReservationIndoorModel())

  var navArguments: Bundle? = null
}
