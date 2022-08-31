package com.example.sem2_ccje_appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class intensImplicitos extends AppCompatActivity implements View.OnClickListener {
    Button btnCamara, btnTelefono, btnAlarma, btnContactosInte, btnMapa,btnArchivos,btnConfiguracion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intens_implicitos);
        btnTelefono=findViewById(R.id.btnTelefono);
        btnMapa=findViewById(R.id.btnMapa);
        btnContactosInte=findViewById(R.id.btnContactosInte);
        btnCamara=findViewById(R.id.btnCamara);
        btnAlarma=findViewById(R.id.btnAlarma);
        btnArchivos=findViewById(R.id.btnArchivos);
        btnConfiguracion=findViewById(R.id.btnConfiguracion);

        btnTelefono.setOnClickListener(this);
        btnMapa.setOnClickListener(this);
        btnContactosInte.setOnClickListener(this);
        btnCamara.setOnClickListener(this);
        btnAlarma.setOnClickListener(this);
        btnArchivos.setOnClickListener(this);
        btnConfiguracion.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnTelefono:{
                Intent i =new Intent(Intent.ACTION_DIAL);
                startActivity(i);
                break;
            }
            case R.id.btnMapa:{
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 11°40′13.51″,74°56′13.85″"));
                startActivity(i);
                break;
            }
            case R.id.btnContactosInte:{
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                startActivity(i);
                break;
            }
            case R.id.btnCamara:{
                Intent i =new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(i);
                break;
            }
            case R.id.btnAlarma:{
                Intent i =new Intent("android.intent.action.SET_ALARM");
                startActivity(i);
                break;
            }
            case R.id.btnConfiguracion:{
                Intent i =new Intent(Settings.ACTION_SETTINGS);
                startActivity(i);
                break;
            }
            case R.id.btnArchivos:{
                Intent i =new Intent(Intent.ACTION_GET_CONTENT);
                i.setType("image/*");
                startActivity(i);
                break;
            }

        }
    }
}