package com.example.gulugulu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageButton maton;
    ImageButton wrys;
    ImageButton richard;
    ImageButton jake;
    ImageButton madao;
    ImageButton jimmy;
    ImageButton topo;
    ImageButton vaporeon;
    ImageButton simio;
    TextView texto;
    ArrayList<String> preguntas = new ArrayList<String>();
    ArrayList<ImageButton> botones = new ArrayList<ImageButton>();
    ArrayList<ImageButton> respuestas = new ArrayList<ImageButton>();
    int aciertos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.pregunta);
        preguntas.add(getString(R.string.pregunta_0));
        preguntas.add(getString(R.string.pregunta_1));
        preguntas.add(getString(R.string.pregunta_2));
        preguntas.add(getString(R.string.pregunta_3));
        preguntas.add(getString(R.string.pregunta_4));
        preguntas.add(getString(R.string.pregunta_5));
        preguntas.add(getString(R.string.pregunta_6));
        preguntas.add(getString(R.string.pregunta_7));
        preguntas.add(getString(R.string.pregunta_8));

        maton = (ImageButton) findViewById(R.id.imageMaton);
        wrys = (ImageButton) findViewById(R.id.imageqWrys);
        richard = (ImageButton) findViewById(R.id.imageRichard);
        jake = (ImageButton) findViewById(R.id.imageJake);
        madao = (ImageButton) findViewById(R.id.imageMadao);
        jimmy = (ImageButton) findViewById(R.id.imageJimmy);
        topo = (ImageButton) findViewById(R.id.imageTopo);
        vaporeon = (ImageButton) findViewById(R.id.imageVaporeon);
        simio = (ImageButton) findViewById(R.id.imageGorila);

        botones.add(maton);
        botones.add(wrys);
        botones.add(richard);
        botones.add(jake);
        botones.add(madao);
        botones.add(jimmy);
        botones.add(topo);
        botones.add(vaporeon);
        botones.add(simio);

        respuestas.add(jake);
        respuestas.add(richard);
        respuestas.add(jimmy);
        respuestas.add(vaporeon);
        respuestas.add(maton);
        respuestas.add(simio);
        respuestas.add(topo);
        respuestas.add(madao);
        respuestas.add(wrys);

        for(ImageButton boton : botones){
            boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    CharSequence text = "";
                    if(respuestas.get(aciertos) == boton){
                        text = "Has acertado";
                        boton.setColorFilter(Color.argb(150,0,200,0));
                        aciertos++;
                        boton.setOnClickListener(null);
                        if(aciertos < 9)
                        texto.setText(preguntas.get(aciertos));
                        else{
                            texto.setText(getString(R.string.felicidades));
                            findViewById(R.id.buttonSiguiente).setVisibility(View.VISIBLE);
                        }
                    }else{
                        text = "Has fallado";
                    }
                    Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
                }
            });
            findViewById(R.id.buttonSiguiente).setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                    Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                    //myIntent.putExtra("key", value); //Optional parameters
                    MainActivity.this.startActivity(myIntent);
                }
            });
        }
    }
}