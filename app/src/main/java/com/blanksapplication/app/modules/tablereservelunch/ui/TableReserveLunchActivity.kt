package com.blanksapplication.app.modules.tablereservelunch.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityTableReserveLunchBinding
import com.blanksapplication.app.modules.done.ui.DoneActivity
import com.blanksapplication.app.modules.tablereservelunch.`data`.viewmodel.TableReserveLunchVM
import kotlin.String
import kotlin.Unit

class TableReserveLunchActivity :
    BaseActivity<ActivityTableReserveLunchBinding>(R.layout.activity_table_reserve_lunch) {
  private val viewModel: TableReserveLunchVM by viewModels<TableReserveLunchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tableReserveLunchVM = viewModel
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
    const val TAG: String = "TABLE_RESERVE_LUNCH_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TableReserveLunchActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
