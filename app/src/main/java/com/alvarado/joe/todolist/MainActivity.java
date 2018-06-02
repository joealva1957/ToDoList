package com.alvarado.joe.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MENSAJE_TAREA = "com.alvarado.joe.todolist.MENSAJE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Se utiliza cuando el usuario ha pulsado el botón ADD TASK */
    public void agregarTarea(View view) {
        Intent intent = new Intent(this, MostrarListaActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTitle);
        String nombreTarea = editText.getText().toString();
        intent.putExtra(MENSAJE_TAREA, nombreTarea);
        startActivity(intent);
    }

}
