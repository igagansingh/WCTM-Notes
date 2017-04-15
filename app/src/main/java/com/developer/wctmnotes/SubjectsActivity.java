package com.developer.wctmnotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class SubjectsActivity extends AppCompatActivity {

    private ListView listView;
    private Intent intent;
    private ArrayAdapter<String> semAdapter;
    private String branch;
    private String semester;
    private ArrayList<String> subjects;
    private static String TEACHERS_JSON_DATA="";


    private void loadJsonAndActivity(String json){
        Log.d("Subjects", json);
        if(json.equals("")) {
            Toast.makeText(this, "Data not loaded, try again!", Toast.LENGTH_SHORT).show();
        }
        else {
            try {
                JSONObject obj = new JSONObject(json);
                JSONObject start = obj.getJSONObject("Branch");
                JSONObject streamObj = start.getJSONObject(branch);
                JSONObject semestersObj = streamObj.getJSONObject("Semester");
                JSONObject semeterNumObj = semestersObj.getJSONObject(semester);
                JSONObject subjectsObj = semeterNumObj.getJSONObject("Subjects");
                Iterator<String> keys = subjectsObj.keys();
                while (keys.hasNext()) {
                    subjects.add(keys.next());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            semAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, subjects);
            listView.setAdapter(semAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                    intent.putExtra("Branch", branch);
                    intent.putExtra("Semester", semester);
                    intent.putExtra("Subject", subjects.get(position));
                    intent.putExtra("JSON", TEACHERS_JSON_DATA);
                    startActivity(intent);
                }
            });
            Toast.makeText(this, "Branch : " + branch + ", Semester : " + semester, Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        subjects = new ArrayList<>();

        listView = (ListView) findViewById(R.id.list_view);

        branch   = getIntent().getExtras().getString("Branch");
        semester = getIntent().getExtras().getString("Semester");
        TEACHERS_JSON_DATA = getIntent().getExtras().getString("JSON");
        loadJsonAndActivity(TEACHERS_JSON_DATA);

    }
}
