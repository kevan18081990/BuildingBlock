package com.example.kevan.buildingblock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

//TODO: put activity lifecycle on the layout of this activity

public class ExampleActivity extends AppCompatActivity  {

    Button btnOpenDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        //findViews();
        notify("onCreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        notify("onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        notify("onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        notify("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        notify("onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        notify("onRestart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        notify("onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        notify("onSaveInstanceState");
    }

    private void notify(String methodName) {
        Toast.makeText(this,methodName,Toast.LENGTH_SHORT).show();
    }

//    private void findViews(){
//        btnOpenDialog = (Button) findViewById(R.id.btnOpenDialog);
//        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showNoticeDialog();
//            }
//        });
//    }
//
//    public void showNoticeDialog() {
//        // Create an instance of the dialog fragment and show it
//        DialogFragment dialog = new NoticeDialogFragment();
//        dialog.show(getSupportFragmentManager(), "NoticeDialogFragment");
//    }



}
