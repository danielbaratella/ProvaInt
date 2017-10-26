package com.example.arqdsis.provaint;

import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;
/**
 * Created by Daniel Gonzalez Baratella on 26/10/2017.
 */

public class SegundaTela extends Activity {

    private EditText texto3;
    int tabuada, ate, i;
    String texto = "";

    /**
     * Método criado por Daniel Gonzalez Baratella em 26/10/2017.
     * Aqui ele já faz tudo, pega os dados, joga numa string e seta no "texto3"
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
        texto3 = (EditText) findViewById(R.id.texto3);

        Bundle bundle = getIntent().getExtras();

        if(bundle.containsKey("texto1")){
           tabuada = Integer.parseInt(bundle.getString("texto1"));
        }

        if(bundle.containsKey("texto2")){
            ate = Integer.parseInt(bundle.getString("texto2"));
        }

        for(i=1; i<=ate; i++){
            texto += tabuada + " x " + i + " = " + tabuada * i + "\n\n";
        }
        texto3.setText(texto);
    }
}
