package com.test.boardcastlogout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LonginActivity extends BaseActivity {
    private EditText accountEdit;
    private EditText passwordEdit;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longin);
        accountEdit = (EditText) findViewById(R.id.account);
        passwordEdit = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = accountEdit.getText().toString();
                String password = passwordEdit.getText().toString();
                if (account.equals("admin") && password.equals("123456")) {
                    Intent intent = new Intent(LonginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast t = Toast.makeText(LonginActivity.this, "", Toast.LENGTH_SHORT);
                    //小米手机Toast会自动带上包名，解决方法，Toast的msg先设置为""，然后在使用setText方法
                    t.setText("Account or Password is invalid");
                    t.show();
                }
            }
        });
    }
}