package com.blanksapplication.app.modules.done.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityDoneBinding
import com.blanksapplication.app.modules.done.`data`.viewmodel.DoneVM
import com.blanksapplication.app.modules.homepage.ui.HomePageActivity
import kotlin.String
import kotlin.Unit

class DoneActivity : BaseActivity<ActivityDoneBinding>(R.layout.activity_done) {
  private val viewModel: DoneVM by viewModels<DoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.doneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSave.setOnClickListener {
      val destIntent = HomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
