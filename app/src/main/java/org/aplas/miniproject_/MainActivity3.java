package org.aplas.miniproject_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity3 extends AppCompatActivity {

        // Array of strings...
        ListView simpleList;
        String countryList[] = {"India", "China", "Australia", "Portugle", "America", "NewZealand"};

        @Override   protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);      setContentView(R.layout.activity_main);
            simpleList = (ListView)findViewById(R.id.simpleListView);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_main3, R.id.list_view, countryList);
            simpleList.setAdapter(arrayAdapter);
        }
}
