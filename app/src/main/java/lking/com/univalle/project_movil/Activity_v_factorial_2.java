package lking.com.univalle.project_movil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_v_factorial_2 extends AppCompatActivity {
    Button volver;
    TextView casa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_factorial_2);
        volver = findViewById(R.id.btnVolver_casa);
        casa = findViewById(R.id.tv_casa);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        String cod = "//Generamos una funcion que reciba un dato \n" +
                "public String factorial(int x){\n" +
                "        //Declaramos una variable que almacenará el resultado \n" +
                "        int f = 1;\n" +
                "        //Realizamos un ciclo for, que comenzará en 1 hasta el valor de nuestro dato \n" +
                "        for (int i = 1; i <= x; i++){\n" +
                "            //Multiplicamos la variable 'f' por los distintos valores de i\n" +
                "            f = f* i;\n" +
                "        }\n" +
                "        //Retornamos la cadena resultante \n" +
                "        return String.valueOf(f);\n" +
                "    }";
        casa.setText(cod);
    }
}
