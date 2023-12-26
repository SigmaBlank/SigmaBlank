package com.blanksapplication.app.modules.tablereservationindoor.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityTableReservationIndoorBinding
import com.blanksapplication.app.modules.tablereservationindoor.`data`.viewmodel.TableReservationIndoorVM
import com.blanksapplication.app.modules.tablereservationindoorone.ui.TableReservationIndooroneActivity
import com.blanksapplication.app.modules.tablereservationindoortwo.ui.TableReservationIndoortwoActivity
import com.blanksapplication.app.modules.tablereservebreakfast.ui.TableReserveBreakfastActivity
import kotlin.String
import kotlin.Unit

class TableReservationIndoorActivity :
    BaseActivity<ActivityTableReservationIndoorBinding>(R.layout.activity_table_reservation_indoor)
    {
  private val viewModel: TableReservationIndoorVM by viewModels<TableReservationIndoorVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tableReservationIndoorVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearDinnerbutton.setOnClickListener {
      val destIntent = TableReservationIndoortwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearLunchbutton.setOnClickListener {
      val destIntent = TableReservationIndooroneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = TableReserveBreakfastActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TABLE_RESERVATION_INDOOR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TableReservationIndoorActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
