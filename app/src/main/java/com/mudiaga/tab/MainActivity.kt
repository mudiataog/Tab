package com.mudiaga.tab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mudiaga.tab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var whatsAppsAdapter: WhatsAppsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        whatsAppsAdapter = WhatsAppsAdapter(supportFragmentManager)
        binding.pager.adapter = whatsAppsAdapter
        binding.tabLayout.setupWithViewPager(binding.pager)
    }
}