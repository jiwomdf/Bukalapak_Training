package com.katilijiwo.latihan2.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.katilijiwo.latihan2.R
import com.katilijiwo.latihan2.base.BaseActivity
import com.katilijiwo.latihan2.base.BaseViewModel
import com.katilijiwo.latihan2.databinding.ActivityMainBinding
import com.katilijiwo.latihan2.ui.main.adapter.BannerAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    R.layout.activity_main,
    MainViewModel::class.java
) {

    @Inject
    lateinit var bannerAdapter: BannerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.fetchFlashBanners()
        viewModel.fetchCategories()
        setupRecyclerView()
    }

    override fun setListener() {
        super.setListener()

        viewModel.flashBanners.observe(this, { event ->
            when(event){
                is BaseViewModel.Event.Success -> {
                    if(event.data != null){
                        bannerAdapter.setListBanner(event.data)
                        bannerAdapter.notifyDataSetChanged()
                    }
                    showLoading(false)
                }
                is BaseViewModel.Event.Error -> {
                    showLoading(false)
                }
                is BaseViewModel.Event.Loading -> {
                    showLoading(true)
                }
            }
        })

        viewModel.categories.observe(this, { event ->
            when(event){
                is BaseViewModel.Event.Success -> {
                    if(event.data != null){
                        val test= ""
                    }
                    showLoading(false)
                }
                is BaseViewModel.Event.Error -> {
                    showLoading(false)
                }
                is BaseViewModel.Event.Loading -> {
                    showLoading(true)
                }
            }
        })
    }

    private fun setupRecyclerView(){
        binding.vpSlider.adapter = bannerAdapter
        binding.indicator.setViewPager(binding.vpSlider)
        binding.indicator.radius = 5 * resources.displayMetrics.density
        binding.indicator.setOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {}
            override fun onPageSelected(position: Int) {}
            override fun onPageScrollStateChanged(state: Int) {}
        })

    }
}