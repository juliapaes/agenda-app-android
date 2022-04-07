package com.example.appagenda.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appagenda.R;
import com.example.appagenda.UserDTO;

public class SingUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up2);
        Button buttonBackLogin = findViewById(R.id.buttonBackLogin);
        Button buttonSignUp = findViewById(R.id.buttonSignUp);


        buttonBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle myBundle = getIntent().getExtras();

                EditText password = findViewById(R.id.singUpPasswordEditText);
                EditText email = findViewById(R.id.singUpEmailEditText);
                EditText date = findViewById(R.id.singUpDateEditText);
                EditText name = findViewById(R.id.singUpNameEditText);

                UserDTO userDTO = new UserDTO(name.getText().toString(),email.getText().toString(),password.getText().toString(),date.getText().toString());

                Toast.makeText(SingUpActivity.this, "Email:"+userDTO.getEmail()+" - Senha:"+userDTO.getPassword() +
                        "Nome:"+userDTO.getName() +
                                "Data:"+userDTO.getDate()
                        , Toast.LENGTH_SHORT).show();

            }
        });
    }


}