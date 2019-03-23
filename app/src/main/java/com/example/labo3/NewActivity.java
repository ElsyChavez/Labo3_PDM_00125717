package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.labo3.utils.AppConstants;

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

        /* Intent mIntent=this.getIntent();
        if (mIntent!=null) {
            text_user.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
        } */

        Bundle bundle = getIntent().getExtras();

        String dato1 = bundle.getString(AppConstants.TEXT_KEY);
        text_user.setText(dato1);
        String dato2 = bundle.getString(AppConstants.TEXT_KEY1);
        text_pass.setText(dato2);
        String dato3 = bundle.getString(AppConstants.TEXT_KEY2);
        text_email.setText(dato3);
        String dato4 = bundle.getString(AppConstants.TEXT_KEY3);
        text_gender.setText(dato4);

        String conjunto_datos = "Username: " +  dato1 + " Password: " + dato2 + " Email: " + dato3 + " Gender: " + dato4;

        boton_share.setOnClickListener(v->{
            Intent mIntent=new Intent();
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT, conjunto_datos);
            startActivity(mIntent);
        });

    }
}
