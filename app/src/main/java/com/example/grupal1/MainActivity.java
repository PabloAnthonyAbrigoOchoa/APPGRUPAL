package com.example.grupal1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnJugar;
    private TextView txtadivina;
    private TextView txtrango;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtadivina=(TextView) findViewById(R.id.edittxtAdivina);
        txtrango=(TextView) findViewById(R.id.editTxtRango);
        btnJugar=(Button) findViewById(R.id.btnJugar);
        btnJugar.setOnClickListener(this);
    }
        @Override
        public void onClick(View v) {

            if(v==btnJugar){
                if(txtadivina.getText().toString().isEmpty()){
                    txtadivina.setError("Escriba un número");
                } else{
                    if(txtrango.getText().toString().isEmpty()){
                        txtrango.setError("Escriba el Rango a jugar");
                    } else{
                        try {
                            int numTxt = Integer.valueOf(txtadivina.getText().toString());
                            int txtRangoObtenido = Integer.valueOf(txtrango.getText().toString());
                            if (numTxt>txtRangoObtenido){
                                txtadivina.setError("Ingrese un número dentro del Rango que establecio.");

                            }else{
                                Verificar();
                                /*btnJugar.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent i = new Intent(MainActivity.this, PantallaInicial.class);
                                        startActivity(i);
                                    }
                                });*/
                            }
                }catch (NumberFormatException n){

                        }

                    }
                }
            }

        }

        public int generarNumerosAleatorios(int a){
            Random naleatorio = new Random();
            int n= naleatorio.nextInt(a);
            return n;
        }

        public void Verificar(){

            try {
                int numTxt = Integer.valueOf(txtadivina.getText().toString());
                int txtRangoObtenido = Integer.valueOf(txtrango.getText().toString());
                int numAleatorio = generarNumerosAleatorios(txtRangoObtenido);
                if(numTxt==numAleatorio){
                    Toast.makeText(this,"GANASTE, ERES EXCELENTE :-)",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,":-( LO SENTIMOS, PERDISTE. El Número era: "+numAleatorio,Toast.LENGTH_LONG).show();
                }

            }catch(NumberFormatException n){
                txtadivina.setError("Ingrese solamente números");
            }

        }
        /*public String RespuestaVerificar(){

        try {
            int numTxt = Integer.valueOf(txtadivina.getText().toString());
            int txtRangoObtenido = Integer.valueOf(txtrango.getText().toString());
            int numAleatorio = generarNumerosAleatorios(txtRangoObtenido);
            if(numTxt==numAleatorio){
                String Ganaste = "GANASTE, ERES EXCELENTE :-)";
                return Ganaste;
            }else{
                String Perdiste = ":-( LO SENTIMOS, PERDISTE. El Número era:"+numAleatorio;
                return Perdiste;
            }

        }catch(NumberFormatException n){

        }
        return "Ocurrió un error";

    }*/

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


