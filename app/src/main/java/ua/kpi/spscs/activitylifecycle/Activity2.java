package ua.kpi.spscs.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;

import android.app.Activity;
import android.util.Log;
import android.view.View;

public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.e("onCreate ------ ", "AnotherActivity: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ------ ", "AnotherActivity: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume ------ ", "AnotherActivity: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ------ ", "AnotherActivity: onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ------ ", "AnotherActivity: onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ------ ", "AnotherActivity: onDestroy()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart ------ ", "AnotherActivity: onRestart()");

    }

    public void switchActivity(View view) {
        Intent intent = new Intent(Activity2.this, MainActivity.class);
        startActivity(intent);
    }
}