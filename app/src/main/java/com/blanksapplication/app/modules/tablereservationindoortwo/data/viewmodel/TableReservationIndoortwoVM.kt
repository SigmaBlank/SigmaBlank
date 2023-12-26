package com.blanksapplication.app.modules.tablereservationindoortwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.tablereservationindoortwo.`data`.model.TableReservationIndoortwoModel
import org.koin.core.KoinComponent

class TableReservationIndoortwoVM : ViewModel(), KoinComponent {
  val tableReservationIndoortwoModel: MutableLiveData<TableReservationIndoortwoModel> =
      MutableLiveData(TableReservationIndoortwoModel())

  var navArguments: Bundle? = null
}
