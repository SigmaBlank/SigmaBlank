package com.blanksapplication.app.modules.tablereservationseaside.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.tablereservationseaside.`data`.model.TableReservationSeasideModel
import org.koin.core.KoinComponent

class TableReservationSeasideVM : ViewModel(), KoinComponent {
  val tableReservationSeasideModel: MutableLiveData<TableReservationSeasideModel> =
      MutableLiveData(TableReservationSeasideModel())

  var navArguments: Bundle? = null
}
