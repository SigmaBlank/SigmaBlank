package com.blanksapplication.app.modules.tablereservationindoorone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityTableReservationIndooroneBinding
import com.blanksapplication.app.modules.tablereservationindoor.ui.TableReservationIndoorActivity
import com.blanksapplication.app.modules.tablereservationindoorone.`data`.viewmodel.TableReservationIndooroneVM
import com.blanksapplication.app.modules.tablereservationindoortwo.ui.TableReservationIndoortwoActivity
import com.blanksapplication.app.modules.tablereservelunch.ui.TableReserveLunchActivity
import kotlin.String
import kotlin.Unit

class TableReservationIndooroneActivity :
    BaseActivity<ActivityTableReservationIndooroneBinding>(R.layout.activity_table_reservation_indoorone)
    {
  private val viewModel: TableReservationIndooroneVM by viewModels<TableReservationIndooroneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tableReservationIndooroneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearBreakfastbutto.setOnClickListener {
      val destIntent = TableReservationIndoorActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearDinnerbutton.setOnClickListener {
      val destIntent = TableReservationIndoortwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = TableReserveLunchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TABLE_RESERVATION_INDOORONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TableReservationIndooroneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
