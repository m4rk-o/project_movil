package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_c_hola extends AppCompatActivity {
    TextView tv_hola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_hola);
        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);
        tv_hola = findViewById(R.id.tv_hola);
        String cod =  "//Crearemos una aplicacion .java con el nombre HolaMundo\n" +
                "public class HolaMundo {\n" +
                "    public static void main(String[] args) {\n" +
                "        //Declaramos la siguiente linea de código, donde usamos la clase System.Out con su método print  " +
                "        System.out.print('Hola Mundo!');" +
                "        //La anterior línea nos mostrará un mensaje con 'Hola Mundo!'  " +
                "    }\n" +
                "}";
        tv_hola.setText(cod);
    }
}
