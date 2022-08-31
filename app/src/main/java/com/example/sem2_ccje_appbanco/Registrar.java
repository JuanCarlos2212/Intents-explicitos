package com.example.sem2_ccje_appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registrar extends AppCompatActivity {
    EditText edtProfesion, edtDireccion;
    Button btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        edtProfesion=findViewById(R.id.edtProfesion);
        edtDireccion=findViewById(R.id.edtDireccion);
        btnRegistrar=findViewById(R.id.btnRegistrado);


/* Intent Explisito
        String sNombreRecibido = getIntent().getStringExtra("nombreUsuario");
        String sPassRecibido = getIntent().getStringExtra("passUsuario");
        String sCorreo = getIntent().getStringExtra("correoUsuario");
        Toast.makeText(this, "Los datos recibidos son \n Usuario: "+sNombreRecibido+"\n pass: "
                + sPassRecibido+ "\n Correo: " + sCorreo, Toast.LENGTH_LONG).show();*/

    }
    public void registrar(View view){
        String sProfesion =edtProfesion.getText().toString();
        String sDireccion =edtDireccion.getText().toString();
        if("".equals(sProfesion)){
            edtProfesion.setError("Ingresar Profesion");
            edtProfesion.requestFocus();
        }
        if("".equals(sDireccion)){
            edtDireccion.setError("Ingresar Direccion");
            edtDireccion.requestFocus();
        }
        Toast.makeText(this, "Registrarfuncionando", Toast.LENGTH_SHORT).show();
    }
}