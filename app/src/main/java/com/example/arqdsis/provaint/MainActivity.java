package com.example.arqdsis.provaint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/**
 * Created by Daniel Gonzalez Baratella on 26/10/2017.
 */
public class MainActivity extends Activity implements View.OnClickListener{

    private EditText texto1, texto2;
    private Button botao;
    /**
     * Método criado por Daniel Gonzalez Baratella em 26/10/2017.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = (EditText) findViewById(R.id.texto1);
        texto2 = (EditText) findViewById(R.id.texto2);
        botao = (Button) findViewById(R.id.botao);
        botao.setOnClickListener(this);
    }

    /**
     * Método criado por Daniel Gonzalez Baratella em 26/10/2017.
     */
    public void onClick(View v){

        Intent intent = new Intent(this, SegundaTela.class);
        intent.putExtra("texto1", texto1.getText().toString());
        intent.putExtra("texto2", texto2.getText().toString());

        startActivity(intent);
    }
}
