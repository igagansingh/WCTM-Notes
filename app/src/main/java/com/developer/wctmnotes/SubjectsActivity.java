package com.developer.wctmnotes;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SubjectsActivity extends AppCompatActivity {

    private ArrayList<String> subjectsCseSemOne;
    private ArrayList<String> subjectsCseSemTwo;
    private ArrayList<String> subjectsCseSemThree;
    private ArrayList<String> subjectsCseSemFour;
    private ArrayList<String> subjectsCseSemFive;
    private ArrayList<String> subjectsCseSemSix;
    private ArrayList<String> subjectsCseSemSeven;
    private ArrayList<String> subjectsCseSemEight;

    private ArrayList<String> subjectsItSemOne;
    private ArrayList<String> subjectsItSemTwo;
    private ArrayList<String> subjectsItSemThree;
    private ArrayList<String> subjectsItSemFour;
    private ArrayList<String> subjectsItSemFive;
    private ArrayList<String> subjectsItSemSix;
    private ArrayList<String> subjectsItSemSeven;
    private ArrayList<String> subjectsItSemEight;

    private ArrayList<String> subjectsEceSemOne;
    private ArrayList<String> subjectsEceSemTwo;
    private ArrayList<String> subjectsEceSemThree;
    private ArrayList<String> subjectsEceSemFour;
    private ArrayList<String> subjectsEceSemFive;
    private ArrayList<String> subjectsEceSemSix;
    private ArrayList<String> subjectsEceSemSeven;
    private ArrayList<String> subjectsEceSemEight;

    private ArrayList<String> subjectsEeeSemOne;
    private ArrayList<String> subjectsEeeSemTwo;
    private ArrayList<String> subjectsEeeSemThree;
    private ArrayList<String> subjectsEeeSemFour;
    private ArrayList<String> subjectsEeeSemFive;
    private ArrayList<String> subjectsEeeSemSix;
    private ArrayList<String> subjectsEeeSemSeven;
    private ArrayList<String> subjectsEeeSemEight;

    private ListView listView;
    private Intent intent;
    private SemesterAdapter semesterAdapter;
    private String branch;
    private String semester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        listView = (ListView) findViewById(R.id.list_view);

        branch   = getIntent().getExtras().getString("Branch");
        semester = getIntent().getExtras().getString("Semester");

        switch (branch) {
            case "CSE":
                switch (semester){
                    case "One":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                            intent.putExtra("Branch", branch);
                            intent.putExtra("Semester", semester);
                            intent.putExtra("Subject", subjectsCseSemOne.get(position));
                            startActivity(intent);
                                /*GMail intent

                                Intent intent = new Intent(Intent.ACTION_SEND);
                                intent.setType("text/html");
                                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"aayush@gmail.com"});
                                intent.putExtra(Intent.EXTRA_SUBJECT, "Requirement for Subject" + subjectsCseSemOne.get(position));
                                intent.putExtra(Intent.EXTRA_TEXT, "I want the notes for " + subjectsCseSemOne.get(position) + ". Thank you for your assistance.");

                                startActivity(Intent.createChooser(intent, "Send Email"));*/
                            }
                        });
                        break;
                    case "Two":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);

                                /*Whatsapp Intent.

                                String smsNumber = "919582257576"; //without '+'
                                try {
                                    Intent sendIntent = new Intent("android.intent.action.MAIN");
                                    //sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
                                    sendIntent.setAction(Intent.ACTION_SEND);
                                    sendIntent.setType("text/plain");
                                    sendIntent.putExtra(Intent.EXTRA_TEXT, "I want the notes for " + subjectsCseSemOne.get(position) + ". Thank you for your assistance.");
                                    sendIntent.putExtra("jid", smsNumber + "@s.whatsapp.net"); //phone number without "+" prefix
                                    sendIntent.setPackage("com.whatsapp");
                                    startActivity(sendIntent);
                                } catch(Exception e) {
                                    Toast.makeText(SubjectsActivity.this, "Error/n" + e.toString(), Toast.LENGTH_SHORT).show();
                                }*/
                            }
                        });
                        break;
                    case "Three":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Four":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Five":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Six":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Seven":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Eight":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                }
                break;
            case "IT":
                switch (semester){
                    case "One": subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Two":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Three":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Four":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Five":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Six":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Seven":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Eight":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                }
                break;
            case "ECE":
                switch (semester){
                    case "One": subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Two":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Three":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Four":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Five":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Six":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Seven":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Eight":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                }
                break;
            case "EEE":
                switch (semester){
                    case "One": subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Two":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Three":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Four":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Five":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Six":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Seven":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Eight":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                }
                break;
            case "ME":
                switch (semester){
                    case "One": subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Two":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Three":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Four":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Five":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Six":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Seven":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Eight":
                        subjectsCseSemOne = new ArrayList<>();
                        subjectsCseSemOne.add("Subject 1");
                        subjectsCseSemOne.add("Subject 2");
                        subjectsCseSemOne.add("Subject 3");
                        subjectsCseSemOne.add("Subject 4");
                        subjectsCseSemOne.add("Subject 5");
                        subjectsCseSemOne.add("Subject 6");

                        semesterAdapter = new SemesterAdapter(this, subjectsCseSemOne);
                        listView.setAdapter(semesterAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                }
                break;

        }
        Toast.makeText(this, "Branch : "+ branch + ", Semester : " + semester, Toast.LENGTH_SHORT).show();
    }
}
