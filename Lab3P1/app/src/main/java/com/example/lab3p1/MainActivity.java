package com.example.lab3p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText a, b;
    TextView c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (EditText) findViewById(R.id.currentName);
        b = (EditText) findViewById(R.id.currentName2);
        c = (TextView) findViewById(R.id.textView1);

    }


    public void Lugar1(View view){
        Intent lugar1 = new Intent (this, Main2Activity.class);
        startActivity(lugar1);
    }

    public void Lugar2(View view){
        Intent lugar1 = new Intent (this, Lugar2.class);
        startActivity(lugar1);
    }

    public void Lugar3(View view){
        Intent lugar1 = new Intent (this, Lugar3.class);
        startActivity(lugar1);
    }
    public void onClick(View view) {
        if (a.getVisibility() == View.VISIBLE){
            a.setVisibility(View.GONE);
            b.setVisibility(View.VISIBLE);
            c.setVisibility(View.GONE);

        }
        else
        {
            a.setVisibility(View.VISIBLE);
            b.setVisibility(View.GONE);
            c.setVisibility(View.VISIBLE);
        }
    }
}
