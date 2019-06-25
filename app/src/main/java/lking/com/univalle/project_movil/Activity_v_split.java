package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_v_split extends AppCompatActivity {
    TextView cod_capi;
    Button volver_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_split);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        cod_capi=findViewById(R.id.cod_split);
        volver_menu = findViewById(R.id.ver_split);

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
        volver_menu = findViewById(R.id.volver_menu);
        volver_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(m);
            }
        });
    }
}
