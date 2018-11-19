package com.dennislabs.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 200;
    private int count;
    private TextView tvCounter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_counter);
        tvCounter = (TextView) findViewById(R.id.tv_counter);
//        tvCounter.setText(count);

    }

    public void increaseCounter(View view) {
        count += 1;
        tvCounter.setText(String.valueOf(count));

    }

    public void submitCounter(View view) {
        Intent intent = new Intent();
        intent.putExtra("counter",count);
        setResult(RESULT_OK,intent);
        finish();
    }
}
