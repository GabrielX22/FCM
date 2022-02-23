package com.example.parte3programacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView latidos;
private ImageButton creador2;
private ImageButton regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        latidos = (TextView) findViewById(R.id.txtresultado);
        creador2 = (ImageButton) findViewById(R.id.imagecreador2);
        regresar = (ImageButton) findViewById(R.id.imageregresar);
        Bundle extras = getIntent().getExtras();
        double a1 = extras.getDouble("FCM");
        latidos.setText(String.valueOf(a1 + " Pulsaciones/Minuto"));

        creador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity3.class);
                startActivity(intent);
            }
        });

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}