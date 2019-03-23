package com.example.labo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

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

    }
}
