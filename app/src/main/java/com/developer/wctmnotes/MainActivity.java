package com.developer.wctmnotes;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<String> branches;
    private SemesterAdapter semesterAdapter;
    private ListView listView;
    private Intent intent;
    private static String TEACHERS_JSON_DATA="";
    private ProgressDialog progressDialog;

    FirebaseAuth mAuth;

    private void signInAnonymously() {
        mAuth = FirebaseAuth.getInstance();
        mAuth.signInAnonymously().addOnSuccessListener(this, new  OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                // Create a reference to a file from a Google Cloud Storage URI
                StorageReference gsReference = FirebaseStorage.getInstance().getReferenceFromUrl(getResources().getString(R.string.url_to_teachers));
                gsReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {

                        // Instantiate the RequestQueue.
                        RequestQueue queue = Volley.newRequestQueue(MainActivity.this);

                        // Request a string response from the provided URL.
                        StringRequest stringRequest = new StringRequest(Request.Method.GET, uri.toString(),
                                new Response.Listener<String>() {
                                    @Override
                                    public void onResponse(String response) {
                                        TEACHERS_JSON_DATA = response;
                                        progressDialog.dismiss();
                                        goAhead();

                                    }
                                }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(MainActivity.this, "Data not loaded. Try again in some time.", Toast.LENGTH_SHORT).show();
                                progressDialog.dismiss();
                            }
                        });
                        // Add the request to the RequestQueue.
                        queue.add(stringRequest);
                    }
                });
            }
        })
                .addOnFailureListener(this, new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                        Log.e("SubjectsActivity.java", "signInAnonymously:FAILURE", exception);
                    }
                });
    }

    private void goAhead(){
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
                intent.putExtra("JSON", TEACHERS_JSON_DATA);
                startActivity(intent);
            }
        });
    }

    public boolean isOnline() {
        ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

        if(netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable()){
            Toast.makeText(this, "No Internet connection!", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.branch);

        if(isOnline()) {
            //initialize the progress dialog and show it
            ImageView imageView = (ImageView) findViewById(R.id.no_net);
            imageView.setVisibility(View.GONE);
            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setMessage("Loading data ....");
            progressDialog.show();
            signInAnonymously();
        }
        else{
            ImageView imageView = (ImageView) findViewById(R.id.no_net);
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.no_net));
        }
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
