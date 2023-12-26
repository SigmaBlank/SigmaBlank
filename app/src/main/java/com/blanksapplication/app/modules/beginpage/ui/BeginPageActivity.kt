package com.blanksapplication.app.modules.beginpage.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityBeginPageBinding
import com.blanksapplication.app.modules.beginpage.`data`.viewmodel.BeginPageVM
import com.blanksapplication.app.modules.loginpage.ui.LoginPageActivity
import kotlin.String
import kotlin.Unit

class BeginPageActivity : BaseActivity<ActivityBeginPageBinding>(R.layout.activity_begin_page) {
  private val viewModel: BeginPageVM by viewModels<BeginPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.beginPageVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imageRectangleTwo.setOnClickListener {
        val destIntent = LoginPageActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "BEGIN_PAGE_ACTIVITY"

    }
  }
