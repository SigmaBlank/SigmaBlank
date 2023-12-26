package com.blanksapplication.app.modules.tablereservedinner.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityTableReserveDinnerBinding
import com.blanksapplication.app.modules.done.ui.DoneActivity
import com.blanksapplication.app.modules.tablereservedinner.`data`.viewmodel.TableReserveDinnerVM
import kotlin.String
import kotlin.Unit

class TableReserveDinnerActivity :
    BaseActivity<ActivityTableReserveDinnerBinding>(R.layout.activity_table_reserve_dinner) {
  private val viewModel: TableReserveDinnerVM by viewModels<TableReserveDinnerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tableReserveDinnerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnConfirm.setOnClickListener {
      val destIntent = DoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TABLE_RESERVE_DINNER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TableReserveDinnerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
