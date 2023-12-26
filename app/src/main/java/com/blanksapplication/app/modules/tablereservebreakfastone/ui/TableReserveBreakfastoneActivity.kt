package com.blanksapplication.app.modules.tablereservebreakfastone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.appcomponents.views.DatePickerFragment
import com.blanksapplication.app.databinding.ActivityTableReserveBreakfastoneBinding
import com.blanksapplication.app.modules.homepage.ui.HomePageActivity
import com.blanksapplication.app.modules.popupboxone.ui.PopupboxOneActivity
import com.blanksapplication.app.modules.tablereservebreakfastone.`data`.viewmodel.TableReserveBreakfastoneVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class TableReserveBreakfastoneActivity :
    BaseActivity<ActivityTableReserveBreakfastoneBinding>(R.layout.activity_table_reserve_breakfastone)
    {
  private val viewModel: TableReserveBreakfastoneVM by viewModels<TableReserveBreakfastoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tableReserveBreakfastoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearDate.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearDate(selectedDate)
      }
    }
    binding.btnConfirm.setOnClickListener {
      val destIntent = HomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnDelete.setOnClickListener {
      val destIntent = PopupboxOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  private fun onDateSelectedLinearDate(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "TABLE_RESERVE_BREAKFASTONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TableReserveBreakfastoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
