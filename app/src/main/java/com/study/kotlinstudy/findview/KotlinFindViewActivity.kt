package com.study.kotlinstudy.findview

import android.app.Activity
import android.os.Bundle
import com.study.kotlinstudy.R
import kotlinx.android.synthetic.main.activity_findview.*

class KotlinFindViewActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_findview)
        tv_title.text = "IT互联网大叔"
    }

}