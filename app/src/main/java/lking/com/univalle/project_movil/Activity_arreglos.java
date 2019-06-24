package lking.com.univalle.project_movil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_arreglos extends AppCompatActivity {
    TextView arreglo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arreglos);
        arreglo = findViewById(R.id.tv_arreglos);
        String Cod = "//ARREGLO UNIDIMESIONAL \n" +
                "int array1[]; //declaracion arreglo de tipo numerico (el tipo puede ser distinto, ej. byte, String char etc.)\n" +
                "array1 = new int[3]; //tamaño del arreglo es 3 elementos\n" +
                "//asignacion de valores a elementos del arreglo;\n" +
                "array[0] =2;\n" +
                "array[1] = 10;\n" +
                "arra[2] = 7;\n" +
                "System.out.println(\"El valor de la posicion 1 en el arreglo es\" + array[0]);\n\n" +
                "//ARREGLO BIDIMESIONAL \n" +
                "//Al igual que los arreglos unidimensionales, las dimensiones de una matriz deben:\n" +
                "//Ser un valor entero.\n" +
                "//Pueden expresarse como constantes numéricas (10, 100, 1000, etc)\n" +
                "arreglo = new int[10][5];\n" +
                "Ahora podemos asignarle valores indicando los índices del arreglo\n" +
                "arreglo[3][2] = 9\n" +
                "//Para poder acceder a todos los elementos de una matriz podemos realizar un for anidado\n" +
                "for(int i = 0; i < 10; i++){ \n" +
                "   for(int j = 0; j < 5; j++){ \n" +
                "       System.Out.print(arreglo[i][j]); \n" +
                "   }\n" +
                "   System.Out.println(); \n" +
                "} \n";
        arreglo.setText(Cod);
    }
}
