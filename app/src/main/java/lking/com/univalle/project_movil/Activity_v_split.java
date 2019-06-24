package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_v_split extends AppCompatActivity {
    EditText cod_capi;
    Button ver, correr,volver_s,volver_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_split);
        cod_capi=findViewById(R.id.cod_split);
        ver = findViewById(R.id.ver_split);
        correr = findViewById(R.id.correr_split);
        //cmm
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

        cod_capi.setText("//Función para dividir una cadena por un caracter:\n" +
                " public String dividir_cadena(String cad, String chr)\n" +
                "    {\n" +
                "        String div=\"\";\n" +
                "// se crea el array arrOfStr de manera que en cada posisicon guarde las palabras separadas por el caracter chr\n" +
                "        String[] arrOfStr = cad.split(chr);\n" +
                "\n" +
                "//recorremos cada elemento del array y lo almacenamos en la cadena div\n" +
                "        for (String a : arrOfStr){\n" +
                "            div=div+a+\" \"; }\n" +
                "//devolvemos la cadena div que contiene la cadena recortada\n" +
                "        return(div);}");
        correr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), Activity_c_split.class);
                startActivity(m);
            }
        });
        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), Activity_v_split.class);
                startActivity(m);
            }
        });

    }
}
