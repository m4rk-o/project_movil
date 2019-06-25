package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_v_repet extends AppCompatActivity {
    Button volver_menu;
    TextView cod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_repet);

        setTitle("Buscar repeticon de un caracter");

        cod=findViewById(R.id.cod_repe);
        volver_menu = findViewById(R.id.volver_menu);


        volver_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(m);
                finish();
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


    }
}
