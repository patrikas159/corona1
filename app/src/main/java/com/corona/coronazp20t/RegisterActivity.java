package com.corona.coronazp20t;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button register = findViewById(R.id.registerbtn);
        final EditText username = findViewById(R.id.register_username);
        final EditText password = findViewById(R.id.register_password);
        final EditText email = findViewById(R.id.register_email);

        register.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                // cia rasomas kodas kuris vykdomas paspaudus mygtuka
               /* Toast.makeText(LoginActivity.this,"prisijungimo vardas:"+
                        username.getText().toString() + "\n" + "slaptazodis:" +
                        password.getText().toString(), Toast.LENGTH_LONG).show();*/
                if (Validation.isValidUsername(username.getText().toString())) {
                    //ketinimas pereiti i login langa                is kur            į kur
                    Intent goLoginActivity = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(goLoginActivity);
                } else {//Jeigu vartotojas ivede bloga prisijungimo varda
                    username.setError(getResources().getString(R.string.Register_invalid_username));
                    username.requestFocus();


                }
                if (Validation.isValidPassword(password.getText().toString())) {
                    //ketinimas pereiti i login langa                is kur            į kur
                    Intent goLoginActivity = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(goLoginActivity);
                } else {//Jeigu vartotojas ivede bloga slaptazodi
                    password.setError(getResources().getString(R.string.Register_invalid_username));
                    password.requestFocus();

                }
                if (Validation.isValidEmail(email.getText().toString())) {
                    //ketinimas pereiti i login langa                is kur            į kur
                    Intent goLoginActivity = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(goLoginActivity);
                } else {//Jeigu vartotojas ivede bloga email
                    email.setError(getResources().getString(R.string.Register_invalid_username));
                    email.requestFocus();
                }

            }


        });
    }
}







