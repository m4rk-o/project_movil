package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity__criba extends AppCompatActivity {
    Button volver_menu;
    TextView tv_cod_criba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__criba);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        tv_cod_criba = findViewById(R.id.tv_codigoCriba);
        volver_menu = findViewById(R.id.volver_menu);
        volver_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(m);
                finish();
            }
        });
        String cod = "//Creamos una funcion con paramatro int que retorne un String \n" +
                "public String Criba(int n){\n" +
                "        String dato = \"\";\n" +
                "        //Declaramos un arreglo con valor de indice igual al parametro menos uno  \n" +
                "        int[] numeros = new int[n-1];\n" +
                "        //Llenamos el arreglo con valores desde uno hasta el parametro menos uno \n" +
                "        for(int i=0; i<n-1; i++)\n" +
                "            numeros[i] = 0;\n" +
                "        //Encontramos la raiz cuandrada del parametro  de tipo entero \n" +
                "        int raiz_n = (int)Math.floor( Math.pow( n, 0.5) );\n" +
                "        //Recorremos los valores desde 2 hasta la raiz del parametro \n" +
                "        for(int i=2; i<=raiz_n; i++)\n" +
                "        {\n" +
                "            for(int j=i; j<=(int)(n/i); j++ )\n" +
                "                numeros[i*j - 2] = 1;\n" +
                "        }\n" +
                "        for(int i=0; i<n-1; i++)\n" +
                "        {\n" +
                "            if( numeros[i]==0 )\n" +
                "            {\n" +
                "                //Si el numero contiene divisores que no sean 1 y el mismo entonces ingresa a nuestro String dato \n" +
                "                dato = dato + (i + 2) + \", \";\n" +
                "            }\n" +
                "        }\n" +
                "        dato = dato.substring(0, dato.length()-2);\n" +
                "        //Retornamos la cadena resultante \n" +
                "        return dato;\n" +
                "    }";
        tv_cod_criba.setText(cod);
    }
}
