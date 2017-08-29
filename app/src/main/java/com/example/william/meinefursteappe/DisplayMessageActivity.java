package com.example.william.meinefursteappe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

// From New > Activity > Empty Activity, AS does:
    // Creates this DisplayMessageActivity.java file
    // Creates corresponding activity_display_message.xml layout file
    // Adds the required <activity> element in AndroidManifest.xml

    // Display the message passed by the first activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        // once again use Option+Return to import missing classes
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }
}
