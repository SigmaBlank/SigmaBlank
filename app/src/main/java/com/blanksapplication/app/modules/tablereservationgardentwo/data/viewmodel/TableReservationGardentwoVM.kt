package com.blanksapplication.app.modules.tablereservationgardentwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.tablereservationgardentwo.`data`.model.TableReservationGardentwoModel
import org.koin.core.KoinComponent

class TableReservationGardentwoVM : ViewModel(), KoinComponent {
  val tableReservationGardentwoModel: MutableLiveData<TableReservationGardentwoModel> =
      MutableLiveData(TableReservationGardentwoModel())

  var navArguments: Bundle? = null
}
