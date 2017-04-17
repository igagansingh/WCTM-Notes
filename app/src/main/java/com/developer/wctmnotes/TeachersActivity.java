package com.developer.wctmnotes;

import android.app.AlertDialog;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.BaseColumns;
import android.provider.ContactsContract;
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


    private String getContactDisplayNameByNumber(String number) {
        Uri uri = Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(number));
        String name = "";

        ContentResolver contentResolver = getContentResolver();
        Cursor contactLookup = contentResolver.query(uri, new String[] {BaseColumns._ID,
                ContactsContract.PhoneLookup.DISPLAY_NAME }, null, null, null);

        try {
            if (contactLookup != null && contactLookup.getCount() > 0) {
                contactLookup.moveToNext();
                name = contactLookup.getString(contactLookup.getColumnIndex(ContactsContract.Data.DISPLAY_NAME));
            }
            else {
                final AlertDialog alertDialog2 = new AlertDialog.Builder(TeachersActivity.this).create(); //Read Update
                alertDialog2.setTitle("Add WCTM Notes contact...");
                alertDialog2.setMessage("Inorder to send " +
                        " request add this contact.");

                alertDialog2.setButton(DialogInterface.BUTTON_POSITIVE, "Accept", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        ArrayList<ContentProviderOperation> ops = new ArrayList<ContentProviderOperation>();
                        int rawContactInsertIndex = ops.size();

                        ops.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI)
                                .withValue(ContactsContract.RawContacts.ACCOUNT_TYPE, null)
                                .withValue(ContactsContract.RawContacts.ACCOUNT_NAME, null).build());
                        ops.add(ContentProviderOperation
                                .newInsert(ContactsContract.Data.CONTENT_URI)
                                .withValueBackReference(ContactsContract.RawContacts.Data.RAW_CONTACT_ID,rawContactInsertIndex)
                                .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
                                .withValue(ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME, "WCTM Notes") // Name of the person
                                .build());
                        boolean add = ops.add(ContentProviderOperation
                                .newInsert(ContactsContract.Data.CONTENT_URI)
                                .withValueBackReference(
                                        ContactsContract.Data.RAW_CONTACT_ID, rawContactInsertIndex)
                                .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                                .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, "8383010922") // Number of the person
                                .withValue(ContactsContract.CommonDataKinds.Phone.TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE).build());// Type of mobile number
                        try
                        {
                            ContentProviderResult[] res = getContentResolver().applyBatch(ContactsContract.AUTHORITY, ops);
                            Toast.makeText(TeachersActivity.this, "WCTM Notes contact added to contacts!", Toast.LENGTH_LONG).show();
                        }
                        catch (RemoteException e)
                        {
                            // error
                        }
                        catch (OperationApplicationException e)
                        {
                        }
                    }
                });

                alertDialog2.setButton(DialogInterface.BUTTON_NEGATIVE, "Decline", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        alertDialog2.dismiss();
                    }
                });

                alertDialog2.show();
            }
        } finally {
            if (contactLookup != null) {
                contactLookup.close();
            }
        }
        return name;
    }
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

                            String name = getContactDisplayNameByNumber("8383010922");

                            if (!(name.equals(""))) {
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
                            else{
                                Toast.makeText(TeachersActivity.this, "Add WCTM Notes to contact first!", Toast.LENGTH_SHORT).show();
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

    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
