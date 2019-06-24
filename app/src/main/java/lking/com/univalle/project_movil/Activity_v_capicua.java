package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_v_capicua extends AppCompatActivity {
EditText cod_capi;
    Button ver, correr,volver_s,volver_menu;
    //cmm

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_capicua);
        cod_capi=findViewById(R.id.cod_capi);
        ver = findViewById(R.id.ver_capi);
        correr = findViewById(R.id.correr_capi);
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

        cod_capi.setText("Función para determinar si una cadena es un palíndromo:" +
                        "" +
                "//Función recursiva booleana. Devuelve true si es palindromo y false si no lo es. \n"+
                "public boolean capicua_cad(View v){\n" +
                "\n" +
                "boolean palindromo_cadena(String s){\n" +
                        "//si tiene un solo caracter devuelve verdadero (es palindromo)\n"+
                "    if(s.length() <= 1){\n" +
                "        return true;\n" +
                        "//sino, pregunta si el últmo caracter es igual al primero. \n"+
                        "//Va llamandose recursivamente hasa recorrer toda la cadena \n"+
                "    }else{\n" +
                "        if(s.charAt(0) == s.charAt(s.length() - 1)){\n" +
                "            return palindromo_cadena(s.substring(1,s.length() - 1 ) );\n" +
                        "//Si no fueran iguales, devuelve falso (no es palindromo) \n"+
                "        }else{\n" +
                "            return false;\n" +
                "        }\n" +
                "    }   \n" +
                "}");

        correr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), Activity_c_capicua.class);
                startActivity(m);
            }
        });
        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), Activity_v_capicua.class);
                startActivity(m);
            }
        });

    }
}
