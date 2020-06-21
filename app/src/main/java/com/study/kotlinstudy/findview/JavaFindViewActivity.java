package com.study.kotlinstudy.findview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.study.kotlinstudy.R;

public class JavaFindViewActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findview);

        TextView tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText("IT互联网大叔");
    }
}
