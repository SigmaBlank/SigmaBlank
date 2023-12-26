package com.blanksapplication.app.modules.checkemailpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityCheckEmailPageBinding
import com.blanksapplication.app.modules.checkemailpage.`data`.viewmodel.CheckEmailPageVM
import com.blanksapplication.app.modules.passwordresetpage.ui.PasswordResetPageActivity
import kotlin.String
import kotlin.Unit

class CheckEmailPageActivity :
    BaseActivity<ActivityCheckEmailPageBinding>(R.layout.activity_check_email_page) {
  private val viewModel: CheckEmailPageVM by viewModels<CheckEmailPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.checkEmailPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtResetPassword.setOnClickListener {
      val destIntent = PasswordResetPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CHECK_EMAIL_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CheckEmailPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
