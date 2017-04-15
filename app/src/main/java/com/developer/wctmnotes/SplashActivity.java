package com.developer.wctmnotes;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by gagan on 14/4/17.
 */

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Handler h = new Handler(){
            @Override
            public void handleMessage(Message msg) {

                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
            }
        };

        h.sendEmptyMessageDelayed(0, 1500); // 1500 is time in miliseconds
    }
}
