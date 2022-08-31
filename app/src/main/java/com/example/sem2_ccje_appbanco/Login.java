package com.example.sem2_ccje_appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {
    EditText edtUsuario, edtPassword, edtCorreo;
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUsuario=findViewById(R.id.edtUsuario);
        edtPassword=findViewById(R.id.edtPassword);
        btnEnviar=findViewById(R.id.btnIngresar);
        edtCorreo=findViewById(R.id.edtCorreo);

        btnEnviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this,MainActivity.class);
        //pasando parametros al activity registrar
        String sUsuario = edtUsuario.getText().toString();
        String sPassword = edtPassword.getText().toString();
        String sCorreo = edtCorreo.getText().toString();
        i.putExtra("nombreUsuario",sUsuario);
        i.putExtra("passUsuario",sPassword);
        i.putExtra("correoUsuario",sCorreo);
        startActivity(i);
    }
}