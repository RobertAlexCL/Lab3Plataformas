package com.example.lab3p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Lugar2 extends AppCompatActivity {
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        et2 = (EditText) findViewById(R.id.editText2);
    }

    public void Comentario(View view){
        String a = et2.getText().toString();
        et2.setText(a);
        Toast.makeText(Lugar2.this, a, Toast.LENGTH_SHORT).show();
        Intent comentario = new Intent (this, MainActivity.class);
        startActivity(comentario);
    }
}