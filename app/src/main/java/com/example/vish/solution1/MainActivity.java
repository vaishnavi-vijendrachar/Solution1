package com.example.vish.solution1;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends FragmentActivity implements View.OnClickListener{

    LinearLayout colorLayout;
    TextView red,green,blue,item1,item2,item3,item4,item5,displayItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*if(savedInstanceState != null){
            displayItem.setText(savedInstanceState.getString("displaytext"));
        }*/
        setContentView(R.layout.activity_main);
        setUpViewPager();
        setUpHorizontalScroll();
        setUpButtonView();

    }

    private void setUpButtonView() {
        red = findViewById(R.id.red);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);
        red.setOnClickListener(MainActivity.this);
        green.setOnClickListener(MainActivity.this);
        blue.setOnClickListener(MainActivity.this);
        colorLayout = findViewById(R.id.color_layout);
    }

    private void setUpHorizontalScroll() {
        displayItem = findViewById(R.id.display_item);
        item1 = findViewById(R.id.item1);
        item2 = findViewById(R.id.item2);
        item3 = findViewById(R.id.item3);
        item4 = findViewById(R.id.item4);
        item5 = findViewById(R.id.item5);
        item1.setOnClickListener(MainActivity.this);
        item2.setOnClickListener(MainActivity.this);
        item3.setOnClickListener(MainActivity.this);
        item4.setOnClickListener(MainActivity.this);
        item5.setOnClickListener(MainActivity.this);

        HorizontalScrollView horizontalScrollView = findViewById(R.id.horizontal_scroll);
        horizontalScrollView.setOnClickListener(MainActivity.this);

    }

    private void setUpViewPager() {
        ViewPager pager = findViewById(R.id.pager);
        pager.setAdapter(new SolutionPagerAdapter(getSupportFragmentManager()));
        TabLayout tabLayout = findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(pager,true);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.red : colorLayout.setBackgroundColor(Color.parseColor("#C51162"));
            break;
            case R.id.green :colorLayout.setBackgroundColor(Color.parseColor("#018786"));
            break;
            case R.id.blue:colorLayout.setBackgroundColor(Color.parseColor("#3700B3"));
            break;
            case R.id.item1 : displayItem.setText("Item 1 displayed");
                break;
            case R.id.item2 :displayItem.setText("Item 2 displayed");
                break;
            case R.id.item3 :displayItem.setText("Item 3 displayed");
                break;
            case R.id.item4 :displayItem.setText("Item 4 displayed");
                break;
            case R.id.item5 :displayItem.setText("Item 5 displayed");
                break;
        }
    }


}
