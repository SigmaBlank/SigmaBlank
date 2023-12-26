package com.blanksapplication.app.modules.passwordresetpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityPasswordResetPageBinding
import com.blanksapplication.app.modules.loginpage.ui.LoginPageActivity
import com.blanksapplication.app.modules.passwordresetpage.`data`.viewmodel.PasswordResetPageVM
import kotlin.String
import kotlin.Unit

class PasswordResetPageActivity :
    BaseActivity<ActivityPasswordResetPageBinding>(R.layout.activity_password_reset_page) {
  private val viewModel: PasswordResetPageVM by viewModels<PasswordResetPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.passwordResetPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackToLogin.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PASSWORD_RESET_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PasswordResetPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
