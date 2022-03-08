package com.test.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        //得到第一个页面传递的数据
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d("SecondActivity", data);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //返回数据给页面一
                Intent intent1 = new Intent();
                intent1.putExtra("data_return", "Hello FirstActivity");
                setResult(RESULT_OK, intent1);

                Toast.makeText(SecondActivity.this, "You clicked Button 2 to return FirstActivity", Toast.LENGTH_SHORT).show();
                //销毁Activity，效果和按下返回键一样
                finish();
            }
        });
    }

    /**
     * 通过Back返回数据
     */
    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return", "Hello FirstActivity(BackPressed)");
        setResult(RESULT_OK, intent);
        finish();
    }
}