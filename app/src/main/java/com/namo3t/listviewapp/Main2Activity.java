package com.namo3t.listviewapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtTitle_show;
        txtTitle_show = findViewById(R.id.txtResult);

        Intent intent= getIntent();
        String txt_get_id = intent.getStringExtra("id");
        String txt_get_title = intent.getStringExtra("title");
        txtTitle_show.setText(txt_get_title);

        //Title Bar of Page 2
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Movie Title");
        ab.setDisplayHomeAsUpEnabled(true);

    }
}
