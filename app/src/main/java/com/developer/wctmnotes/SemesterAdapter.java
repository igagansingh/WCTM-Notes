package com.developer.wctmnotes;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gagan on 22/2/17.
 */

public class SemesterAdapter extends ArrayAdapter<String> {

    SemesterAdapter(Activity context, ArrayList<String> semesters){
        super(context, 0, semesters);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.each_semesters_layout, parent, false);
        }
        String sem = getItem(position);

        TextView semHeading = (TextView) listItemView.findViewById(R.id.textView2);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);

        switch (sem){
            case "CSE": imageView.setImageResource(R.drawable.cse);
                semHeading.setText("Computer Science Engineering");
                break;
            case "IT": imageView.setImageResource(R.drawable.it);
                semHeading.setText("Information Technology");
                break;
            case "ECE": imageView.setImageResource(R.drawable.ece);
                semHeading.setText("Electronics Communication Engineering");
                break;
            case "EEE": imageView.setImageResource(R.drawable.eee);
                semHeading.setText("Electronics and Electric Engineering");
                break;
            case "ME": imageView.setImageResource(R.drawable.me);
                semHeading.setText("Mechanical Engineering");
                break;
            case "Civil": imageView.setImageResource(R.drawable.ce);
                semHeading.setText("Civil Engineering");
                break;
            case "BCA": imageView.setImageResource(R.drawable.bca);
                semHeading.setText("Bachelors in Computer Application");
                break;
            case "MCA": imageView.setImageResource(R.drawable.mca);
                semHeading.setText("Masters in Computer Application");
                break;
            case "One": imageView.setImageResource(R.drawable.one);
                semHeading.setText("First Semester");
                break;
            case "Two": imageView.setImageResource(R.drawable.two);
                semHeading.setText("Second Semester");
                break;
            case "Three": imageView.setImageResource(R.drawable.three);
                semHeading.setText("Three Semester");
                break;
            case "Four": imageView.setImageResource(R.drawable.four);
                semHeading.setText("Four Semester");
                break;
            case "Five": imageView.setImageResource(R.drawable.five);
                semHeading.setText("Five Semester");
                break;
            case "Six": imageView.setImageResource(R.drawable.six);
                semHeading.setText("Six Semester");
                break;
            case "Seven": imageView.setImageResource(R.drawable.seven);
                semHeading.setText("Seven Semester");
                break;

        }
        return listItemView;
    }
}
