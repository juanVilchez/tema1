package com.ingwilson.miprimerproyecto;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Actividad3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
    }

    public void actividad2(View view) {
        startActivity(new Intent(this, Main2Activity.class));
    }

    public void mispinner(View view) {
        startActivity(new Intent(this, MiSpinner.class));
    }

    public void mitabhost(View view) {
        startActivity(new Intent(this, MiFragmentTabhost.class));
    }
}
