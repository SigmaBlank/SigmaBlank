package com.blanksapplication.app.modules.notification.ui

import android.view.View
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityNotificationBinding
import com.blanksapplication.app.modules.notification.`data`.model.ListrectanglenineRowModel
import com.blanksapplication.app.modules.notification.`data`.model.ListrectanglenineTwoRowModel
import com.blanksapplication.app.modules.notification.`data`.viewmodel.NotificationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationActivity :
    BaseActivity<ActivityNotificationBinding>(R.layout.activity_notification) {
  private val viewModel: NotificationVM by viewModels<NotificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglenineAdapter =
    ListrectanglenineAdapter(viewModel.listrectanglenineList.value?:mutableListOf())
    binding.recyclerListrectanglenine.adapter = listrectanglenineAdapter
    listrectanglenineAdapter.setOnItemClickListener(
    object : ListrectanglenineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectanglenineRowModel) {
        onClickRecyclerListrectanglenine(view, position, item)
      }
    }
    )
    viewModel.listrectanglenineList.observe(this) {
      listrectanglenineAdapter.updateData(it)
    }
    val listrectanglenineTwoAdapter =
    ListrectanglenineTwoAdapter(viewModel.listrectanglenineTwoList.value?:mutableListOf())
    binding.recyclerListrectanglenineTwo.adapter = listrectanglenineTwoAdapter
    listrectanglenineTwoAdapter.setOnItemClickListener(
    object : ListrectanglenineTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectanglenineTwoRowModel) {
        onClickRecyclerListrectanglenineTwo(view, position, item)
      }
    }
    )
    viewModel.listrectanglenineTwoList.observe(this) {
      listrectanglenineTwoAdapter.updateData(it)
    }
    binding.notificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectanglenine(
    view: View,
    position: Int,
    item: ListrectanglenineRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectanglenineTwo(
    view: View,
    position: Int,
    item: ListrectanglenineTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_ACTIVITY"

  }
}
