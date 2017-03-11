package com.developer.wctmnotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> branches;
    private SemesterAdapter semesterAdapter;
    private ListView listView;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        branches = new ArrayList<>();
        branches.add("CSE");
        branches.add("IT");
        branches.add("ECE");
        branches.add("EEE");
        branches.add("ME");
        branches.add("Civil");
        branches.add("BCA");
        branches.add("MCA");

        listView = (ListView) findViewById(R.id.list_view);

        semesterAdapter = new SemesterAdapter(this, branches);
        listView.setAdapter(semesterAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent = new Intent(MainActivity.this, SemesterActivity.class);
                intent.putExtra("Branch", branches.get(position));
                startActivity(intent);
            }
        });
    }
}
