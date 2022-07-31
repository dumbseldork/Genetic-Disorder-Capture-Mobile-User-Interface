package com.skam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Instructions extends AppCompatActivity {
    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;

    private TextView[] mDots;
    private SliderAdapter sliderAdapter;

    private Button mNextBtn;
    private Button mBackBtn;
    private Button mStartBtn;

    private int mCurrentPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        mSlideViewPager=(ViewPager)findViewById(R.id.slideViewPager);
        mDotLayout=(LinearLayout)findViewById(R.id.dotsLayout);

        mNextBtn=(Button)findViewById(R.id.nextBtn);
        mBackBtn=(Button)findViewById(R.id.prevBtn);
        mStartBtn=(Button)findViewById(R.id.StartBtn);


        sliderAdapter=new SliderAdapter(this);

        mSlideViewPager.setAdapter(sliderAdapter);

        addDotsIndicator(0);

        mSlideViewPager.addOnPageChangeListener(viewListener);

        //OnClickListeners
        mNextBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                mSlideViewPager.setCurrentItem(mCurrentPage + 1);

            }

        });

        mBackBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                mSlideViewPager.setCurrentItem(mCurrentPage - 1);
            }
        });

        mStartBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openMain();
            }
        });

    }

    public void addDotsIndicator(int position){

        mDots = new TextView[4];
        mDotLayout.removeAllViews();

        for (int i = 0; i < mDots.length; i++){

            mDots[i]=new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorPrimaryDark));

            mDotLayout.addView(mDots[i]);

        }
        if (mDots.length > 0){

            mDots[position].setTextColor(getResources().getColor(R.color.colorPrimary));
        }
    }

    ViewPager.OnPageChangeListener viewListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            addDotsIndicator(i);

            mCurrentPage=i;

            if (i==0){

                mNextBtn.setEnabled(true);
                mBackBtn.setEnabled(false);
                mStartBtn.setEnabled(false);

                mNextBtn.setVisibility(View.VISIBLE);
                mBackBtn.setVisibility(View.INVISIBLE);
                mStartBtn.setVisibility(View.INVISIBLE);

                mNextBtn.setText("Next");

            }else if (i == mDots.length - 1){

                mNextBtn.setEnabled(false);
                mStartBtn.setEnabled(true);
                mBackBtn.setEnabled(true);

                mNextBtn.setVisibility(View.INVISIBLE);
                mBackBtn.setVisibility(View.VISIBLE);
                mStartBtn.setVisibility(View.VISIBLE);

                mStartBtn.setText("Start");
                mBackBtn.setText("Back");

            }else{

                mNextBtn.setEnabled(true);
                mBackBtn.setEnabled(true);
                mStartBtn.setEnabled(false);

                mNextBtn.setVisibility(View.VISIBLE);
                mBackBtn.setVisibility(View.VISIBLE);
                mStartBtn.setVisibility(View.INVISIBLE);


                mNextBtn.setText("Next");
                mBackBtn.setText("Back");

            }


        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
    public void openMain(){
        Intent intent=new Intent(this, Main.class);
        startActivity(intent);
    }
}