package com.blanksapplication.app.modules.tablereservationindoorone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.tablereservationindoorone.`data`.model.TableReservationIndooroneModel
import org.koin.core.KoinComponent

class TableReservationIndooroneVM : ViewModel(), KoinComponent {
  val tableReservationIndooroneModel: MutableLiveData<TableReservationIndooroneModel> =
      MutableLiveData(TableReservationIndooroneModel())

  var navArguments: Bundle? = null
}
