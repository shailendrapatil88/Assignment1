package com.bits.assignment1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bits.assignment1.adapters.PagerAdapter;
import com.bits.assignment1.fragment.PagerFragment;
import com.bits.assignment1.handler.TopItemManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, PagerFragment.OnFragmentInteractionListener, TopItemManager.ItemClickListener, ViewPager.OnPageChangeListener {

    private RadioGroup radioGroup;
    private TextView tvItemPresenter;
    private LinearLayout bottomLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    /*
    * Initialize views and set all listeners
    */
    private void initView() {
        new TopItemManager(findViewById(R.id.top_item_container), this);
        tvItemPresenter = (TextView) findViewById(R.id.textViewItemPresenter);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setCurrentItem(0); // set first item as a selected.
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
        viewPager.addOnPageChangeListener(this);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.check(R.id.radioButton1);
        bottomLayout = (LinearLayout) findViewById(R.id.bottom_layout);
        Button btnRed = (Button) findViewById(R.id.btnRed);
        Button btnGreen = (Button) findViewById(R.id.btnGreen);
        Button btnBlue = (Button) findViewById(R.id.btnBlue);

        btnRed.setOnClickListener(this);
        btnGreen.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
    }

    @Override
    public void onItemClick(String name) {
        tvItemPresenter.setText(name);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0: {
                radioGroup.check(R.id.radioButton1);
            }
            break;
            case 1: {
                radioGroup.check(R.id.radioButton2);
            }
            break;
            case 2: {
                radioGroup.check(R.id.radioButton3);
            }
            break;
            case 3: {
                radioGroup.check(R.id.radioButton4);
            }
            break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onFragmentClick(int number) {
        Toast.makeText(this, String.format("fragment %d clicked.", number), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnRed:
                bottomLayout.setBackgroundColor(Color.RED);
                break;
            case R.id.btnGreen:
                bottomLayout.setBackgroundColor(Color.GREEN);
                break;
            case R.id.btnBlue:
                bottomLayout.setBackgroundColor(Color.BLUE);
                break;
        }
    }
}
