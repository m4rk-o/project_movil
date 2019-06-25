package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_mcd extends AppCompatActivity {
    Button volver_menu;
    TextView tv_codigo_MCD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcd);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        tv_codigo_MCD=findViewById(R.id.tv_codigoMCD);
        volver_menu = findViewById(R.id.volver_menu);
        volver_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(m);
                finish();
            }
        });
        String cod = "//Declaramos un método que aceptará dos parámetros \n" +
                "public String mcd1(int num1, int num2) {\n" +
                "        //Declaramos una variable mcd en la cual rescataremos el maximo comun divisor \n" +
                "        int mcd = 0;\n" +
                "        //a y b tendrá el máximo y mínimo valor de ambos valores respectivamente \n" +
                "        int a = Math.max(num1, num2);\n" +
                "        int b = Math.min(num1, num2);\n" +
                "        //Creamos un ciclo do while: mcd tomará el valor de b, hallaremos el resto de a entre b y a tendrá el valor de mcd \n" +
                "        do {\n" +
                "        //Asi encontraremos el MCD que es el número mas grande posible que permite dividir a dos o más números \n" +
                "            mcd = b;\n" +
                "            b = a%b;\n" +
                "            a = mcd;\n" +
                "        //El ciclo seguirá mientras b sea distinto a cero \n" +
                "        } while(b!=0);\n" +
                "        return String.valueOf(mcd);\n" +
                "    }";
        tv_codigo_MCD.setText(cod);
    }
}
