package com.example.i_nimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Registration extends AppCompatActivity {

    TextView textView;
    EditText name, email, psw, conf_psw;
    FirebaseAuth mAuth;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        textView =findViewById(R.id.login);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        name=findViewById(R.id.name_et);
        email=findViewById(R.id.email_et);
        psw=findViewById(R.id.psw_et_1);
        conf_psw=findViewById(R.id.psw_et_2);
        button=findViewById(R.id.signup_btn);
        mAuth=FirebaseAuth.getInstance();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name_oc=name.getText().toString();
                String email_oc=email.getText().toString();
                String psw_oc=psw.getText().toString();
                String conf_psw_oc=conf_psw.getText().toString();
                if(name_oc.isEmpty())
                {
                    name.setError("Enter a Name");
                    name.requestFocus();
                    return;
                }
            }
        });
    }
}