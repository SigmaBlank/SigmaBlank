package com.blanksapplication.app.modules.deleteaccount.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityDeleteAccountBinding
import com.blanksapplication.app.modules.deleteaccount.`data`.viewmodel.DeleteAccountVM
import com.blanksapplication.app.modules.loginpage.ui.LoginPageActivity
import kotlin.String
import kotlin.Unit

class DeleteAccountActivity :
    BaseActivity<ActivityDeleteAccountBinding>(R.layout.activity_delete_account) {
  private val viewModel: DeleteAccountVM by viewModels<DeleteAccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.deleteAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnConfirmation.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DELETE_ACCOUNT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DeleteAccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
