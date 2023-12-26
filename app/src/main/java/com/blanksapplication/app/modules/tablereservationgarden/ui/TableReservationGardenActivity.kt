package com.blanksapplication.app.modules.tablereservationgarden.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityTableReservationGardenBinding
import com.blanksapplication.app.modules.tablereservationgarden.`data`.viewmodel.TableReservationGardenVM
import com.blanksapplication.app.modules.tablereservationgardenone.ui.TableReservationGardenoneActivity
import com.blanksapplication.app.modules.tablereservationgardentwo.ui.TableReservationGardentwoActivity
import com.blanksapplication.app.modules.tablereservebreakfast.ui.TableReserveBreakfastActivity
import kotlin.String
import kotlin.Unit

class TableReservationGardenActivity :
    BaseActivity<ActivityTableReservationGardenBinding>(R.layout.activity_table_reservation_garden)
    {
  private val viewModel: TableReservationGardenVM by viewModels<TableReservationGardenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tableReservationGardenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearLunchbutton.setOnClickListener {
      val destIntent = TableReservationGardentwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearDinnerbutton.setOnClickListener {
      val destIntent = TableReservationGardenoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = TableReserveBreakfastActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TABLE_RESERVATION_GARDEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TableReservationGardenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
