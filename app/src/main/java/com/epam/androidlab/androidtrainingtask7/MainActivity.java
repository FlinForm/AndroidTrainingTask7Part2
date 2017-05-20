package com.epam.androidlab.androidtrainingtask7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View downloadButton = findViewById(R.id.startServiceButton);
        downloadButton.setOnClickListener(event ->
                startService(new Intent(this, MyService.class)));
    }
}
