package com.example.cworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cworldApp.FragmentAdapter
import com.example.cworldapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
	val binding by lazy {	ActivityMainBinding.inflate(layoutInflater)}
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		val fragmentList = listOf(PakageFragment(), RentFragment(), SaleFragment(), ReviewFragment())
		val adapter = FragmentAdapter(this)
		adapter.fragmentList = fragmentList
		binding.viewPager.adapter = adapter

		val tablTitles = listOf<String>("패키지", "대여", "구매", "리뷰")
		TabLayoutMediator(binding.tabLayout, binding.viewPager) {tab, i ->
			tab.text = tablTitles[i]
		}	.attach()
	}
}