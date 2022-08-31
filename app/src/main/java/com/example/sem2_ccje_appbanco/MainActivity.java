package com.example.sem2_ccje_appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnRegistrar, btnSplash, btnLogin, btnReporte, btnContacto, btnGoogle, btnIntensImplicitos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //asociadoobjeto java con su respectivo xml
        btnRegistrar=findViewById(R.id.btnRegistrar);
        btnSplash=findViewById(R.id.btnSplash);
        btnLogin=findViewById(R.id.btnLogin);
        btnReporte =findViewById(R.id.btnReporte);
        btnContacto =findViewById(R.id.btnContactos);
        btnGoogle =findViewById(R.id.btnGoogle);
        btnIntensImplicitos =findViewById(R.id.btnIntenImplicitos);

        btnLogin.setOnClickListener(this);
        btnSplash.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);
        btnContacto.setOnClickListener(this);
        btnReporte.setOnClickListener(this);
        btnGoogle.setOnClickListener(this);

        btnIntensImplicitos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intento = new Intent(getApplicationContext(), intensImplicitos.class);
                startActivity(intento);
            }
        });


        String sNombreRecibido = getIntent().getStringExtra("nombreUsuario");
        String sPassRecibido = getIntent().getStringExtra("passUsuario");
        String sCorreo = getIntent().getStringExtra("correoUsuario");
        Toast.makeText(this, "Los datos recibidos son \n Usuario: "+sNombreRecibido+"\n pass: "
                + sPassRecibido+ "\n Correo: " + sCorreo, Toast.LENGTH_LONG).show();


    }

    @Override
    public void onClick(View carlos) {
        switch (carlos.getId()){
            case R.id.btnLogin:{
                Intent i =new Intent(this, Login.class);
                startActivity(i);
                break;
            }
            case R.id.btnSplash:{
                Intent i =new Intent(this, Splash.class);
                startActivity(i);
                break;
            }
            case R.id.btnRegistrar:{
                Intent i =new Intent(this, Registrar.class);
                startActivity(i);
                break;
            }
            case R.id.btnContactos:{
                Intent i =new Intent(this, Contactos.class);
                startActivity(i);
                break;
            }
            case R.id.btnReporte:{
                Intent i =new Intent(this, Reporte.class);
                startActivity(i);
                break;
            }
            case R.id.btnGoogle:{
                //Intent Implisito -- muestra la urlen el aplicativocorrespondientew
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(i);
                break;
            }
        }
    }
}