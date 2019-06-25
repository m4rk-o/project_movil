package lking.com.univalle.project_movil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_imprimir_datos extends AppCompatActivity {
    TextView tv_imprimir_datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imprimir_datos);
        tv_imprimir_datos.findViewById(R.id.tv_imprimir);
        String cod = "//El objeto System.out es del tipo java.io.PrintStream y, por ello, dispone de métodos para escribir con formato en el flujo de salida, usualmente el monitor. \n" +
                "//la sentencia para imprimir por pantalla y dar dos salto de línea, el salto de línea propio del método y el indicado por '\\n', es: \n" +
                "System.out.println(\"Esto sale en pantalla\\n\"); \n" +
                "//Lo siguiente imprime el texto por pantalla con un único salto de línea: \n" +
                "System.out.println(\"caracteres\"); \n" +
                "//También podemos concatenar objetos de tipo String antes y luego imprimirlos, por ejemplo: \n" +
                "String valor = \"Este es el mensaje: \";\n" +
                "System.out.println(valor+ \" Hola\"); \n" +
                "// El mensaje sería: Este es el mensaje: Hola \n" +
                "//Cuando un objeto se concatena con una cadena o se imprime por pantalla, para su representación se hace una llamada implícita a la implementación que haga de su método toString.\n" +
                "\n ";

        tv_imprimir_datos.setText(cod);
    }
}
