package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_c_repet extends AppCompatActivity {

    Button operar,ver,correr, volver_s,volver_menu;
    EditText entrada,entrada1,salida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_repet);
        operar = findViewById(R.id.operar_repe);
        ver = findViewById(R.id.ver_repe);
        correr=findViewById(R.id.correr_repe);
        entrada = findViewById(R.id.et_repe);
        entrada1 = findViewById(R.id.et_repe1);
        salida= findViewById(R.id.res_repe);
        volver_s = findViewById(R.id.volver_strings);
        volver_menu = findViewById(R.id.volver_menu);


        volver_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), Activity_semi_strings.class);
                startActivity(m);
            }
        });
        volver_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(m);
            }
        });
        correr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), Activity_c_repet.class);
                startActivity(m);
            }
        });
        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), Activity_v_repet.class);
                startActivity(m);
            }
        });
        operar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String st="",res="",chr="";
                    st=entrada.getText().toString();
                    chr=entrada1.getText().toString();
                    res = contarCaracteres(st,chr)+"";
                    salida.setText("El caracter "+chr+" se repite "+res+" veces.");
                    salida.setFocusable(false);
                    salida.setClickable(false);
                }
                catch(Exception ex){

                }
            }
        });


    }
    public int contarCaracteres(String c, String ch) {
     //   String cadena=entrada1.getText().toString();
      //  String caracter1=entrada2.getText().toString();
        char caracter=ch.charAt(0);
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = c.indexOf(caracter);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = c.indexOf(caracter, posicion + 1);
        }
        return contador;
    }
}
