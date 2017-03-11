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
import android.widget.ArrayAdapter;
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

    private ArrayList<String> subjectsItSemOne;
    private ArrayList<String> subjectsItSemTwo;
    private ArrayList<String> subjectsItSemThree;
    private ArrayList<String> subjectsItSemFour;
    private ArrayList<String> subjectsItSemFive;
    private ArrayList<String> subjectsItSemSix;
    private ArrayList<String> subjectsItSemSeven;

    private ArrayList<String> subjectsEceSemOne;
    private ArrayList<String> subjectsEceSemTwo;
    private ArrayList<String> subjectsEceSemThree;
    private ArrayList<String> subjectsEceSemFour;
    private ArrayList<String> subjectsEceSemFive;
    private ArrayList<String> subjectsEceSemSix;
    private ArrayList<String> subjectsEceSemSeven;

    private ArrayList<String> subjectsEeeSemOne;
    private ArrayList<String> subjectsEeeSemTwo;
    private ArrayList<String> subjectsEeeSemThree;
    private ArrayList<String> subjectsEeeSemFour;
    private ArrayList<String> subjectsEeeSemFive;
    private ArrayList<String> subjectsEeeSemSix;
    private ArrayList<String> subjectsEeeSemSeven;

    private ArrayList<String> subjectsMeSemOne;
    private ArrayList<String> subjectsMeSemTwo;
    private ArrayList<String> subjectsMeSemThree;
    private ArrayList<String> subjectsMeSemFour;
    private ArrayList<String> subjectsMeSemFive;
    private ArrayList<String> subjectsMeSemSix;
    private ArrayList<String> subjectsMeSemSeven;

    private ArrayList<String> subjectsCivilSemOne;
    private ArrayList<String> subjectsCivilSemTwo;
    private ArrayList<String> subjectsCivilSemThree;
    private ArrayList<String> subjectsCivilSemFour;
    private ArrayList<String> subjectsCivilSemFive;
    private ArrayList<String> subjectsCivilSemSix;
    private ArrayList<String> subjectsCivilSemSeven;

    private ArrayList<String> subjectsBcaSemOne;
    private ArrayList<String> subjectsBcaSemTwo;
    private ArrayList<String> subjectsBcaSemThree;
    private ArrayList<String> subjectsBcaSemFour;
    private ArrayList<String> subjectsBcaSemFive;
    private ArrayList<String> subjectsBcaSemSix;

    private ArrayList<String> subjectsMcaSemOne;
    private ArrayList<String> subjectsMcaSemTwo;
    private ArrayList<String> subjectsMcaSemThree;
    private ArrayList<String> subjectsMcaSemFour;

    private ListView listView;
    private Intent intent;
    private ArrayAdapter<String> semAdapter;
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
                        subjectsCseSemOne.add("Essentials of Communication");
                        subjectsCseSemOne.add("Mathematics-I");
                        subjectsCseSemOne.add("Physics-I");
                        subjectsCseSemOne.add("Basics of Electronics");
                        subjectsCseSemOne.add("Fundamental of Computers & Programming in C");
                        subjectsCseSemOne.add("Basic of Mechanical engineering");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsCseSemOne);
                        listView.setAdapter(semAdapter);

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
                        subjectsCseSemTwo = new ArrayList<>();
                        subjectsCseSemTwo.add("Maths (M-2)");
                        subjectsCseSemTwo.add("Physics (P-2)");
                        subjectsCseSemTwo.add("English");
                        subjectsCseSemTwo.add("Chemistry");
                        subjectsCseSemTwo.add("Electrical Technology (ET)");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsCseSemTwo);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemTwo.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Three":
                        subjectsCseSemThree = new ArrayList<>();
                        subjectsCseSemThree.add("Mathematics III");
                        subjectsCseSemThree.add("Data Structures & Algorithms");
                        subjectsCseSemThree.add("Discrete Structures");
                        subjectsCseSemThree.add("Digital & Analog Communication");
                        subjectsCseSemThree.add("Digital Electronics");
                        subjectsCseSemThree.add("Fundamental of Management (FOM)");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsCseSemThree);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemThree.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Four":
                        subjectsCseSemFour = new ArrayList<>();
                        subjectsCseSemFour.add("Internet Foundamental (IF)");
                        subjectsCseSemFour.add("Programming Language (PL)");
                        subjectsCseSemFour.add("Object Oriented Progarmming Using C++ (OOPS)");
                        subjectsCseSemFour.add("Database Management System (DBMS)");
                        subjectsCseSemFour.add("Computer Architecture And Organization (CAO)");
                        subjectsCseSemFour.add("Economics");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsCseSemFour);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemFour.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Five":
                        subjectsCseSemFive = new ArrayList<>();
                        subjectsCseSemFive.add("Principles of Operating System");
                        subjectsCseSemFive.add("Microprocessors and Interfacing");
                        subjectsCseSemFive.add("Computer Graphics");
                        subjectsCseSemFive.add("Web Development");
                        subjectsCseSemFive.add("Multimedia Technologies");
                        subjectsCseSemFive.add("Subject 6");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsCseSemFive);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemFive.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Six":
                        subjectsCseSemSix = new ArrayList<>();
                        subjectsCseSemSix.add("Digital System Design (DSD)");
                        subjectsCseSemSix.add("Analysis And Design Of Algorithms (ADA)");
                        subjectsCseSemSix.add("Computer Networks (CN)");
                        subjectsCseSemSix.add("Intelligent Systems (IS)");
                        subjectsCseSemSix.add("System Programming And Administration (SPSA)");
                        subjectsCseSemSix.add("Principles Of Software Engineering (POSE)");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsCseSemSix);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemSix.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Seven":
                        subjectsCseSemSeven = new ArrayList<>();
                        subjectsCseSemSeven.add("Advanced Computer Architecture");
                        subjectsCseSemSeven.add("Software Project Management");
                        subjectsCseSemSeven.add("Compiler Design");
                        subjectsCseSemSeven.add("Neural Networks");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsCseSemSeven);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCseSemSeven.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                }
                break;
            case "IT":
                switch (semester){
                    case "One": subjectsItSemOne = new ArrayList<>();
                        subjectsItSemOne.add(" Essentials of Communication");
                        subjectsItSemOne.add(" Mathematics-I ");              //subjectsItSemOne
                        subjectsItSemOne.add("Physics-I");
                        subjectsItSemOne.add(" Basics of Electronics");
                        subjectsItSemOne.add(" FUNDAMENTAL OF COMPUTERS & PROGRAMMING IN C");
                        subjectsItSemOne.add(" BASICS OF MECHANICAL ENGG.");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsItSemOne);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsItSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Two":
                        subjectsItSemTwo = new ArrayList<>();              //subjectsItSemTwo
                        subjectsItSemTwo.add(" Mathematics-II ");
                        subjectsItSemTwo.add("ENGINEERING CHEMISTRY");
                        subjectsItSemTwo.add(" ELECTRICAL TECHNOLOGY ");
                        subjectsItSemTwo.add(" PHYSICS-2 ");
                        subjectsItSemTwo.add(" Communication Skills in English ");
                        subjectsItSemTwo.add("Subject 6");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsItSemTwo);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsItSemTwo.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Three":
                        subjectsItSemThree = new ArrayList<>();
                        subjectsItSemThree.add("Mathematics III");
                        subjectsItSemThree.add("Data Structures & Algorithms");
                        subjectsItSemThree.add("Discrete Structures ");
                        subjectsItSemThree.add("Digital & Analog Communication ");
                        subjectsItSemThree.add("Digital Electronics ");
                        subjectsItSemThree.add("Fundamental of Management");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsItSemThree);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsItSemThree.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Four":
                        subjectsItSemFour = new ArrayList<>();
                        subjectsItSemFour.add("Data Base Management Systems ");
                        subjectsItSemFour.add(" Programming Languages ");
                        subjectsItSemFour.add("Multimedia Technologies ");
                        subjectsItSemFour.add("Object-Oriented Programming using C++");
                        subjectsItSemFour.add("Internet Fundamentals");
                        subjectsItSemFour.add("Computer Architecture and Organization ");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsItSemFour);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsItSemFour.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Five":
                        subjectsItSemFive = new ArrayList<>();
                        subjectsItSemFive.add("Principles of Operating System");
                        subjectsItSemFive.add("Microprocessors and Interfacing ");
                        subjectsItSemFive.add("Computer Graphics ");
                        subjectsItSemFive.add("Computer Networks ");
                        subjectsItSemFive.add(" Systems Programming & System Administration ");
                        subjectsItSemFive.add("Rapid Application Development");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsItSemFive);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsItSemFive.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Six":
                        subjectsItSemSix = new ArrayList<>();
                        subjectsItSemSix.add("Web Development");
                        subjectsItSemSix.add("Wireless Communication ");
                        subjectsItSemSix.add(" Intelligent Systems");
                        subjectsItSemSix.add(" Principles of Software Engineering  ");
                        subjectsItSemSix.add("Network Programming");
                        subjectsItSemSix.add("Digital Signal Processing");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsItSemSix);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsItSemSix.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Seven":
                        subjectsItSemSeven = new ArrayList<>();
                        subjectsItSemSeven.add("Data Warehousing & Data Mining");
                        subjectsItSemSeven.add("Software Project Management");
                        subjectsItSemSeven.add("SSystem & Network Administration");
                        subjectsItSemSeven.add("Introduction to E-commerce & ERP");
                        subjectsItSemSeven.add("Subject 5");
                        subjectsItSemSeven.add("Subject 6");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsItSemSeven);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsItSemSeven.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                }
                break;
            case "ECE":
                switch (semester){
                    case "One": subjectsEceSemOne = new ArrayList<>();
                        subjectsEceSemOne.add("English");
                        subjectsEceSemOne.add("Mathematics (M-1)");
                        subjectsEceSemOne.add("Physics (P-1)");
                        subjectsEceSemOne.add("Basics Of Electronics");
                        subjectsEceSemOne.add("Fundamentals Of Comp. Prog. In Communication");
                        subjectsEceSemOne.add("Basics Of Mechanical Engg.");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsEceSemOne);
                        listView.setAdapter(semAdapter);


                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsEceSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Two":
                        subjectsEceSemTwo = new ArrayList<>();
                        subjectsEceSemTwo.add("Mathematics (M-2)");
                        subjectsEceSemTwo.add("Physics (P-2)");
                        subjectsEceSemTwo.add("English");
                        subjectsEceSemTwo.add("Chemistry");
                        subjectsEceSemTwo.add("Electrical Tech.");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsEceSemTwo);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsEceSemTwo.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Three":
                        subjectsEceSemThree = new ArrayList<>();
                        subjectsEceSemThree.add("bacha h");
                        subjectsEceSemThree.add("Fundamentals Of Management");
                        subjectsEceSemThree.add("Electronic Devices And Circuits");
                        subjectsEceSemThree.add("Network Theory");
                        subjectsEceSemThree.add("Electromechanical Energy Conversion");
                        subjectsEceSemThree.add("Data Structure Using C");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsEceSemThree);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsEceSemThree.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Four":
                        subjectsEceSemFour = new ArrayList<>();
                        subjectsEceSemFour.add("ek bacha h");
                        subjectsEceSemFour.add("Signals Systems");
                        subjectsEceSemFour.add("Analog Electronics");
                        subjectsEceSemFour.add("Digital Electronics");
                        subjectsEceSemFour.add("Communication System");
                        subjectsEceSemFour.add("Electro Magnetic Theory");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsEceSemFour);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsEceSemFour.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Five":
                        subjectsEceSemFive = new ArrayList<>();
                        subjectsEceSemFive.add("Communication Engg.");
                        subjectsEceSemFive.add("Electronic Measurement And Instrumentation");
                        subjectsEceSemFive.add("Analog Electronic Circuits");
                        subjectsEceSemFive.add("Antennas, Wave Propagation And TV Engg.");
                        subjectsEceSemFive.add("Computer Arch. And Org.");
                        subjectsEceSemFive.add("Microprocessors And Interfacing");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsEceSemFive);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsEceSemFive.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Six":
                        subjectsEceSemSix = new ArrayList<>();
                        subjectsEceSemSix.add("Computer Networks");
                        subjectsEceSemSix.add("Very Large SCale Integration");
                        subjectsEceSemSix.add("Digital System Design");
                        subjectsEceSemSix.add("Control System");
                        subjectsEceSemSix.add("Microwave And Radar");
                        subjectsEceSemSix.add("Embeded System Design");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsEceSemSix);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsEceSemSix.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Seven":
                        subjectsEceSemSeven = new ArrayList<>();
                        subjectsEceSemSeven.add("Wireless Communication");
                        subjectsEceSemSeven.add("Satelite Communication Engg.");
                        subjectsEceSemSeven.add("Data Communication");
                        subjectsEceSemSeven.add("Digital Signal Processing");
                        subjectsEceSemSeven.add("bacha h");
                        subjectsEceSemSeven.add("bacha h");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsEceSemSeven);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsEceSemSeven.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                }
                break;
            case "EEE":
                switch (semester){
                    case "One": subjectsEeeSemOne = new ArrayList<>();
                        subjectsEeeSemOne.add("Subject 1");
                        subjectsEeeSemOne.add("Subject 2");
                        subjectsEeeSemOne.add("Subject 3");
                        subjectsEeeSemOne.add("Subject 4");
                        subjectsEeeSemOne.add("Subject 5");
                        subjectsEeeSemOne.add("Subject 6");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsEeeSemOne);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsEeeSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Two":
                        subjectsEeeSemTwo = new ArrayList<>();
                        subjectsEeeSemTwo.add("Subject 1");
                        subjectsEeeSemTwo.add("Subject 2");
                        subjectsEeeSemTwo.add("Subject 3");
                        subjectsEeeSemTwo.add("Subject 4");
                        subjectsEeeSemTwo.add("Subject 5");
                        subjectsEeeSemTwo.add("Subject 6");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsEeeSemTwo);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsEeeSemTwo.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Three":
                        subjectsEeeSemThree = new ArrayList<>();
                        subjectsEeeSemThree.add("Subject 1");
                        subjectsEeeSemThree.add("Subject 2");
                        subjectsEeeSemThree.add("Subject 3");
                        subjectsEeeSemThree.add("Subject 4");
                        subjectsEeeSemThree.add("Subject 5");
                        subjectsEeeSemThree.add("Subject 6");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsEeeSemThree);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsEeeSemThree.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Four":
                        subjectsEeeSemFour = new ArrayList<>();
                        subjectsEeeSemFour.add("Subject 1");
                        subjectsEeeSemFour.add("Subject 2");
                        subjectsEeeSemFour.add("Subject 3");
                        subjectsEeeSemFour.add("Subject 4");
                        subjectsEeeSemFour.add("Subject 5");
                        subjectsEeeSemFour.add("Subject 6");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsEeeSemFour);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsEeeSemFour.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Five":
                        subjectsEeeSemFive = new ArrayList<>();
                        subjectsEeeSemFive.add("Electrical Machines 2");
                        subjectsEeeSemFive.add("Electronic Measurement And Instrumentation");
                        subjectsEeeSemFive.add("Analog Electronics Circuits");
                        subjectsEeeSemFive.add("Power Systems 1");
                        subjectsEeeSemFive.add("Power Electronics");
                        subjectsEeeSemFive.add("Microprocessors And Interfacing");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsEeeSemFive);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsEeeSemFive.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Six":
                        subjectsEeeSemSix = new ArrayList<>();
                        subjectsEeeSemSix.add("Power System 2");
                        subjectsEeeSemSix.add("Electric Power Generation");
                        subjectsEeeSemSix.add("Digital System Design");
                        subjectsEeeSemSix.add("Control System");
                        subjectsEeeSemSix.add("Computer Aided Design");
                        subjectsEeeSemSix.add("Embeded System Design");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsEeeSemSix);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsEeeSemSix.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Seven":
                        subjectsEeeSemSeven = new ArrayList<>();
                        subjectsEeeSemSeven.add("Subject 1");
                        subjectsEeeSemSeven.add("Subject 2");
                        subjectsEeeSemSeven.add("Subject 3");
                        subjectsEeeSemSeven.add("Subject 4");
                        subjectsEeeSemSeven.add("Subject 5");
                        subjectsEeeSemSeven.add("Subject 6");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsEeeSemSeven);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsEeeSemSeven.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                }
                break;
            case "ME":
                switch (semester) {
                    case "One":
                        subjectsMeSemOne = new ArrayList<>();
                        subjectsMeSemOne.add("English");
                        subjectsMeSemOne.add("Mathematics (M-1)");
                        subjectsMeSemOne.add("Physics (P-1)");
                        subjectsMeSemOne.add("Chemistry");
                        subjectsMeSemOne.add("Electrical Technology");
                        subjectsMeSemOne.add("Engg. Graphics And Drawing");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsMeSemOne);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsMeSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Two":
                        subjectsMeSemTwo = new ArrayList<>();
                        subjectsMeSemTwo.add("Mathematics (M-2)");
                        subjectsMeSemTwo.add("Physics (P-2)");
                        subjectsMeSemTwo.add("English");
                        subjectsMeSemTwo.add("Basics Of Mechanical Engg.");
                        subjectsMeSemTwo.add("Basics Of Electronics");
                        subjectsMeSemTwo.add("Fundamentals Of Comp. Prog. In C");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsMeSemTwo);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsMeSemTwo.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Three":
                        subjectsMeSemThree = new ArrayList<>();
                        subjectsMeSemThree.add("Mathematics (M-3)");
                        subjectsMeSemThree.add("Fundamentals Of Management");
                        subjectsMeSemThree.add("Thermodynamics");
                        subjectsMeSemThree.add("Computer Aided Design");
                        subjectsMeSemThree.add("Engg. Mechanics");
                        subjectsMeSemThree.add("Material Science");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsMeSemThree);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsMeSemThree.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Four":
                        subjectsMeSemFour = new ArrayList<>();
                        subjectsMeSemFour.add("Kinematics Of Machines");
                        subjectsMeSemFour.add("Steam And Power Generation");
                        subjectsMeSemFour.add("Fluid Mechanics");
                        subjectsMeSemFour.add("Manufacturing Tech.");
                        subjectsMeSemFour.add("Strength Of Material");
                        subjectsMeSemFour.add("Economics");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsMeSemFour);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsMeSemFour.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Five":
                        subjectsMeSemFive = new ArrayList<>();
                        subjectsMeSemFive.add("Dynamics Of Machines");
                        subjectsMeSemFive.add("Mechanical Machine Design 1");
                        subjectsMeSemFive.add("Fluid Machine");
                        subjectsMeSemFive.add("Internal Combustion Engines And Gas Turbines");
                        subjectsMeSemFive.add("Manufacturing Technology 2");
                        subjectsMeSemFive.add("Applied Numerical Technique And Computing");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsMeSemFive);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsMeSemFive.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Six":
                        subjectsMeSemSix = new ArrayList<>();
                        subjectsMeSemSix.add("Industrial Engg.");
                        subjectsMeSemSix.add("Heat Transfer");
                        subjectsMeSemSix.add("Automobile Engg.");
                        subjectsMeSemSix.add("Machine Design");
                        subjectsMeSemSix.add("Measurement And Instrumentation");
                        subjectsMeSemSix.add("Automatic Control System");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsMeSemSix);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsMeSemSix.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Seven":
                        subjectsMeSemSeven = new ArrayList<>();
                        subjectsMeSemSeven.add("Strength Of Material 2");
                        subjectsMeSemSeven.add("Refrigeration And Air-Conditioning");
                        subjectsMeSemSeven.add("Operaion Research");
                        subjectsMeSemSeven.add("Power Plant Engg.");
                        subjectsMeSemSeven.add("Mechanical Vibration");
                        subjectsMeSemSeven.add("ek aur subject h");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsMeSemSeven);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsMeSemSeven.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                }
                break;
            case "Civil":
                switch (semester) {
                    case "One":
                        subjectsCivilSemOne = new ArrayList<>();
                        subjectsCivilSemOne.add("English");
                        subjectsCivilSemOne.add("Mathematics (M-1)");
                        subjectsCivilSemOne.add("Physics (P-1)");
                        subjectsCivilSemOne.add("Chemistry");
                        subjectsCivilSemOne.add("Electrical Technology");
                        subjectsCivilSemOne.add("Engg. Graphics And Drawing");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsCivilSemOne);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCivilSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Two":
                        subjectsCivilSemTwo = new ArrayList<>();
                        subjectsCivilSemTwo.add("Maths (M-2)");
                        subjectsCivilSemTwo.add("Physics (P-2)");
                        subjectsCivilSemTwo.add("English");
                        subjectsCivilSemTwo.add("Basics Of Mechanical Engg.");
                        subjectsCivilSemTwo.add("Basics Of Electronics");
                        subjectsCivilSemTwo.add("Fundamentals Of Comp. Prog. In C");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsCivilSemTwo);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCivilSemTwo.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Three":
                        subjectsCivilSemThree = new ArrayList<>();
                        subjectsCivilSemThree.add("Economics");
                        subjectsCivilSemThree.add("Fundamentals Of Management");
                        subjectsCivilSemThree.add("Structural Analysis 1");
                        subjectsCivilSemThree.add("Building Construction Materials");
                        subjectsCivilSemThree.add("Fluid Mechanics");
                        subjectsCivilSemThree.add("Surveying 1");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsCivilSemThree);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCivilSemThree.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Four":
                        subjectsCivilSemFour = new ArrayList<>();
                        subjectsCivilSemFour.add("Construction And Concrete Technology");
                        subjectsCivilSemFour.add("Design Of Concrete Structures 1");
                        subjectsCivilSemFour.add("Structure Analysis 2");
                        subjectsCivilSemFour.add("Fluid Mechanics 2");
                        subjectsCivilSemFour.add("Mathematics (M-3)");
                        subjectsCivilSemFour.add("Surveying 2");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsCivilSemFour);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCivilSemFour.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Five":
                        subjectsCivilSemFive = new ArrayList<>();
                        subjectsCivilSemFive.add("Design Of Steel Structure 1");
                        subjectsCivilSemFive.add("Transportation Engg. 1");
                        subjectsCivilSemFive.add("Water Supply Treatment");
                        subjectsCivilSemFive.add("Soil Mechanics");
                        subjectsCivilSemFive.add("Numerical Methods And Computing Techniques");
                        subjectsCivilSemFive.add("Hydrology");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsCivilSemFive);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCivilSemFive.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Six":
                        subjectsCivilSemSix = new ArrayList<>();
                        subjectsCivilSemSix.add("Design Of Concrete Structures 2");
                        subjectsCivilSemSix.add("Irrigation Engg. 1");
                        subjectsCivilSemSix.add("Geotechnology");
                        subjectsCivilSemSix.add("Sewerage And Sewage Treatment");
                        subjectsCivilSemSix.add("Transportation Engg. 2");
                        subjectsCivilSemSix.add("Engg. Geology");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsCivilSemSix);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCivilSemSix.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Seven":
                        subjectsCivilSemSeven = new ArrayList<>();
                        subjectsCivilSemSeven.add("Estimating And Costing");
                        subjectsCivilSemSeven.add("Ground Water Engg.");
                        subjectsCivilSemSeven.add("Disaster Mitigation And Management");
                        subjectsCivilSemSeven.add("Enviornment Pollution And Control");
                        subjectsCivilSemSeven.add("Design Of Steel Structure 2");
                        subjectsCivilSemSeven.add("Irrigation Engg.");
                        subjectsCivilSemSeven.add("Practical Training");
                        subjectsCivilSemSeven.add("Hydro Power");
                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsCivilSemSeven);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsCivilSemSeven.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                }
                break;
            case "BCA":
                switch (semester) {
                    case "One":
                        subjectsBcaSemOne = new ArrayList<>();
                        subjectsBcaSemOne.add("Computer And Prog. Fundamentals");
                        subjectsBcaSemOne.add("PC Software");
                        subjectsBcaSemOne.add("Mathematics");
                        subjectsBcaSemOne.add("Logical Organization Of Computer 1");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsBcaSemOne);
                        listView.setAdapter(semAdapter);


                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsBcaSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Two":
                        subjectsBcaSemTwo = new ArrayList<>();
                        subjectsBcaSemTwo.add("C Prog.");
                        subjectsBcaSemTwo.add("Structured System Analysis And Design");
                        subjectsBcaSemTwo.add("Logical Organization Of Computers 2");
                        subjectsBcaSemTwo.add("Mathematical Foundation Of Computers");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsBcaSemTwo);
                        listView.setAdapter(semAdapter);


                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsBcaSemTwo.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Three":
                        subjectsBcaSemThree = new ArrayList<>();
                        subjectsBcaSemThree.add("Introduction To Operating System");
                        subjectsBcaSemThree.add("Data Structures 1");
                        subjectsBcaSemThree.add("Introduction To Database System");
                        subjectsBcaSemThree.add("English");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsBcaSemThree);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsBcaSemThree.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Four":
                        subjectsBcaSemFour = new ArrayList<>();
                        subjectsBcaSemFour.add("Object Oriented Prog.");
                        subjectsBcaSemFour.add("Web Designing");
                        subjectsBcaSemFour.add("Software Engg.");
                        subjectsBcaSemFour.add("Data Structures 2");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsBcaSemFour);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsBcaSemFour.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Five":
                        subjectsBcaSemFive = new ArrayList<>();
                        subjectsBcaSemFive.add("Management Information System");
                        subjectsBcaSemFive.add("Computer Graphics");
                        subjectsBcaSemFive.add("Data Communication And Networking");
                        subjectsBcaSemFive.add("Visual Basic");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsBcaSemFive);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsBcaSemFive.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Six":
                        subjectsBcaSemSix = new ArrayList<>();
                        subjectsBcaSemSix.add("Object Technologies And Prog. Using Java");
                        subjectsBcaSemSix.add("Introduction To .NET");
                        subjectsBcaSemSix.add("E Commerce");
                        subjectsBcaSemSix.add("Artificial Intelligence");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsBcaSemSix);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsBcaSemSix.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                }
                break;
            case "MCA":
                switch (semester){
                    case "One":
                        subjectsMcaSemOne = new ArrayList<>();
                        subjectsMcaSemOne.add("Mathematical Foundation Of Computer Science");
                        subjectsMcaSemOne.add("Computer Fundamentals And Prog. In C");
                        subjectsMcaSemOne.add("Digital Design");
                        subjectsMcaSemOne.add("Internet And Web Designing");
                        subjectsMcaSemOne.add("Object Oriented Prog. Using C++");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsMcaSemOne);
                        listView.setAdapter(semAdapter);
                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsMcaSemOne.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Two":
                        subjectsMcaSemTwo = new ArrayList<>();
                        subjectsMcaSemTwo.add("Computer Arch. And Org.");
                        subjectsMcaSemTwo.add("Database Management System");
                        subjectsMcaSemTwo.add("Computer Design");
                        subjectsMcaSemTwo.add("Visual Prog. Languages");
                        subjectsMcaSemTwo.add("Data Structures And Algorithms Using C++");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsMcaSemTwo);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsMcaSemTwo.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Three":
                        subjectsMcaSemThree = new ArrayList<>();
                        subjectsMcaSemThree.add("Computer Graphics And Multimedia ");
                        subjectsMcaSemThree.add("Operating System");
                        subjectsMcaSemThree.add("Artificial Intelligence And Expert Systems");
                        subjectsMcaSemThree.add("Data Communication And Computer Networks");
                        subjectsMcaSemThree.add("Object Technology");
                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsMcaSemThree);
                        listView.setAdapter(semAdapter);
                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsMcaSemThree.get(position));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "Four":
                        subjectsMcaSemFour = new ArrayList<>();
                        subjectsMcaSemFour.add("Software Engg.");
                        subjectsMcaSemFour.add("Advanced Database Management System ");
                        subjectsMcaSemFour.add("Advanced Java");
                        subjectsMcaSemFour.add("Visual Prog. Languages");
                        subjectsMcaSemFour.add("Data Warehousing And Data Mining");

                        semAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, subjectsMcaSemFour);
                        listView.setAdapter(semAdapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                intent = new Intent(SubjectsActivity.this, TeachersActivity.class);
                                intent.putExtra("Branch", branch);
                                intent.putExtra("Semester", semester);
                                intent.putExtra("Subject", subjectsMcaSemFour.get(position));
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
