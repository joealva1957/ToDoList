package com.alvarado.joe.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_lista);

        //
        Intent intent = getIntent();
        String mensaje = intent.getStringExtra(MainActivity.MENSAJE_TAREA);

        //Capturar el
        TextView textView = (TextView) findViewById(R.id.textViewMostrarLista);
        textView.setText(mensaje);

    }
}
