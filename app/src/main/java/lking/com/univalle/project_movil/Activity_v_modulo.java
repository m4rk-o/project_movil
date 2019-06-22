package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_v_modulo extends AppCompatActivity {
    EditText etcodmod;
    Button correr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_modulo);
        etcodmod = findViewById(R.id.etvermod);
        correr = findViewById(R.id.btncorrermod);
        correr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Activity_c_modulo.class);
                startActivity(i);
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
