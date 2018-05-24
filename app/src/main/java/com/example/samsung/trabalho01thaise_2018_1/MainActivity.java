package com.example.samsung.trabalho01thaise_2018_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etTamanho;
    private Button btCalcular;
    private TextView tvMensagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTamanho = (EditText) findViewById(R.id.etTamanho);
        btCalcular = (Button) findViewById(R.id.btCalcTinta);
        tvMensagem = (TextView) findViewById(R.id.tvMensagem);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();
            }
        });

    }

    private void calcular(){

        int tamanho = Float.parseFloat(etTamanho.getText().toString());


        mostraMsg("calcular a dividao por latas de tinta"jhbujhbhjbh));
    }

    private void mostraMsg(int tam){
        String msg="";

        if(tam > 75){
            msg += " - Melhor usar o galao de 18 litros, devido ao valor ser superior";

        }
        if(tam >=6 && tam <= 75){
            msg += " ,A sua melhor opção é usar galões de 3,6 litros";
        }


        tvMensagem.setText( (String.valueOf(tam).concat( msg)));
    }
}
