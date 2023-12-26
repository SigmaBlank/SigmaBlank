package com.blanksapplication.app.modules.tablereservationseasidetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.tablereservationseasidetwo.`data`.model.TableReservationSeasidetwoModel
import org.koin.core.KoinComponent

class TableReservationSeasidetwoVM : ViewModel(), KoinComponent {
  val tableReservationSeasidetwoModel: MutableLiveData<TableReservationSeasidetwoModel> =
      MutableLiveData(TableReservationSeasidetwoModel())

  var navArguments: Bundle? = null
}
