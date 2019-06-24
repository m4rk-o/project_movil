package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_EOF extends AppCompatActivity {
    Button volver_s,volver_menu;
    EditText cod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__eof);
        cod = findViewById(R.id.cod_eof);
        volver_s = findViewById(R.id.volver_sintaxis);
        volver_menu = findViewById(R.id.volver_menu);


        volver_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), Activity_semi_sintaxis.class);
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

        cod.setText("Los problemas de programación muchas veces requieren que el programa funcione por tiempo indefinido hasta que se llegue al fin del archivo (EOF)."
                + "\n" +
                "En otras palabras, se pide que el programa se ejecute hasta que dejen de haber datos de entrada (se llega al fin del archivo) "
                + "\n" +
                "\n" +
                "1. Leyendo datos con Scanner:"
                + "\n" +
                "\n" +
                "Scanner s = new Scanner(System.in);\n" +
                "\n" +
                "while(s.hasNext())\n" +
                "{\n" +
                "//Código...\n" +"\n" +"\n" +
                "2. Leyendo datos con Buffered Reader:"+
                "\n" +"\n" +
                " BufferedReader br = new BufferedReader(new InputStreamReader(System.in));"+
                "\n" +
                "String line;\n" +
                "\n" +
                "while ((line = br.readLine()) != null) {\n" +
                "   //Código...\n" +
                "}"+
                "}"

        );
        cod.setFocusable(false);
        cod.setClickable(false);
    }
}
