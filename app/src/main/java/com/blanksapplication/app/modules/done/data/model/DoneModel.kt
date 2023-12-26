package com.blanksapplication.app.modules.done.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDONE: String? = MyApp.getInstance().resources.getString(R.string.lbl_done)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_reservatio4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSave: String? = MyApp.getInstance().resources.getString(R.string.msg_back_to_home_pa)

)
