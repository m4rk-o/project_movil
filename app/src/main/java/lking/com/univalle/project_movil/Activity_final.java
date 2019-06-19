package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_final extends AppCompatActivity {

    Button correrMultiplos, verMultiplos, correrModulo, verModulo, correrExponenciales, verExponenciales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);
        if(titulo.equals("MULTIPLOS")){
            correrMultiplos = findViewById(R.id.btncorrer);
            correrMultiplos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent m = new Intent(getApplicationContext(), Activity_c_multiplos.class);
                    startActivity(m);
                }
            });
            verMultiplos = findViewById(R.id.btnver);
            verMultiplos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent m = new Intent(getApplicationContext(), Activity_v_multiplos.class);
                    startActivity(m);
                }
            });
        }
    }
}
