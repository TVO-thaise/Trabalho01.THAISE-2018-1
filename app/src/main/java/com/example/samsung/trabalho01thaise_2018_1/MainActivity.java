package com.example.samsung.trabalho01thaise_2018_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        float tamanho_float = Float.parseFloat(etTamanho.getText().toString());


        mostraMsg(tamanho_float);
    }

    private void mostraMsg(float tam){
        //capacidade de pintura
        float lt18, lt3e6, result, valor;
        int result_int;
        lt18 = 108;
        lt3e6 = (float) 21.6;
        String msg="";


        //Lata de 18 Litros
        result = tam / lt18;
        result_int = (int) result;
        if(result > result_int){
            result_int = result_int + 1;
        }
        valor = result_int * 80;
        msg += ("O cliente terá que comprar " + result_int);
        msg += ("latas de 18 litros. Para isso gastará " + valor);
        msg +=("reais");


        if(tam > 108){


        }
        if(tam >=6 && tam <= 75){
            msg += " ,A sua melhor opção é usar galões de 3,6 litros";
        }


        tvMensagem.setText( (String.valueOf(tam).concat( msg)));
    }
}
