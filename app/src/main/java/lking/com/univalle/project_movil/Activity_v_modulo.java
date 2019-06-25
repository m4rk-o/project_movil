package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_v_modulo extends AppCompatActivity {
    EditText etcodmod;
    Button volver_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_modulo);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        etcodmod = findViewById(R.id.etvermod);
        volver_menu = findViewById(R.id.volver_menu);
        volver_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(m);
            }
        });
        String cod = "//Generamos una función recursiva \n" +
                "public static int mod(int a, int b) {\n" +
                "//Se termina si a es menor que b \n" +
                "        if (a < b) {\n" +
                "            return a;\n" +
                "//Se le resta b en la recursividad \n" +
                "        } else {\n" +
                "            return mod(a - b, b);\n" +
                "        }\n" +
                "    }";
        etcodmod.setText(cod);
        etcodmod.setClickable(false);
        etcodmod.setFocusable(false);
    }
}
