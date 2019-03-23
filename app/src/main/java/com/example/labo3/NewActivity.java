package com.example.labo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    Button boton_share;
    TextView text_user, text_pass, text_email, text_gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        boton_share = findViewById(R.id.share_boton);
        text_user = findViewById(R.id.print_user);
        text_pass = findViewById(R.id.print_password);
        text_email = findViewById(R.id.print_email);
        text_gender = findViewById(R.id.print_gender);

    }
}
