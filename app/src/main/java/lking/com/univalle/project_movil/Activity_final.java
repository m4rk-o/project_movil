package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_final extends AppCompatActivity {

    Button correr, ver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);
        correr = findViewById(R.id.btncorrer);
        ver = findViewById(R.id.btnver);
        if(titulo.equals("MULTIPLOS")){
            correr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent m = new Intent(getApplicationContext(), Activity_c_multiplos.class);
                    startActivity(m);
                }
            });
            ver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent m = new Intent(getApplicationContext(), Activity_v_multiplos.class);
                    startActivity(m);
                }
            });
        }
        if(titulo.equals("MÓDULO")){
            correr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent m = new Intent(getApplicationContext(), Activity_c_modulo.class);
                    startActivity(m);
                }
            });
            ver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent m = new Intent(getApplicationContext(), Activity_v_modulo.class);
                    startActivity(m);
                }
            });
        }
    }
}
