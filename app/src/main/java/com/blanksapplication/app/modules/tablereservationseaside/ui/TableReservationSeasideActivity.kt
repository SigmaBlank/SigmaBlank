package com.blanksapplication.app.modules.tablereservationseaside.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityTableReservationSeasideBinding
import com.blanksapplication.app.modules.tablereservationseaside.`data`.viewmodel.TableReservationSeasideVM
import com.blanksapplication.app.modules.tablereservationseasideone.ui.TableReservationSeasideoneActivity
import com.blanksapplication.app.modules.tablereservationseasidetwo.ui.TableReservationSeasidetwoActivity
import com.blanksapplication.app.modules.tablereservelunch.ui.TableReserveLunchActivity
import kotlin.String
import kotlin.Unit

class TableReservationSeasideActivity :
    BaseActivity<ActivityTableReservationSeasideBinding>(R.layout.activity_table_reservation_seaside)
    {
  private val viewModel: TableReservationSeasideVM by viewModels<TableReservationSeasideVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tableReservationSeasideVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearDinnerbutton.setOnClickListener {
      val destIntent = TableReservationSeasidetwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = TableReserveLunchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBreakfastbutto.setOnClickListener {
      val destIntent = TableReservationSeasideoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TABLE_RESERVATION_SEASIDE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TableReservationSeasideActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
