package com.example.gouthamishivaprakash.howler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AwakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awake);
    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), DisplayAlarmMainActivity.class);
        startActivity(intent);
    }
}