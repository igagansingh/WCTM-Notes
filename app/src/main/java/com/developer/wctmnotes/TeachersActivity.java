package com.developer.wctmnotes;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class TeachersActivity extends AppCompatActivity {

    private ListView listView;
    private Button soft, hard;
    private String branch, semester, subject;
    private ArrayList<String> selectedTeachers,teachers;
    private TeachersAdapter teachersAdapter;

    public String loadJSONFromAsset() {
        String json;
        try {
            InputStream is = getAssets().open("teachers.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            Log.d("Testing 101-Json file","Exception occurred");
            return null;
        }
        return json;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);

        branch = getIntent().getExtras().getString("Branch");
        semester = getIntent().getExtras().getString("Semester");
        subject = getIntent().getExtras().getString("Subject");

        listView = (ListView) findViewById(R.id.list);
        soft = (Button) findViewById(R.id.soft);
        hard = (Button) findViewById(R.id.hard);

        teachers = new ArrayList<>();
        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            JSONObject start = obj.getJSONObject("Branch");
            JSONObject streamObj = start.getJSONObject(branch);
            JSONObject semestersObj = streamObj.getJSONObject("Semester");
            JSONObject semeterNumObj = semestersObj.getJSONObject(semester);
            JSONObject subjectsObj = semeterNumObj.getJSONObject("Subjects");
            JSONObject subjectSelectedObj = subjectsObj.getJSONObject(subject);
            JSONArray teachersArr = subjectSelectedObj.getJSONArray("Teachers");
            for (int i = 0; i < teachersArr.length(); i++) {
                teachers.add(teachersArr.getString(i));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        teachersAdapter = new TeachersAdapter(TeachersActivity.this, teachers);
        listView.setAdapter(teachersAdapter);

        soft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTeachers = teachersAdapter.getSelectedTeachers();

                String url = "https://drive.google.com/open?id=0B2_p8Bv8r3wIYTc2eW9famlzM0E";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

                Toast.makeText(TeachersActivity.this, selectedTeachers.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTeachers = teachersAdapter.getSelectedTeachers();

                AlertDialog alertDialog = new AlertDialog.Builder(TeachersActivity.this).create(); //Read Update
                alertDialog.setTitle("Select Request Medium");

                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Gmail", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/html");
                        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"aayush@gmail.com"});
                        intent.putExtra(Intent.EXTRA_SUBJECT, "Requirement for Subject" + selectedTeachers);
                        intent.putExtra(Intent.EXTRA_TEXT, "I want the notes for " + selectedTeachers + ". Thank you for your assistance.");

                        startActivity(Intent.createChooser(intent, "Send Email"));
                    }
                });

                alertDialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Whatsapp", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        String smsNumber = "919582257576"; //without '+'
                        try {
                            Intent sendIntent = new Intent("android.intent.action.MAIN");
                            sendIntent.setAction(Intent.ACTION_SEND);
                            sendIntent.setType("text/plain");
                            sendIntent.putExtra(Intent.EXTRA_TEXT, "I want the notes for " + selectedTeachers + ". Thank you for your assistance.");
                            sendIntent.putExtra("jid", smsNumber + "@s.whatsapp.net"); //phone number without "+" prefix
                            sendIntent.setPackage("com.whatsapp");
                            startActivity(sendIntent);
                        } catch(Exception e) {
                            Toast.makeText(TeachersActivity.this, "Error/n" + e.toString(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                alertDialog.show();

                Toast.makeText(TeachersActivity.this, selectedTeachers.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
