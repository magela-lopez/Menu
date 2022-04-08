package com.mobileexercicio.menuexercicios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio2Activity extends AppCompatActivity {

    String user = "Magela";
    String password = "magela22";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usuario = findViewById(R.id.txtUser);
        EditText senha = findViewById(R.id.txtPass);
        Button btnEntrar = findViewById(R.id.btnLogin);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(user.equals(usuario.getText().toString()) & password.equals(senha.getText().toString())){
                    Toast.makeText( getApplicationContext(), "Login feito com sucesso", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getApplicationContext(), WelcomeScreen.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("NomeUsuario", usuario.getText().toString());
                    intent.putExtras(bundle);

                    startActivity(intent);

                }else{
                    Toast.makeText( getApplicationContext(), "Usuario ou senha incorretos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}