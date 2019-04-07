package com.example.lab3p1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et = (EditText) findViewById(R.id.editText);
    }



    public void Comentario(View view){
        String a = et.getText().toString();
        et.setText(a);
        Toast.makeText(Main2Activity.this, a, Toast.LENGTH_SHORT).show();
        Intent comentario = new Intent (this, MainActivity.class);
        startActivity(comentario);
    }
}
