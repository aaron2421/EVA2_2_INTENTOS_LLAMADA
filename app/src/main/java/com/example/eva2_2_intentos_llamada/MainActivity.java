package com.example.eva2_2_intentos_llamada;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Intent inMarcar;
    EditText edTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edTxt = findViewById(R.id.editTextTel);
    }

    public void click(View v){
        View btn = findViewById(R.id.button);
        String sTel = "tel:" + edTxt.getText().toString();
        if(v == btn) {
            inMarcar = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
        } else {
            inMarcar = new Intent(Intent.ACTION_DIAL, Uri.parse(sTel));
        }
        startActivity(inMarcar);
    }
}
