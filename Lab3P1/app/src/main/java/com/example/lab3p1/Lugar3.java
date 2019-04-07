package com.example.lab3p1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Lugar3 extends AppCompatActivity {
    EditText et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        et3 = (EditText) findViewById(R.id.editText3);
    }

    public void Comentario(View view){
        String a = et3.getText().toString();
        et3.setText(a);
        Toast.makeText(Lugar3.this, a, Toast.LENGTH_SHORT).show();
        Intent comentario = new Intent (this, MainActivity.class);
        startActivity(comentario);
    }
}