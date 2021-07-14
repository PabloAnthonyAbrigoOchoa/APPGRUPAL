package com.example.grupal1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btnJugar;
    private TextView txtcorrecto;
    private TextView numeroIngresado;
    private int aleatorio;
    private int intentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtcorrecto=(TextView) findViewById(R.id.edittxtAdivina);
        btnJugar=(Button) findViewById(R.id.btncambiarPantallaInicial);
        aleatorio=generarNumerosAleatorios();
        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PantallaInicial.class);
                startActivity(i);
                int numeroUsuario;
                numeroUsuario=Integer.parseInt(numeroIngresado.getText().toString());
                if (aleatorio==numeroUsuario){
                    numeroIngresado.setText("Has Ganado, eres un Crack :')");
                }else{
                    intentos=intentos-1;
                }
                if(intentos==0){
                    btnJugar.setEnabled(false);
                    numeroIngresado.setText("QUE PENA, HAS PERDIDO :'(");
                }
            }
        });

    }

    public int generarNumerosAleatorios(){
        return (int)(Math.random()*10+1);
    }
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}