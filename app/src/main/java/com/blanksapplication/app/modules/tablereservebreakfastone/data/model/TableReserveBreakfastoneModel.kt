package com.blanksapplication.app.modules.tablereservebreakfastone.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TableReserveBreakfastoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEdit: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTableSize: String? = MyApp.getInstance().resources.getString(R.string.lbl_sit_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFrame: String? = MyApp.getInstance().resources.getString(R.string.lbl_garden2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFrameOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_indoor2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFrameTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_seaside2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTableSizeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_meal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFrameThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_dinner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTableSizeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_table_size)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSize: String? = MyApp.getInstance().resources.getString(R.string.lbl_size)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPeoples: String? = MyApp.getInstance().resources.getString(R.string.lbl_peoples)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTableSizeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_date2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_10_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTableSizeFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_time_select_on)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFrameFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_0600_0700)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFrameFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_0700_0800)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFrameSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_0800_0900)

)
