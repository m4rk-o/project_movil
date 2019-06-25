package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_EOF extends AppCompatActivity {
    TextView cod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__eof);
        cod = findViewById(R.id.cod_eof);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

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
