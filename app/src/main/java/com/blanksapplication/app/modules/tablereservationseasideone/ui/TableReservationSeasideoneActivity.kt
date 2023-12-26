package com.blanksapplication.app.modules.tablereservationseasideone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityTableReservationSeasideoneBinding
import com.blanksapplication.app.modules.tablereservationseaside.ui.TableReservationSeasideActivity
import com.blanksapplication.app.modules.tablereservationseasideone.`data`.viewmodel.TableReservationSeasideoneVM
import com.blanksapplication.app.modules.tablereservationseasidetwo.ui.TableReservationSeasidetwoActivity
import com.blanksapplication.app.modules.tablereservebreakfast.ui.TableReserveBreakfastActivity
import kotlin.String
import kotlin.Unit

class TableReservationSeasideoneActivity :
    BaseActivity<ActivityTableReservationSeasideoneBinding>(R.layout.activity_table_reservation_seasideone)
    {
  private val viewModel: TableReservationSeasideoneVM by viewModels<TableReservationSeasideoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tableReservationSeasideoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = TableReserveBreakfastActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDinnerbutton.setOnClickListener {
      val destIntent = TableReservationSeasidetwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLunchbutton.setOnClickListener {
      val destIntent = TableReservationSeasideActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TABLE_RESERVATION_SEASIDEONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TableReservationSeasideoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
