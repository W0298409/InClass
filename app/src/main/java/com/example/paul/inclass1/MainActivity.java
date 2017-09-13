package com.example.paul.inclass1;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.*;
import android.view.*;
import android.widget.Toast;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    //Step #1 create java object for the controls
    TextView tvDemo;
    Button btnDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "On create", Toast.LENGTH_SHORT).show();

        //Step # 2 - Connect variables to XML controls
        tvDemo = (TextView) findViewById(R.id.tvDemo);
        btnDemo = (Button) findViewById(R.id.btnDemo);

        //Step #3 - Create listeners
        OnClickListener oclBtnDemo = new OnClickListener()
        {
            @Override
            public void onClick(View view) {
                tvDemo.setText(R.string.textForTvDemo);
            }
        };

        btnDemo.setOnClickListener(oclBtnDemo);


    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "On Start", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "On Resume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "On Pause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "On Restart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "On Stop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "On Destroy", Toast.LENGTH_SHORT).show();
    }



    }
