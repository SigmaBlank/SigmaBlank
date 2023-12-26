package com.blanksapplication.app.modules.tablereservebreakfastone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.tablereservebreakfastone.`data`.model.TableReserveBreakfastoneModel
import org.koin.core.KoinComponent

class TableReserveBreakfastoneVM : ViewModel(), KoinComponent {
  val tableReserveBreakfastoneModel: MutableLiveData<TableReserveBreakfastoneModel> =
      MutableLiveData(TableReserveBreakfastoneModel())

  var navArguments: Bundle? = null
}
