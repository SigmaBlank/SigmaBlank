package com.blanksapplication.app.modules.tablereservationgardenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.tablereservationgardenone.`data`.model.TableReservationGardenoneModel
import org.koin.core.KoinComponent

class TableReservationGardenoneVM : ViewModel(), KoinComponent {
  val tableReservationGardenoneModel: MutableLiveData<TableReservationGardenoneModel> =
      MutableLiveData(TableReservationGardenoneModel())

  var navArguments: Bundle? = null
}
