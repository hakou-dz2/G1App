package com.example.g1app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username= findViewById(R.id.et_username);
        EditText password= findViewById(R.id.et_pass);

        TextView forget = findViewById(R.id.tv_forget);

        Button login = findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_username = username.getText().toString();
                String text_password = password.getText().toString();
                if(text_username.equals("admin") && text_password.equals("admin")){
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    intent.putExtra("username",text_username);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "username or password are wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });


        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SigninActivity.class);
                startActivity(intent);
            }
        });

    }
}