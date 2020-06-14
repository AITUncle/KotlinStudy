package com.study.kotlinstudy.param

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class KotlinTextView : AppCompatTextView {

    constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = android.R.attr.textViewStyle
    ) : super(context, attrs, defStyleAttr){

    }
}