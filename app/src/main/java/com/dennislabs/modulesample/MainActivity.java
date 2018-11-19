package com.dennislabs.modulesample;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dennislabs.mylibrary.CounterActivity;


public class MainActivity extends AppCompatActivity {

    private static final int REQ_CODE = 100;
    private TextView tvCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCounter = (TextView) findViewById(com.dennislabs.mylibrary.R.id.tv_counter);
    }

    public void startDemoClick(View view) {
        Intent intent = new Intent(MainActivity.this, CounterActivity.class);
        startActivityForResult(intent, REQ_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQ_CODE){
            int counter = data.getIntExtra("counter", 0);
            tvCounter.setText("Counter:" + String.valueOf(counter));
        }else if(resultCode == CounterActivity.REQUEST_CODE){
            int counter = data.getIntExtra("counter", 0);
            tvCounter.setText("Counter:"+String.valueOf(counter));
        }
    }
}
