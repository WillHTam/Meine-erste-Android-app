package com.example.william.meinefursteappe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// The main activity (the entry point of the app.
// When building and running the app, the system launches an instance of this
// Activity and loads its layout
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
