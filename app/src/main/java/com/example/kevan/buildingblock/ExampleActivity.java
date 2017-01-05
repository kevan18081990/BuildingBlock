package com.example.kevan.buildingblock;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

//TODO: put activity lifecycle on the layout of this activity

public class ExampleActivity extends AppCompatActivity  {

    Button btnOpenDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        findViews();
        notify("onCreate: Activity is created");
    }

    @Override
    protected void onStart(){
        super.onStart();
        notify("onStart: Activity is visible");
    }

    @Override
    protected void onPause() {
        super.onPause();
        notify("onPause: Activity is not interactable");
    }

    @Override
    protected void onResume() {
        super.onResume();
        notify("onResume: Activity is interactable");
    }

    @Override
    protected void onStop() {
        super.onStop();
        notify("onStop: Activity is not visible");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        notify("onDestroy: Activity is destroyed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        notify("onRestart: Activity is restarted after stopped and before destroyed");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        notify("onRestoreInstanceState: called before onResume if onSaveInstance had been called first");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        notify("onSaveInstanceState: called after onPause");
    }

    private void notify(String methodName) {
        Log.i("ExampleActivity",methodName);
        //Toast.makeText(this,methodName,Toast.LENGTH_SHORT).show();
    }

    private void findViews(){
        btnOpenDialog = (Button) findViewById(R.id.btnOpenDialog);
        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNoticeDialog();
            }
        });
    }

    public void showNoticeDialog() {
        // Create an instance of the dialog fragment and show it
        DialogFragment dialog = new ExampleDialogFragment();
        dialog.show(getSupportFragmentManager(), "Example Dialog Fragment");
    }



}
