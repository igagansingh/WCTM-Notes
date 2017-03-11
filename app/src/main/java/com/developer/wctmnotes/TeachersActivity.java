package com.developer.wctmnotes;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TeachersActivity extends AppCompatActivity {

    private ListView listView;
    private Button soft, hard;
    private String branch, semester, subject;
    private ArrayList<String> selectedTeachers;
    private ArrayList<String> teacherCseSemOneSubject1, teacherCseSemOneSubject2, teacherCseSemOneSubject3, teacherCseSemOneSubject4, teacherCseSemOneSubject5,teacherCseSemOneSubject6;
    private TeachersAdapter teachersAdapter;

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

        switch (branch){
            case "CSE":
                switch (semester){
                    case "One":
                        switch (subject){
                            case "Essentials of Communication":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Mathematics-I":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Physics-I":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Basics of Electronics":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Fundamental of Computers & Programming in C":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Basic of Mechanical engineering":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Two":
                        switch (subject){
                            case "Maths (M-2)":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Physics (P-2)":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "English":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Chemistry":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Electrical Technology (ET)":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Three":
                        switch (subject){
                            case "Mathematics III":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Data Structures & Algorithms":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Discrete Structures":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Digital & Analog Communication":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Digital Electronics":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Fundamental of Management (FOM)":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Four":
                        switch (subject){
                            case "Internet Foundamental (IF)":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Programming Language (PL)":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Object Oriented Progarmming Using C++ (OOPS)":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Database Management System (DBMS)":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Computer Architecture And Organization (CAO)":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Economics":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Five":
                        switch (subject){
                            case "Principles of Operating System":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Microprocessors and Interfacing":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Computer Graphics":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Web Development":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Multimedia Technologies":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Six":
                        switch (subject){
                            case "Digital System Design (DSD)":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Analysis And Design Of Algorithms (ADA)":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Computer Networks (CN)":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Intelligent Systems (IS)":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "System Programming And Administration (SPSA)":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Principles Of Software Engineering (POSE)":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Seven":
                        switch (subject){
                            case "Advanced Computer Architecture":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Software Project Management":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Compiler Design":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Neural Networks":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;
            /*case "IT":
                switch (semester){
                    case "One":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Two":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Three":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Four":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Five":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Six":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Seven":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Eight":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;
                }
                break;
            case "ECE":
                switch (semester){
                    case "One":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Two":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Three":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Four":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Five":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Six":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Seven":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Eight":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;
                }
                break;
            case "EEE":
                switch (semester){
                    case "One":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Two":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Three":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Four":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Five":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Six":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Seven":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Eight":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;
                }
                break;
            case "ME":
                switch (semester){
                    case "One":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Two":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Three":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Four":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Five":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Six":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Seven":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;

                    case "Eight":
                        switch (subject){
                            case "Subject 1":
                                teacherCseSemOneSubject1 = new ArrayList<>();
                                teacherCseSemOneSubject1.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject1.add("Teacher D " + branch + " "+ semester + " " + subject);

                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject1);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 2":
                                teacherCseSemOneSubject2 = new ArrayList<>();
                                teacherCseSemOneSubject2.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject2.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject2);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 3":
                                teacherCseSemOneSubject3 = new ArrayList<>();
                                teacherCseSemOneSubject3.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject3.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject3);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 4":
                                teacherCseSemOneSubject4 = new ArrayList<>();
                                teacherCseSemOneSubject4.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject4.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject4);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 5":
                                teacherCseSemOneSubject5 = new ArrayList<>();
                                teacherCseSemOneSubject5.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject5.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject5);
                                listView.setAdapter(teachersAdapter);
                                break;
                            case "Subject 6":
                                teacherCseSemOneSubject6 = new ArrayList<>();
                                teacherCseSemOneSubject6.add("Teacher A " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher B " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher C " + branch + " "+ semester + " " + subject);
                                teacherCseSemOneSubject6.add("Teacher D " + branch + " "+ semester + " " + subject);


                                teachersAdapter = new TeachersAdapter(TeachersActivity.this, teacherCseSemOneSubject6);
                                listView.setAdapter(teachersAdapter);
                                break;
                        }
                        break;*/
                }
                break;
        }

        soft.setOnClickListener(new View.OnClickListener() {
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
                            //sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
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
                            //sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
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
//        teachersAdapter = new TeachersAdapter(this, teachers);
    }
}
