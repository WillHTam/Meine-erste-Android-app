package com.example.william.meinefursteappe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayMessageActivity extends AppCompatActivity {

// From New > Activity > Empty Activity, AS does:
    // Creates this DisplayMessageActivity.java file
    // Creates corresponding activity_display_message.xml layout file
    // Adds the required <activity> element in AndroidManifest.xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }
}
