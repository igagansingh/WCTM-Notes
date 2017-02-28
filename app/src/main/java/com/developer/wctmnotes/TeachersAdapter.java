package com.developer.wctmnotes;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.util.ArrayList;

/**
 * Created by gagan on 28/2/17.
 */

public class TeachersAdapter extends ArrayAdapter<String> {

    ArrayList<String> teachers;
    ArrayList<String> selectedTeachers;

    TeachersAdapter(Activity context, ArrayList<String> teachers){
        super(context, 0, teachers);
        this.teachers = teachers;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        selectedTeachers = new ArrayList<>();
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.each_teacher_layout, parent, false);
        }

        final CheckBox checkBox = (CheckBox) listItemView.findViewById(R.id.checkBox);
        checkBox.setText(teachers.get(position));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    selectedTeachers.add(checkBox.getText().toString());
                else
                    selectedTeachers.remove(checkBox.getText().toString());
            }
        });

        return listItemView;
    }

    ArrayList<String> getSelectedTeachers(){
        return selectedTeachers;
    }
}
