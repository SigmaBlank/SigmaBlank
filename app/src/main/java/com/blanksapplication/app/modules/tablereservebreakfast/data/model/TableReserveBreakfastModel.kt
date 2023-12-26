package com.blanksapplication.app.modules.tablereservebreakfast.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TableReserveBreakfastModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTableReserve: String? = MyApp.getInstance().resources.getString(R.string.lbl_table_reserve)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLeftCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLeftCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLeftCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTableSize: String? = MyApp.getInstance().resources.getString(R.string.lbl_table_size)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSize: String? = MyApp.getInstance().resources.getString(R.string.lbl_size)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPeoples: String? = MyApp.getInstance().resources.getString(R.string.lbl_peoples)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTableSizeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_date2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTableSizeTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_time_select_on)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFrame: String? = MyApp.getInstance().resources.getString(R.string.lbl_0600_0700)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFrameOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_0700_0800)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFrameTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_0800_0900)

)
