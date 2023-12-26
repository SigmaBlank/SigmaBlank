package com.blanksapplication.app.modules.forgotpasswordpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityForgotPasswordPageBinding
import com.blanksapplication.app.modules.checkemailpage.ui.CheckEmailPageActivity
import com.blanksapplication.app.modules.forgotpasswordpage.`data`.viewmodel.ForgotPasswordPageVM
import kotlin.String
import kotlin.Unit

class ForgotPasswordPageActivity :
    BaseActivity<ActivityForgotPasswordPageBinding>(R.layout.activity_forgot_password_page) {
  private val viewModel: ForgotPasswordPageVM by viewModels<ForgotPasswordPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgotPasswordPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtResetPassword.setOnClickListener {
      val destIntent = CheckEmailPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "FORGOT_PASSWORD_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgotPasswordPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
