package lking.com.univalle.project_movil;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_v_elevar extends AppCompatActivity {
    EditText etcodelev;
    Button volver_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_elevar);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        etcodelev = findViewById(R.id.etcodelev);
        volver_menu = findViewById(R.id.volver_menu);
        volver_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(m);
            }
        });
        String cod = "//Creamos una funcion recursiva \n" +
                "public int elevar(int a, int b) {\n" +
                "//Si b iguala cero se termina la función \n" +
                "        if (b == 0)\n" +
                "            return 1;\n" +
                "Si no se multiplica el primer numero por la funcion recursiva \n" +
                "        else {\n" +
                "            return a * (elevar(a, b - 1));\n" +
                "        }\n" +
                "    }";
        etcodelev.setText(cod);
        etcodelev.setClickable(false);
        etcodelev.setFocusable(false);
    }
}
