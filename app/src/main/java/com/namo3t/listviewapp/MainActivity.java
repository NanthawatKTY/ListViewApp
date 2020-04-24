package com.namo3t.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] Movies = new String[] {
            "Spider Man1",
            "Spider Man2",
            "Spider Man3",
            "Game of Thrones1",
            "Game of Thrones2",
            "Game of Thrones3",
            "Game of Thrones4",
            "IronMan"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView;
        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Movies);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                String itemValue = (String) listView.getItemAtPosition(i);
                Intent showPage = new Intent(MainActivity.this, Main2Activity.class);
                showPage.putExtra("id", "" + i + "");
                showPage.putExtra("title", "" + itemValue + "");
                startActivity(showPage);
            }
        });
    }
}
