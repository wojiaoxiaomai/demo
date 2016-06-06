package com.lcdq.github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "11111111", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "222222222", Toast.LENGTH_SHORT).show();

    }
}
