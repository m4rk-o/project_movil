package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Activity_datos_primitivos extends AppCompatActivity {
    EditText datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_primitivos);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        datos = findViewById(R.id.etdatos);
        String cod = "Java tiene 8 tipos de datos primitivos los cuales son:\n" +
                "byte: Representa un tipo de dato de 8 bits con signo. De tal manera que puede almacenar los valores numéricos de -128 a 127\n" +
                "short: Representa un tipo de dato de 16 bits con signo. De esta manera almacena valores numéricos de -32.768 a 32.767.\n" +
                "int: Es un tipo de dato de 32 bits con signo para almacenar valores numéricos. almacena hasta 2,147,483,647.\n" +
                "long: Es un tipo de dato de 64 bits con signo que almacena hasta 9,223,372,036,854,775,807L.\n" +
                "float: Es un tipo dato para almacenar números en coma flotante con precisión simple de 32 bits. almacena hasta 3.4028235E38\n" +
                "Double: Es un tipo de dato para almacenar números en coma flotante con doble precisión de 64 bits. almacena hasta 1.7976931348623157E308\n" +
                "boolean: Sirve para definir tipos de datos booleanos. Es decir, aquellos que tienen un valor de true o false. Ocupa 1 bit de información.\n" +
                "char: Es un tipo de datos que representa a un carácter Unicode sencillo de 16 bits.";
        datos.setText(cod);
        datos.setClickable(false);
        datos.setFocusable(false);
    }
}
