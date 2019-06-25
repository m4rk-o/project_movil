package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_v_primos extends AppCompatActivity {
    TextView tv_codigoPrimo;
    Button volver_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_primos);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        tv_codigoPrimo = findViewById(R.id.tv_codigoPrimo);
        volver_menu = findViewById(R.id.volver_menu);
        volver_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(m);
                finish();
            }
        });
        String cod = "//Generamos una funcion que reciba dos datos \n" +
                "public String primos(int a, int b){\n" +
                "//Declaramos variables auxiliares \n" +
                "        int i, j, cont;\n" +
                "        String res = \"\";\n" +
                "//Realizamos un ciclo for que recorrerá el rango de los valores dados \n" +
                "        for (i = a; i <= b; i++){\n" +
                "            cont = 0;\n" +
                "            //Este for anidado nos servirá para saber cuantos divisores tiene un dígito \n" +
                "            for (j = 1; j <= i; j++){\n" +
                "                if(i % j == 0){\n" +
                "                    cont++;\n" +
                "                }\n" +
                "            }\n" +
                "            //Si el valor recorrido cuenta con solo dos divisores es primo, entonces lo rescatamos \n" +
                "            if (cont == 2){\n" +
                "                res += i + \", \";\n" +
                "            }\n" +
                "        }\n" +
                "        res = res.substring(0, res.length()-2);\n" +
                "       //Retornamos la cadena resultante \n" +
                "        return  res;\n" +
                "    }";
        tv_codigoPrimo.setText(cod);
    }
}
