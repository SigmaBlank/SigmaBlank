package com.blanksapplication.app.modules.homepage.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomePageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeBackU: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_back_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentreservat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recent_reservat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_location_gard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReserveNowPl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reserve_now_pl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGARDEN: String? = MyApp.getInstance().resources.getString(R.string.lbl_garden)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtINDOOR: String? = MyApp.getInstance().resources.getString(R.string.lbl_indoor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSEASIDE: String? = MyApp.getInstance().resources.getString(R.string.lbl_seaside)

)
