package com.mobileexercicio.menuexercicios;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEx1 = findViewById(R.id.btnExercicio1);
        Button btnEx2 = findViewById(R.id.btnExercicio2);

        btnEx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Exercicio1Activity.class);
                startActivity(intent);
            }
        });

        btnEx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Exercicio2Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.action_exercicio1){
            Intent intent = new Intent(getApplicationContext(), Exercicio1Activity.class);
            startActivity(intent);
        }else if(item.getItemId() == R.id.action_exercicio2){
            Intent intent = new Intent(getApplicationContext(), Exercicio2Activity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}