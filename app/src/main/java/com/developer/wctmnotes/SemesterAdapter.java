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

        semHeading.setText(sem);

        return listItemView;
    }
}
