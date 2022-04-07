package com.example.appagenda.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appagenda.R;
import com.example.appagenda.UserDTO;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSignUpNextPage = findViewById(R.id.buttonSignUpNextPage);
        Button buttonBackLogin = findViewById(R.id.buttonLogin);

        buttonSignUpNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentUser = new Intent(getApplicationContext(), SingUpActivity.class);

                startActivity(intentUser);
            }
        });
        buttonBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle myBundle = getIntent().getExtras();

                EditText password = findViewById(R.id.loginPasswordEditText);
                EditText email = findViewById(R.id.loginEmailEditText);

                UserDTO userDTO = new UserDTO("",email.getText().toString(),password.getText().toString(),"");//(UserDTO) myBundle.get("userDTO");

                Toast.makeText(MainActivity.this, "Email:"+userDTO.getEmail()+" - Senha:"+userDTO.getPassword(), Toast.LENGTH_SHORT).show();

            }
        });


    }


}