package com.example.gulugulu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView texto;
    ImageView imageInglaterra;
    ImageView imageAmerica;
    Button inglaterra;
    Button america;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundo);

        texto = (TextView) findViewById(R.id.eleccion);
        inglaterra = (Button) findViewById(R.id.inglaterra);
        america = (Button) findViewById(R.id.USA);
        imageAmerica = (ImageView) findViewById(R.id.imageAmerica);
        imageInglaterra = (ImageView) findViewById(R.id.imageInglaterra);

        inglaterra.setText(new String(Character.toChars(0x1F1EC)));
        america.setText(new String(Character.toChars(0x1F1FA)));
    }
}
