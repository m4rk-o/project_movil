package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_scanner extends AppCompatActivity {
    EditText scan;
    Button buff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
        scan = findViewById(R.id.etscan);
        buff = findViewById(R.id.btnbuff);
        buff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Activity_leerDatos.class);
                startActivity(i);
            }
        });
        String cod = "//Importamos la libreria de Scanner\n" +
                "import java.util.Scanner;\n" +
                "//declaramos un nuevo Scanner\n" +
                "Scanner s = new Scanner(System.in);\n" +
                "//asignamos el siguiente valor a leer a una variable en este caso de tipo entero\n" +
                "int a = s.nextInt();\n" +
                "//y ya sacamos un valor con Scanner";
        scan.setText(cod);
        scan.setFocusable(false);
        scan.setClickable(false);
    }
}
