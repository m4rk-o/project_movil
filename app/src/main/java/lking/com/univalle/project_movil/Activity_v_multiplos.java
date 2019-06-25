package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_v_multiplos extends AppCompatActivity {
    EditText etvermult;
    Button volver_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_multiplos);
        etvermult = findViewById(R.id.etcodmult);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        volver_menu = findViewById(R.id.volver_menu);
        volver_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(m);
            }
        });
        String cod = "//Generamos una funcion que reciba dos datos \n" +
                "public String multiplos(int a, int b){\n" +
                "//Declaramos una variable string con valor vacio \n" +
                "        String cad = \"\";\n" +
                "//Hacemos un ciclo for donde se inicia con el valor del primer numero dado y aumenta por el mismo numero para así tener solo numeros multiplos de este\n" +
                "        for(int i = a; i<=a*b; i+=a){\n" +
                "//Concatenamos el numero del ciclo en la cadena separandolo por comas \n" +
                "            cad += i + \", \";\n" +
                "        }\n" +
                "//Una vez terminado el ciclo retornamos la cadena en la que se encuentran todos los multiplos \n" +
                "        return cad;\n" +
                "    }";
        etvermult.setText(cod);
        etvermult.setFocusable(false);
        etvermult.setClickable(false);
    }
}
