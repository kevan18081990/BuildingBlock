package com.example.kevan.buildingblock.classes;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kevan.buildingblock.R;

/**
 * Created by Kevan on 1/5/2017.
 */

public class FooFragment extends Fragment {

    // Fragment is not fully created yet
    // Activity is not fully created yet
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Activity){
            //this.listener = (FragmentActivity) context;
            Log.i("FooFragment"," OnAttach: useful to assign fragment for particular activity");
        }
    }

    // Fragment view is not created yet
    // Activity is not fully created yet
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ArrayList<Thing> things = new ArrayList<Thing>();
        //adapter = new ThingsAdapter(getActivity(), things);
        Log.i("FooFragment"," OnCreate: useful for variable creation used to be displayed on view");
    }

    // Activity is not fully created yet
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        Log.i("FooFragment"," OnCreateView: useful to inflate view");
        return inflater.inflate(R.layout.fragment_foo, parent, false);
    }

    // Activity is not fully created yet
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
        //ListView lv = (ListView) view.findViewById(R.id.lvSome);
        //lv.setAdapter(adapter);
        Log.i("FooFragment"," OnViewCreated: useful to give data to the inflated view");
    }

    // Activity is now created
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("FooFragment"," OnActivityCreated: useful to access any views on parent activity");
    }

    //called with activity's onStart
    @Override
    public void onStart(){
        super.onStart();
        Log.i("FooFragment","onStart: called once the fragment is ready to be displayed on screen.");
    }

    //called with activity's onResume
    @Override
    public void onResume(){
        super.onResume();
        Log.i("FooFragment","onResume: useful to Allocate “expensive” resources such as registering for location, sensor updates, etc.");
    }

    //called with activity's onPause
    @Override
    public void onPause(){
        super.onPause();
        Log.i("FooFragment","onPause: Release “expensive” resources. Commit any changes.");
    }

    //called with activity's onStop
    @Override
    public void onStop(){
        super.onStop();
        Log.i("FooFragment","onStop: fragment is stopped");
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.i("FooFragment","onDestroyView: fragment's view is being destroyed, but the fragment is still kept around.");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("FooFragment","onDestroy: called when fragment is no longer in use.");
    }

    //This method is called when the fragment is no longer connected to the Activity
    //here fragment is no longer connected to the activity.
    @Override
    public void onDetach() {
        super.onDetach();
        //this.listener = null;
        Log.i("FooFragment"," OnDetach: last stage of fragment useful to make variable null and save memory");
    }
}

