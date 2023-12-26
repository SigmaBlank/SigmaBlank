package com.blanksapplication.app.modules.tablereservationgardentwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityTableReservationGardentwoBinding
import com.blanksapplication.app.modules.tablereservationgarden.ui.TableReservationGardenActivity
import com.blanksapplication.app.modules.tablereservationgardenone.ui.TableReservationGardenoneActivity
import com.blanksapplication.app.modules.tablereservationgardentwo.`data`.viewmodel.TableReservationGardentwoVM
import com.blanksapplication.app.modules.tablereservelunch.ui.TableReserveLunchActivity
import kotlin.String
import kotlin.Unit

class TableReservationGardentwoActivity :
    BaseActivity<ActivityTableReservationGardentwoBinding>(R.layout.activity_table_reservation_gardentwo)
    {
  private val viewModel: TableReservationGardentwoVM by viewModels<TableReservationGardentwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tableReservationGardentwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearBreakfastbutto.setOnClickListener {
      val destIntent = TableReservationGardenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDinnerbutton.setOnClickListener {
      val destIntent = TableReservationGardenoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = TableReserveLunchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TABLE_RESERVATION_GARDENTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TableReservationGardentwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
