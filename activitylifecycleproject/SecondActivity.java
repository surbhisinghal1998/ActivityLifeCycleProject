package com.solution.activitylifecycleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
   Toast toast= Toast.makeText(this, "ON create2", Toast.LENGTH_SHORT);
   toast.setGravity(Gravity.RIGHT,0,0);
   toast.show();
    }
    @Override
    protected void onStart() {
        super.onStart();
     Toast toast=   Toast.makeText(this, "On Start Method2", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.LEFT,0,0);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
      Toast toast=  Toast.makeText(this, "On Restart Method 2", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.show();
    }
    @Override
    protected void onPause() {
        super.onPause();
       Toast toast= Toast.makeText(this, "On Pause Method 2", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT,0,0);
        toast.show();
    }
    @Override
    protected void onStop() {
        super.onStop();
       Toast toast= Toast.makeText(this, "On Stop 2", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
       Toast toast= Toast.makeText(this, "On Resume method 2", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT,0,0);
        toast.show();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
       Toast toast= Toast.makeText(this, "On Destroy method", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT,0,0);
        toast.show();

    }
}
