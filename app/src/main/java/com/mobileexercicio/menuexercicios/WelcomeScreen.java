package com.mobileexercicio.menuexercicios;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeScreen extends AppCompatActivity {

    private String nameUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        if(savedInstanceState != null){
            nameUser = savedInstanceState.getString("nome");
        }
        TextView nomeUsuario = findViewById(R.id.lblName);
        Bundle bundle = getIntent().getExtras();
        nomeUsuario.setText(bundle.getString("NomeUsuario"));
        nameUser = nomeUsuario.getText().toString();

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("nome",nameUser);
    }
}
