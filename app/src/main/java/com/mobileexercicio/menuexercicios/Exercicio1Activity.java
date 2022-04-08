package com.mobileexercicio.menuexercicios;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio1Activity extends AppCompatActivity implements View.OnClickListener{

    private TextView txtTexto1;
    private EditText etTextoTroca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTexto1 = findViewById(R.id.txtLabel1);
        etTextoTroca = findViewById(R.id.etText1);
        Button btnTroca = findViewById(R.id.btnTrocar1);

        btnTroca.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        txtTexto1.setText(etTextoTroca.getText());
        Toast.makeText( getApplicationContext(), txtTexto1.getText(), Toast.LENGTH_SHORT).show();
    }
}

