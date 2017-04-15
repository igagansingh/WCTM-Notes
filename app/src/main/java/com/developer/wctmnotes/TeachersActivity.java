package com.developer.wctmnotes;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
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

import java.util.ArrayList;

public class TeachersActivity extends AppCompatActivity {

    private ListView listView;
    private Button soft, hard;
    private String branch, semester, subject;
    private ArrayList<String> selectedTeachers,teachers;
    private TeachersAdapter teachersAdapter;
    private String notes="";
    private static String TEACHERS_JSON_DATA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);

        branch = getIntent().getExtras().getString("Branch");
        semester = getIntent().getExtras().getString("Semester");
        subject = getIntent().getExtras().getString("Subject");
        TEACHERS_JSON_DATA = getIntent().getExtras().getString("JSON");

        listView = (ListView) findViewById(R.id.list);
        soft = (Button) findViewById(R.id.soft);
        hard = (Button) findViewById(R.id.hard);

        teachers = new ArrayList<>();
        try {
            JSONObject obj = new JSONObject(TEACHERS_JSON_DATA);
            JSONObject start = obj.getJSONObject("Branch");
            JSONObject streamObj = start.getJSONObject(branch);
            JSONObject semestersObj = streamObj.getJSONObject("Semester");
            JSONObject semeterNumObj = semestersObj.getJSONObject(semester);
            JSONObject subjectsObj = semeterNumObj.getJSONObject("Subjects");
            JSONObject subjectSelectedObj = subjectsObj.getJSONObject(subject);
            notes = subjectSelectedObj.getString("Notes");
            Log.d("TeachersActivity Notes", " "+notes);
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
                if (selectedTeachers.size() != 0) {
                    String url = notes;
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                    Toast.makeText(TeachersActivity.this, selectedTeachers.toString(), Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(TeachersActivity.this, "Select some teachers first!", Toast.LENGTH_SHORT).show();
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTeachers = teachersAdapter.getSelectedTeachers();
                if (selectedTeachers.size() != 0) {
                    AlertDialog alertDialog = new AlertDialog.Builder(TeachersActivity.this).create(); //Read Update
                    alertDialog.setTitle("Select Request Medium");

                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Gmail", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_SEND);
                            intent.setType("text/html");
                            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"wctmnotes@gmail.com"});
                            intent.putExtra(Intent.EXTRA_SUBJECT, "Requirement for Subject " + subject + ".");
                            intent.putExtra(Intent.EXTRA_TEXT, "I want the notes by " + selectedTeachers + " for " + subject + ".\n I am from branch : '" + branch + "' and semeseter : '" + semester + "'.\nThank you for your assistance.");


                            startActivity(Intent.createChooser(intent, "Send Email"));
                        }
                    });

                    alertDialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Whatsapp", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            String smsNumber = "918383010922"; //without '+'
                            String smsMessage = "I want the notes by " + selectedTeachers + " for " + subject + ".\n I am from branch : '" + branch + "' and semeseter : '" + semester + "'.\nThank you for your assistance.";
                            try {
                                Intent sendIntent = new Intent("android.intent.action.MAIN");
                                sendIntent.setAction(Intent.ACTION_SEND);
                                sendIntent.setType("text/plain");
                                sendIntent.putExtra(Intent.EXTRA_TEXT, smsMessage);
                                sendIntent.putExtra("jid", smsNumber + "@s.whatsapp.net"); //phone number without "+" prefix
                                sendIntent.setPackage("com.whatsapp");
                                startActivity(sendIntent);
                            } catch (Exception e) {
                                Toast.makeText(TeachersActivity.this, "Error/n" + e.toString(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                    alertDialog.show();

                    Toast.makeText(TeachersActivity.this, selectedTeachers.toString(), Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(TeachersActivity.this, "Select some teachers first!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
