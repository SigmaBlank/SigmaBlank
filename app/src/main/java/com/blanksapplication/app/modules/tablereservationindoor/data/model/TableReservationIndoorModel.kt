package com.blanksapplication.app.modules.tablereservationindoor.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TableReservationIndoorModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtINDOOR: String? = MyApp.getInstance().resources.getString(R.string.lbl_indoor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeal: String? = MyApp.getInstance().resources.getString(R.string.lbl_meal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBreakfast: String? = MyApp.getInstance().resources.getString(R.string.lbl_breakfast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBreakfastOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_breakfast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLunch: String? = MyApp.getInstance().resources.getString(R.string.lbl_lunch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDinner: String? = MyApp.getInstance().resources.getString(R.string.lbl_dinner)

)
