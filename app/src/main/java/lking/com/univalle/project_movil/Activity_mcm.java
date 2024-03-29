package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_mcm extends AppCompatActivity {
    Button volver_menu;
    TextView tv_codigo_mcm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcm);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        tv_codigo_mcm = findViewById(R.id.tv_codigomcm);
        volver_menu = findViewById(R.id.volver_menu);
        volver_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(m);
                finish();
            }
        });
        String cod = "//Creamos el método tipo String con dos parámetros \n" +
                "public String mcm(int num1, int num2) {\n" +
                "        int mcm = 0;\n" +
                "        //Encontramos el valor mínimo y máximo de ambos parámetros \n" +
                "        int a = Math.max(num1, num2);\n" +
                "        int b = Math.min(num1, num2);\n" +
                "        //Para hallar el mcm llamamos al método del MCD, que nos ayudará a encontrar el mínimo \n" +
                "        mcm = (a/mcd(a, b))*b;\n" +
                "        //Retornamos el valor resultante \n" +
                "        return String.valueOf(mcm);\n" +
                "    }\n" +
                "\n" +
                "    //Este método es el que llamamos que nos ayuda a encontrar el mcm \n" +
                "    public int mcd(int num1, int num2) {\n" +
                "        int mcd = 0;\n" +
                "        int a = Math.max(num1, num2);\n" +
                "        int b = Math.min(num1, num2);\n" +
                "        do {\n" +
                "            mcd = b;\n" +
                "            b = a%b;\n" +
                "            a = mcd;\n" +
                "        } while(b!=0);\n" +
                "        return mcd;\n" +
                "    }";
        tv_codigo_mcm.setText(cod);
    }
}
