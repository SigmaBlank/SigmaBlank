package com.blanksapplication.app.modules.notificationson.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityNotificationsOnBinding
import com.blanksapplication.app.modules.notificationson.`data`.viewmodel.NotificationsOnVM
import kotlin.String
import kotlin.Unit

class NotificationsOnActivity :
    BaseActivity<ActivityNotificationsOnBinding>(R.layout.activity_notifications_on) {
  private val viewModel: NotificationsOnVM by viewModels<NotificationsOnVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationsOnVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_ON_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsOnActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
