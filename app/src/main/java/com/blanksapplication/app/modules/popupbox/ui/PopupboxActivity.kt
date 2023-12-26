package com.blanksapplication.app.modules.popupbox.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityPopupboxBinding
import com.blanksapplication.app.modules.popupbox.`data`.viewmodel.PopupboxVM
import com.blanksapplication.app.modules.review.ui.ReviewActivity
import kotlin.String
import kotlin.Unit

class PopupboxActivity : BaseActivity<ActivityPopupboxBinding>(R.layout.activity_popupbox) {
  private val viewModel: PopupboxVM by viewModels<PopupboxVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.popupboxVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnClose.setOnClickListener {
      val destIntent = ReviewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "POPUPBOX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PopupboxActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
