package com.blanksapplication.app.modules.homepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.blanksapplication.app.R
import com.blanksapplication.app.appcomponents.base.BaseActivity
import com.blanksapplication.app.databinding.ActivityHomePageBinding
import com.blanksapplication.app.modules.history.ui.HistoryActivity
import com.blanksapplication.app.modules.homepage.`data`.viewmodel.HomePageVM
import com.blanksapplication.app.modules.tablereservationgarden.ui.TableReservationGardenActivity
import com.blanksapplication.app.modules.tablereservationindoor.ui.TableReservationIndoorActivity
import com.blanksapplication.app.modules.tablereservationseasideone.ui.TableReservationSeasideoneActivity
import kotlin.String
import kotlin.Unit

class HomePageActivity : BaseActivity<ActivityHomePageBinding>(R.layout.activity_home_page) {
  private val viewModel: HomePageVM by viewModels<HomePageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homePageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleThirteenOne.setOnClickListener {
      val destIntent = TableReservationIndoorActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirteen.setOnClickListener {
      val destIntent = TableReservationGardenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNotificationMe.setOnClickListener {
      val destIntent = HistoryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirteenTwo.setOnClickListener {
      val destIntent = TableReservationSeasideoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOME_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomePageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
