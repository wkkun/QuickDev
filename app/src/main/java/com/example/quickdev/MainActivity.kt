package com.example.quickdev

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.basefunction.ui.base.BaseActivity
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch(CoroutineExceptionHandler { t, s ->

        }) {

        }
    }

}