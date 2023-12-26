package com.blanksapplication.app.modules.tablereservationgardenone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityTableReservationGardenoneBinding
import com.blanksapplication.app.modules.tablereservationgarden.ui.TableReservationGardenActivity
import com.blanksapplication.app.modules.tablereservationgardenone.`data`.viewmodel.TableReservationGardenoneVM
import com.blanksapplication.app.modules.tablereservationgardentwo.ui.TableReservationGardentwoActivity
import com.blanksapplication.app.modules.tablereservedinner.ui.TableReserveDinnerActivity
import kotlin.String
import kotlin.Unit

class TableReservationGardenoneActivity :
    BaseActivity<ActivityTableReservationGardenoneBinding>(R.layout.activity_table_reservation_gardenone)
    {
  private val viewModel: TableReservationGardenoneVM by viewModels<TableReservationGardenoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tableReservationGardenoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = TableReserveDinnerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLunchbutton.setOnClickListener {
      val destIntent = TableReservationGardentwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBreakfastbutto.setOnClickListener {
      val destIntent = TableReservationGardenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TABLE_RESERVATION_GARDENONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TableReservationGardenoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
