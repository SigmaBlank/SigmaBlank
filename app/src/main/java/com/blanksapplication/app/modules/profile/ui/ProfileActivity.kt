package com.blanksapplication.app.modules.profile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityProfileBinding
import com.blanksapplication.app.modules.changepassword.ui.ChangePasswordActivity
import com.blanksapplication.app.modules.deleteaccount.ui.DeleteAccountActivity
import com.blanksapplication.app.modules.editprofile.ui.EditProfileActivity
import com.blanksapplication.app.modules.loginpage.ui.LoginPageActivity
import com.blanksapplication.app.modules.notificationson.ui.NotificationsOnActivity
import com.blanksapplication.app.modules.profile.`data`.viewmodel.ProfileVM
import com.blanksapplication.app.modules.review.ui.ReviewActivity
import kotlin.String
import kotlin.Unit

class ProfileActivity : BaseActivity<ActivityProfileBinding>(R.layout.activity_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogout.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupThree.setOnClickListener {
      val destIntent = ChangePasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupFour.setOnClickListener {
      val destIntent = EditProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupFive.setOnClickListener {
      val destIntent = NotificationsOnActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupSix.setOnClickListener {
      val destIntent = DeleteAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupSeven.setOnClickListener {
      val destIntent = ReviewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
