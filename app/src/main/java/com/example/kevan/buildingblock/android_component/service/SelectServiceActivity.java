package com.example.kevan.buildingblock.android_component.service;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.kevan.buildingblock.R;
import com.example.kevan.buildingblock.android_component.service.started_service.ServiceActivity;
import com.example.kevan.buildingblock.android_component.service.bound_service.BindServiceActivity;

public class SelectServiceActivity extends AppCompatActivity {

    private ListView lstServiceView;
    private ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_service);
        findViews();
    }

    private void findViews(){
        lstServiceView = (ListView)findViewById(R.id.lstServiceView);
        String[] arrItemLst = getResources().getStringArray(R.array.array_service_item_lst);
        arrayAdapter = new ArrayAdapter(this,R.layout.item_lstview,arrItemLst);
        lstServiceView.setAdapter(arrayAdapter);
        lstServiceView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent0 = new Intent(getApplicationContext(),ServiceActivity.class);
                        startActivity(intent0);
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(),BindServiceActivity.class);
                        startActivity(intent1);
                    case 2:
                }
            }
        });
    }
}
