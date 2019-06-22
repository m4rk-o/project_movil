package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_leerDatos extends AppCompatActivity {
    EditText buff;
    Button scanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leer_datos);
        buff = findViewById(R.id.etbuff);
        scanner = findViewById(R.id.btnscan);
        scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Activity_scanner.class);
                startActivity(i);
            }
        });
        String cod = "//Importamos librerias de buffered reader \n" +
                "import java.io.BufferedReader;\n" +
                "import java.io.InputStreamReader;\n" +
                "//declaramos un nuevo bufferedreader\n" +
                "BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));\n" +
                "//asignamos a una variable el siguiente dato a leer en este caso un entero\n" +
                "n = Integer.parseInt(reader.readLine());\n" +
                "Para cadenas no es necesario la conversión\n" +
                "cad = reader.readLine();\n" +
                "//Y con eso ya tenemos una variable a la que se le asigna un valor con bufferedreader";
        buff.setText(cod);
        buff.setFocusable(false);
        buff.setClickable(false);
    }
}
