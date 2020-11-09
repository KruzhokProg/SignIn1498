package com.example.signin1498;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // alt + enter - импорт бибилиотеки
    EditText etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);

    }

    public void checkUser(View view) {

        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();

        if(!email.isEmpty() && !password.isEmpty()){
            if(email.equals("wsr") && password.equals("123")){
                // intent - обьект
                Intent intent = new Intent(this, UserActivity.class);
                intent.putExtra("myExtraEmail", email);
                intent.putExtra("myExtraPass", password);
                intent.putExtra("myExtraRole", "admin");
                startActivity(intent);
            }
            else if(email.equals("client") && password.equals("123")){
                Intent intent = new Intent(this, UserActivity.class);
                intent.putExtra("myExtraEmail", email);
                intent.putExtra("myExtraPass", password);
                intent.putExtra("myExtraRole", "user");
                startActivity(intent);
            }
            else{
                Toast.makeText(this, "данные входа некорректны", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show();
        }

    }
}
