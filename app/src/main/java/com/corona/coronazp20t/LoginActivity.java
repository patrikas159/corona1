package com.corona.coronazp20t;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText email, pass;
    Button login, registerbtn;
    TextView btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//atidaromas langas (tuscias)
        setContentView(R.layout.activity_login);//pridek prie to lango, vaizda
        //kodas rasomas nuo cia
        Button login = findViewById(R.id.login);
        Button register = findViewById(R.id.register);//susiejamas vaizde esantis elementa su kodu
        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);


        login.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                // cia rasomas kodas kuris vykdomas paspaudus mygtuka
               /* Toast.makeText(LoginActivity.this,"prisijungimo vardas:"+
                        username.getText().toString() + "\n" + "slaptazodis:" +
                        password.getText().toString(), Toast.LENGTH_LONG).show();*/
                if (Validation.isValidUsername(username.getText().toString())) {
                    //ketinimas pereiti i paieskos langa                is kur            į kur
                    Intent goToSeachActivity = new Intent(LoginActivity.this, SeachActivity.class);
                    startActivity(goToSeachActivity);
                } else {//Jeigu vartotojas ivede bloga prisijungimo varda
                    username.setError(getResources().getString(R.string.login_invalid_username));
                    username.requestFocus();


                }

            }

        });

            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                    startActivity(i);
                    finish();

                }
            });

        }


}
