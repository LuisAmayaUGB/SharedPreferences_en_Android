package com.example.miejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btnguardar, btnleer;
    private EditText texto;
    private TextView visor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnguardar=(Button) findViewById(R.id.btnguardar);
        texto=findViewById(R.id.edtTexto);
        btnleer=findViewById(R.id.btnleer);
        visor=findViewById(R.id.txtTexto);


    }

    public void guardar(View view) {
        utilitarios.setDefaultsPreference("usuario","luis_amaya",view.getContext());
        utilitarios.setDefaultsPreference("num","22",view.getContext());

    }


public  void leer(View view){
       visor.setText(utilitarios.getDefaultsPreference("num",this));
       String dato=utilitarios.getDefaultsPreference("num",this);
       int datosnume=Integer.parseInt(dato);
       datosnume=datosnume+1;
        String valor_final=String.valueOf(datosnume);
        Toast.makeText(MainActivity.this,valor_final, Toast.LENGTH_LONG).show();

}





}