package com.example.narcfactsknowyoursubstance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DrugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug);

        Intent intent = getIntent();

        String drugInfo="Don't use this kid or you will get dissed " + intent.getStringExtra("COURSE_SELECTED") + " Is for Pusies";

        TextView text = (TextView) findViewById(R.id.drug_name);

        text.setText(drugInfo);
    }

}
