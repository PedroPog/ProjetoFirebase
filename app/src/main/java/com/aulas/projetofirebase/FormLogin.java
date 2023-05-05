package com.aulas.projetofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView text_tela_cadastro; //variavel global

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        InciarComponentes(); //Iniciado componete declarado

        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {  //Chama a tela cadastro
            @Override
            public void onClick(View v) { // Ação de clique para abrir a tela cadastro

                Intent intent = new Intent(FormLogin.this,FormCadastro.class); // abre a tela cadastro
                startActivity(intent); //Start a ação
            }
        });
    }
    private void InciarComponentes(){ // inclui a tela cadastro

        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
    }

    public void onClickTest(View view){
        Intent intent = new Intent(FormLogin.this,TelaPrincipal.class);
        startActivity(intent);
    }
    }