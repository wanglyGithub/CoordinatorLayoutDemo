package com.wanlgy.coordinatorlayoudemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;

public class ScrollingActivity extends AppCompatActivity {

    private CollapsingToolbarLayout toolbar_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);


        toolbar_layout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolbar_layout.setExpandedTitleColor(Color.WHITE);
        toolbar_layout.setCollapsedTitleTextColor(Color.WHITE);
    }


}
