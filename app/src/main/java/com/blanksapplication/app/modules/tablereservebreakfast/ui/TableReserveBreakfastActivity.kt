package com.blanksapplication.app.modules.tablereservebreakfast.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityTableReserveBreakfastBinding
import com.blanksapplication.app.modules.done.ui.DoneActivity
import com.blanksapplication.app.modules.tablereservebreakfast.`data`.viewmodel.TableReserveBreakfastVM
import kotlin.String
import kotlin.Unit

class TableReserveBreakfastActivity :
    BaseActivity<ActivityTableReserveBreakfastBinding>(R.layout.activity_table_reserve_breakfast) {
  private val viewModel: TableReserveBreakfastVM by viewModels<TableReserveBreakfastVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tableReserveBreakfastVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnConfirm.setOnClickListener {
      val destIntent = DoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TABLE_RESERVE_BREAKFAST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TableReserveBreakfastActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
