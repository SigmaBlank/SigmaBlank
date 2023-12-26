package com.blanksapplication.app.modules.tablereservationgarden.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.tablereservationgarden.`data`.model.TableReservationGardenModel
import org.koin.core.KoinComponent

class TableReservationGardenVM : ViewModel(), KoinComponent {
  val tableReservationGardenModel: MutableLiveData<TableReservationGardenModel> =
      MutableLiveData(TableReservationGardenModel())

  var navArguments: Bundle? = null
}
