package com.example.william.meinefursteappe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

// The main activity (the entry point of the app.
// When building and running the app, the system launches an instance of this
// Activity and loads its layout
public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.william.meinefursteappe.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when User taps the Send button
    public void sendMessage (View view) {
        // Intent constructor takes 2 parameters
            // 1) Context - 'this' because Activity is a subclass of Context
            // 2) Class of the app component to which the system should deliver the intent.
                // Intent in this case being the activity that should be sparted
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        // putExtra() adds the EditText's value to the intent
        // An Intent can carry data types as key-value pairs called 'extras'
        // key is public constant EXTRA_MESSAGE  b/c the next activity uses the key to get the text value
            // Good practice to define keys for intent extras using app's package name as prefix, to ensure uniqueness
        intent.putExtra(EXTRA_MESSAGE, message);
        // startActivity() starts an instance of DisplayMessageActivity specified by the Intent
            // Now the Class needs to be created, done with the DisplayMessageActivity.java file
        startActivity(intent);
    }
}
