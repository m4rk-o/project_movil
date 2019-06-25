package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_v_fibonacci extends AppCompatActivity {
    TextView tv_codigoFibo;
    Button volver_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_fibonacci);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        tv_codigoFibo = findViewById(R.id.tv_codigoFibo);
        String cod = "//Generamos una funcion que reciba un dato \n" +
                "public String fibonacci(int x){\n" +
                "//Declaramos una variable string con valor vacio \n" +
                "        String dato = \"\";\n" +
                "//Declaramos 4 variables, y realizamos un ciclo while en donde c es igual a un dígito de la serie, luego a toma el valor del segundo valor y b el valor del dígito de la serie \n" +
                "        int a = 1, b = 0, cont = 0, c = 0;\n" +
                "        while(cont < x){\n" +
                "            c = a + b;\n" +
                "            a = b;\n" +
                "            b = c;\n" +
                "//Concatenamos el numero del ciclo en la cadena separandolo por comas \n" +
                "            dato += c + \", \";\n" +
                "//Incrementamos el valor del contador en 1\n" +
                "            cont++;" +
                "        }\n" +
                "//Una vez terminado el ciclo retornamos la cadena en la que se encuentran los valores de la serie\n" +
                "        return dato;\n" +
                "    }";
        tv_codigoFibo.setText(cod);
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
