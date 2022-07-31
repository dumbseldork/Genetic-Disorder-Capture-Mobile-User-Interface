package com.skam;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAbout extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAbout(Context context){
        this.context=context;
    }

    //Arrays
    public int[] slide_picture = {
            R.drawable.wil,
            R.drawable.tan,
            R.drawable.steph,
            R.drawable.gelo,
            R.drawable.benj,
            R.drawable.lyn
    };

    public String[] slide_name = {
            "Alberio, Jean Wilmar G.",
            "Apuang, Jonathan G",
            "Cruz, John Stephen B.",
            "Gomez, Mark Angelo B.",
            "Molina, Benjamin Jr., V.",
            "Tuala, Lyndon T."
    };

    public String[] slide_profile = {
            "GUI (Android Studio) Designer",
            "GUI (Android Studio) Designer",
            "Python (Pycharm) Coder",
            "Public Relations (Deployment)",
            "Public Relations (Deployment)",
            "Python (Pycharm) Coder"
    };

    @Override
    public int getCount(){
        return slide_name.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o){
        return view==(RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.slide_about, container, false);

        ImageView slideImageView=(ImageView) view.findViewById(R.id.slide_picture);
        TextView slideHeading=(TextView) view.findViewById(R.id.slide_name);
        TextView slideDescription=(TextView) view.findViewById(R.id.slide_profile);

        slideImageView.setImageResource(slide_picture[position]);
        slideHeading.setText(slide_name[position]);
        slideDescription.setText(slide_profile[position]);

        container.addView(view);

        return view;

    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object){

        container.removeView((RelativeLayout)object);
    }
}
