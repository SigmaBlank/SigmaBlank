package com.blanksapplication.app.modules.tablereservationseasideone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.tablereservationseasideone.`data`.model.TableReservationSeasideoneModel
import org.koin.core.KoinComponent

class TableReservationSeasideoneVM : ViewModel(), KoinComponent {
  val tableReservationSeasideoneModel: MutableLiveData<TableReservationSeasideoneModel> =
      MutableLiveData(TableReservationSeasideoneModel())

  var navArguments: Bundle? = null
}
