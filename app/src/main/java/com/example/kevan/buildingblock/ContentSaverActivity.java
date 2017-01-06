package com.example.kevan.buildingblock;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kevan.buildingblock.classes.MyProvider;

public class ContentSaverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_saver);
    }

    public void goToUser(View view){
        Intent intent = new Intent(ContentSaverActivity.this,ContentUserActivity.class);
        startActivity(intent);
    }

    public void onClickAddName(View view) {
        ContentValues values = new ContentValues();
        values.put(MyProvider.name, ((EditText) findViewById(R.id.txtName))
                .getText().toString());
        Uri uri = getContentResolver().insert(MyProvider.CONTENT_URI, values);
        Toast.makeText(getBaseContext(), "New record inserted", Toast.LENGTH_LONG)
                .show();
    }

}
