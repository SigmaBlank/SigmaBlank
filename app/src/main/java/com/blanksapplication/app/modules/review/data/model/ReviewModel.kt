package com.blanksapplication.app.modules.review.`data`.model

import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ReviewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReview: String? = MyApp.getInstance().resources.getString(R.string.lbl_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_overall)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyEight: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tell_us_about_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGiveussomefe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_give_us_some_fe)

)
