package com.example.grupal1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.grupal1.MainActivity;

public class PantallaInicial extends AppCompatActivity {


    private Button SigaIntentando;
    private TextView txtCorrecto;
    private MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_inicial);
        SigaIntentando=(Button)findViewById(R.id.btnRegresarMenuP);
        txtCorrecto=(TextView) findViewById(R.id.txttxtcorrecto);
        /*txtCorrecto.setText(mainActivity.RespuestaVerificar());*/
        SigaIntentando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PantallaInicial.this, MainActivity.class);
                startActivity(i);
            }
        });
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
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
