package com.blanksapplication.app.modules.popupboxone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityPopupboxOneBinding
import com.blanksapplication.app.modules.homepage.ui.HomePageActivity
import com.blanksapplication.app.modules.popupboxone.`data`.viewmodel.PopupboxOneVM
import com.blanksapplication.app.modules.tablereservebreakfastone.ui.TableReserveBreakfastoneActivity
import kotlin.String
import kotlin.Unit

class PopupboxOneActivity : BaseActivity<ActivityPopupboxOneBinding>(R.layout.activity_popupbox_one)
    {
  private val viewModel: PopupboxOneVM by viewModels<PopupboxOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.popupboxOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCancel.setOnClickListener {
      val destIntent = TableReserveBreakfastoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnYes.setOnClickListener {
      val destIntent = HomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "POPUPBOX_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PopupboxOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
