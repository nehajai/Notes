package com.example.njneh.notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread th = new Thread()

        {
            public void run() {
                try {
                    sleep(4000);

                } catch (Exception e) {


                } finally {
                    Intent i = new Intent(MainActivity.this, Activity2.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        th.start();

    }
}
