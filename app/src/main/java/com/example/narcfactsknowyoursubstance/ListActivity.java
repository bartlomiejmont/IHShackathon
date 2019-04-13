package com.example.narcfactsknowyoursubstance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();


        // Capture the layout's TextView and set the string as its text
    }

}
