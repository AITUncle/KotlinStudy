package com.study.kotlinstudy.param;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class JavaTextView extends AppCompatTextView {
    public JavaTextView(Context context) {
        super(context);
    }

    public JavaTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public JavaTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
