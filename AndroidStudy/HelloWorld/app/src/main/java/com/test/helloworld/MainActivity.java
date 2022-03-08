package com.test.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //将布局文件设置为activity_main.xml
        setContentView(R.layout.activity_main);
        //得到两个Button控件
        Button Button1 = (Button)findViewById(R.id.button1);
        Button Button2 = (Button)findViewById(R.id.button2);
        //为Button1绑定点击事件
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //使用intent启动ActivityB
                Intent intent = new Intent(MainActivity.this, ActivityB.class);
                startActivity(intent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityC.class);
                //100为请求码，用来区分不同的请求
                startActivityForResult(intent, 100);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //判断requestCode是否为startActivityForResult中设置的requestCode,并且ActivityC中resultCode是RESULT_OK
        if (requestCode == 100 && resultCode == Activity.RESULT_OK) {
            String val = data.getExtras().getString("helloworld");
            System.out.println(data);
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText("来自ActivityC的值：" + val);
        }
    }
}