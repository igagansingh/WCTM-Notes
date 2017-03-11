package com.developer.wctmnotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SemesterActivity extends AppCompatActivity {

    private ArrayList<String> semesters;
    private SemesterAdapter semesterAdapter;
    private ListView listView;
    private Intent intent;
    private String branch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);

        branch = getIntent().getExtras().getString("Branch");
        semesters = new ArrayList<>();

        switch(branch){
            case "MCA":
                semesters.add("One");
                semesters.add("Two");
                semesters.add("Three");
                semesters.add("Four");
                break;
            case "BCA":
                semesters.add("One");
                semesters.add("Two");
                semesters.add("Three");
                semesters.add("Four");
                semesters.add("Five");
                semesters.add("Six");
                break;
            default:
                semesters.add("One");
                semesters.add("Two");
                semesters.add("Three");
                semesters.add("Four");
                semesters.add("Five");
                semesters.add("Six");
                semesters.add("Seven");
                break;
        }
        listView = (ListView) findViewById(R.id.list_view);

        semesterAdapter = new SemesterAdapter(this, semesters);
        listView.setAdapter(semesterAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent = new Intent(SemesterActivity.this, SubjectsActivity.class);
                intent.putExtra("Semester", semesters.get(position));
                intent.putExtra("Branch",branch);
                startActivity(intent);
            }
        });

    }
}
