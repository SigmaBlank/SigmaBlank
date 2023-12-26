package com.blanksapplication.app.modules.tablereservebreakfast.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.tablereservebreakfast.`data`.model.TableReserveBreakfastModel
import org.koin.core.KoinComponent

class TableReserveBreakfastVM : ViewModel(), KoinComponent {
  val tableReserveBreakfastModel: MutableLiveData<TableReserveBreakfastModel> =
      MutableLiveData(TableReserveBreakfastModel())

  var navArguments: Bundle? = null
}
