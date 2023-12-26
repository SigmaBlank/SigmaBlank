package com.blanksapplication.app.modules.tablereservationindoortwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityTableReservationIndoortwoBinding
import com.blanksapplication.app.modules.tablereservationindoor.ui.TableReservationIndoorActivity
import com.blanksapplication.app.modules.tablereservationindoorone.ui.TableReservationIndooroneActivity
import com.blanksapplication.app.modules.tablereservationindoortwo.`data`.viewmodel.TableReservationIndoortwoVM
import com.blanksapplication.app.modules.tablereservedinner.ui.TableReserveDinnerActivity
import kotlin.String
import kotlin.Unit

class TableReservationIndoortwoActivity :
    BaseActivity<ActivityTableReservationIndoortwoBinding>(R.layout.activity_table_reservation_indoortwo)
    {
  private val viewModel: TableReservationIndoortwoVM by viewModels<TableReservationIndoortwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tableReservationIndoortwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = TableReserveDinnerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearLunchbutton.setOnClickListener {
      val destIntent = TableReservationIndooroneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBreakfastbutto.setOnClickListener {
      val destIntent = TableReservationIndoorActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TABLE_RESERVATION_INDOORTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TableReservationIndoortwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
