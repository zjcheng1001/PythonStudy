package com.test.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityC extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置activityc.xml为布局文件
        setContentView(R.layout.activityc);
        //得到Button实例
        Button button1 = (Button)findViewById(R.id.buttonc1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //实例化一个intent对象
                Intent data = new Intent();
                //获取EditText实例
                EditText editText = (EditText)findViewById(R.id.etActivityc);
                //得到EditText的值
                String val = editText.getText().toString();
                //将EditText的值存到intent对象中(以键值对的形式)
                data.putExtra("helloworld", val);
                //调用setResult方法，将intent对象(data)传回父Activity
                setResult(Activity.RESULT_OK, data);
                //关闭当前Activity
                finish();
            }
        });
    }
}
