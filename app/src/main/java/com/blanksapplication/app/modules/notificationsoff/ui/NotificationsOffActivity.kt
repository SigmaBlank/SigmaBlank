package com.blanksapplication.app.modules.notificationsoff.ui

import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityNotificationsOffBinding
import com.blanksapplication.app.modules.notificationsoff.`data`.viewmodel.NotificationsOffVM
import kotlin.String
import kotlin.Unit

class NotificationsOffActivity :
    BaseActivity<ActivityNotificationsOffBinding>(R.layout.activity_notifications_off) {
  private val viewModel: NotificationsOffVM by viewModels<NotificationsOffVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationsOffVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_OFF_ACTIVITY"

  }
}
