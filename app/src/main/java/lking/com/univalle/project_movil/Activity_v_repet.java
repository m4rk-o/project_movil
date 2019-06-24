package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_v_repet extends AppCompatActivity {
    Button correr,ver,volver_s,volver_menu;
    EditText cod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_repet);
        cod=findViewById(R.id.cod_repe);
        correr=findViewById(R.id.correr_repe);
        ver=findViewById(R.id.ver_repe);
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
        cod.setText("Función para contar las repeticiones de un caracter en una cadena:\n" +
                "public int contarCaracteres(View v) {\n" +
                "\tString cadena=entrada1.getText().toString();\n" +
                "\tString caracter1=entrada2.getText().toString();\n" +
                "\tchar caracter=caracter1.charAt(0);\n" +
                "        int posicion, contador = 0;\n" +
                "        //se busca la primera vez que aparece\n" +
                "        posicion = cadena.indexOf(caracter);\n" +
                "        while (posicion != -1) { //mientras se encuentre el caracter\n" +
                "            contador++;           //se cuenta\n" +
                "            //se sigue buscando a partir de la posición siguiente a la encontrada\n" +
                "            posicion = cadena.indexOf(caracter, posicion + 1);\n" +
                "        }\n" +
                "        return contador;\n" +
                "   }");
        cod.setFocusable(false);
        cod.setClickable(false);
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


    }
}
