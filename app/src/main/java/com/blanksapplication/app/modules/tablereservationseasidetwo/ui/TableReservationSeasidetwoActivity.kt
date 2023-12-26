package com.blanksapplication.app.modules.tablereservationseasidetwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityTableReservationSeasidetwoBinding
import com.blanksapplication.app.modules.tablereservationseaside.ui.TableReservationSeasideActivity
import com.blanksapplication.app.modules.tablereservationseasideone.ui.TableReservationSeasideoneActivity
import com.blanksapplication.app.modules.tablereservationseasidetwo.`data`.viewmodel.TableReservationSeasidetwoVM
import com.blanksapplication.app.modules.tablereservedinner.ui.TableReserveDinnerActivity
import kotlin.String
import kotlin.Unit

class TableReservationSeasidetwoActivity :
    BaseActivity<ActivityTableReservationSeasidetwoBinding>(R.layout.activity_table_reservation_seasidetwo)
    {
  private val viewModel: TableReservationSeasidetwoVM by viewModels<TableReservationSeasidetwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tableReservationSeasidetwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearBreakfastbutto.setOnClickListener {
      val destIntent = TableReservationSeasideoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearLunchbutton.setOnClickListener {
      val destIntent = TableReservationSeasideActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = TableReserveDinnerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TABLE_RESERVATION_SEASIDETWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TableReservationSeasidetwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
