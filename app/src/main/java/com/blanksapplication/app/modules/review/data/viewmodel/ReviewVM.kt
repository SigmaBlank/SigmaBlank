package com.blanksapplication.app.modules.review.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blanksapplication.app.modules.review.`data`.model.ReviewModel
import org.koin.core.KoinComponent

class ReviewVM : ViewModel(), KoinComponent {
  val reviewModel: MutableLiveData<ReviewModel> = MutableLiveData(ReviewModel())

  var navArguments: Bundle? = null
}
