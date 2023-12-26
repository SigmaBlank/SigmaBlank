package com.blanksapplication.app.modules.signuppage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivitySignUpPageBinding
import com.blanksapplication.app.modules.loginpage.ui.LoginPageActivity
import com.blanksapplication.app.modules.signuppage.`data`.viewmodel.SignUpPageVM
import kotlin.String
import kotlin.Unit

class SignUpPageActivity : BaseActivity<ActivitySignUpPageBinding>(R.layout.activity_sign_up_page) {
  private val viewModel: SignUpPageVM by viewModels<SignUpPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignUpOne.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
