package com.example.kevan.buildingblock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
        String[] arrItemLst = getResources().getStringArray(R.array.array_item_lst);
        arrayAdapter = new ArrayAdapter(this,R.layout.item_lstview,arrItemLst);
        lstView.setAdapter(arrayAdapter);
        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i)
                {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(),ExampleActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(),SelectServiceActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(),BroadcastActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(),ContentSaverActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(),ExampleFragmentActivity.class);
                        startActivity(intent4);
                        break;
                }
            }
        });
    }


}
