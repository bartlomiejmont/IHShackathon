package com.example.narcfactsknowyoursubstance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class ListActivity extends AppCompatActivity
{

    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView lvItems;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String drugs [] = getResources().getStringArray(R.array.support_issues_array);
        Arrays.sort(drugs);

        lvItems = (ListView) findViewById(R.id.drugs_listview);
        items = new ArrayList<String>();
        itemsAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);
        lvItems.setAdapter(itemsAdapter);
        intent = new Intent(this, DrugActivity.class);
        lvItems.setOnItemClickListener(listener);

        fillList(drugs);

    }

    private AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent,View v,int position,long id){

            String itemValue = (String) lvItems.getItemAtPosition(position);
            intent.putExtra("COURSE_SELECTED", itemValue);


            startActivity(intent);
        }
    };

    private void fillList (String[] a){

        for(String x:a){
            items.add(x);
        }

    }




}
