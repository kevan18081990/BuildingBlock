package com.example.kevan.buildingblock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.kevan.buildingblock.android_component.AndroidComponentActivity;
import com.example.kevan.buildingblock.firebase.FirebaseActivity;

public class MainActivity extends AppCompatActivity {

    private ListView lstView;
    private ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews(){
        lstView = (ListView) findViewById(R.id.lstView);
        String[] arrItemLst = getResources().getStringArray(R.array.array_main_item_lst);
        arrayAdapter = new ArrayAdapter(this,R.layout.item_lstview,arrItemLst);
        lstView.setAdapter(arrayAdapter);
        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i)
                {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(),AndroidComponentActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(),FirebaseActivity.class);
                        startActivity(intent1);
                        break;
                }
            }
        });
    }


}
