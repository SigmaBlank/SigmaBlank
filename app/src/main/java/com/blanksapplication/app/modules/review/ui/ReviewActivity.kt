package com.blanksapplication.app.modules.review.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityReviewBinding
import com.blanksapplication.app.modules.popupbox.ui.PopupboxActivity
import com.blanksapplication.app.modules.review.`data`.viewmodel.ReviewVM
import kotlin.String
import kotlin.Unit

class ReviewActivity : BaseActivity<ActivityReviewBinding>(R.layout.activity_review) {
  private val viewModel: ReviewVM by viewModels<ReviewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.reviewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnSubmit.setOnClickListener {
      val destIntent = PopupboxActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REVIEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReviewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
