package com.example.parte3programacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText ededad;
private ImageButton calcu;
private ImageButton creador1;
double laedad;
double FCM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ededad = (EditText) findViewById(R.id.edtedad);
        calcu = (ImageButton) findViewById(R.id.imagecalcu);
        creador1 = (ImageButton) findViewById(R.id.imagecreador);
        creador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), MainActivity3.class);
                    startActivity(intent);
            }
        });

        calcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ededad.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Ingrese su edad", Toast.LENGTH_SHORT).show();
                }
                else {
                    laedad = Double.parseDouble(ededad.getText().toString());
                    if(laedad> 125){
                        Toast.makeText(MainActivity.this, "Ingrese una edad valida ", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        FCM = 207 - (0.7 * laedad);
                        Intent a = new Intent(view.getContext(), MainActivity2.class);
                        a.putExtra("FCM",FCM);
                        startActivity(a);
                        finish();
                    }
                }
            }
        });
    }
}