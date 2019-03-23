package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.labo3.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    Button boton_send;
    EditText texto_user, texto_password, texto_email, texto_gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_send = findViewById(R.id.boton_send);
        texto_user = findViewById(R.id.username);
        texto_password = findViewById(R.id.password);
        texto_email = findViewById(R.id.email);
        texto_gender = findViewById(R.id.gender);

        boton_send.setOnClickListener(v -> {
            Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY, texto_user.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_KEY1, texto_password.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_KEY2, texto_email.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_KEY3, texto_gender.getText().toString());
            startActivity(mIntent);
        });

    }
}
