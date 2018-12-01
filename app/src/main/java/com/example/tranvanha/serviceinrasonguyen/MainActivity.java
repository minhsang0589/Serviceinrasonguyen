package com.example.tranvanha.serviceinrasonguyen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnstart;
    private Button btnstop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnstart=(Button)findViewById(R.id.btn_start);
        btnstop=(Button)findViewById(R.id.btn_stop);
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartIn(v);
            }
        });
        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StopIn(v);
            }
        });
    }

    public void StartIn(View view) {
        Intent intent = new Intent(MainActivity.this, InrasonguyenService.class);
        this.startService(intent);
    }

    public void StopIn(View view) {
        Intent intent = new Intent(MainActivity.this, InrasonguyenService.class);
        this.stopService(intent);
    }
}
