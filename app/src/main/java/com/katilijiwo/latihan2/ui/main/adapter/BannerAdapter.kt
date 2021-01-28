package com.katilijiwo.latihan2.ui.main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.RequestManager
import com.katilijiwo.latihan2.R
import com.katilijiwo.latihan2.data.remote.json.banner.Banner
import com.katilijiwo.latihan2.databinding.ListBannerBinding
import javax.inject.Inject

class BannerAdapter @Inject constructor(
    private val glide: RequestManager
): PagerAdapter() {

    private val listBanner = mutableListOf<Banner>()
    fun setListBanner(newListBanner: List<Banner>){
        listBanner.clear()
        listBanner.addAll(newListBanner)
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = container.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val binding: ListBannerBinding = DataBindingUtil.inflate(inflater, R.layout.list_banner, container, false)

        glide.load(listBanner[position].image).into(binding.ivSlider)

        container.addView(binding.root)
        return binding.root
    }

    override fun getCount(): Int = listBanner.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean = view == `object`

}