package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_final_strings extends AppCompatActivity {
    Button correr, ver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_strings);
        correr=findViewById(R.id.button2c);
        ver=findViewById(R.id.button3v);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);
        if(titulo.equals("CAPICUA")){
            Intent m = new Intent(getApplicationContext(), Activity_c_capicua.class);
            startActivity(m);
            correr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent m = new Intent(getApplicationContext(), Activity_c_capicua.class);
                    startActivity(m);
                }
            });
            ver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent m = new Intent(getApplicationContext(), Activity_v_capicua.class);
                    startActivity(m);
                }
            });
        }

        if(titulo.equals("BUSCAR REPETICION DE UN CARACTER")){
            Intent m = new Intent(getApplicationContext(), Activity_c_repet.class);
            startActivity(m);
            correr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent m = new Intent(getApplicationContext(), Activity_c_repet.class);
                    startActivity(m);
                }
            });
            ver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent m = new Intent(getApplicationContext(), Activity_v_repet.class);
                    startActivity(m);
                }
            });
        }
    }
}
