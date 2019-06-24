package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_semi_strings extends AppCompatActivity {

    Button Cap,ConCa,BuReCa,BuCaDi;
    Button correr_capi, ver_capi;
//cm
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi_strings);
        correr_capi=findViewById(R.id.correr_capi);
        ver_capi=findViewById(R.id.ver_capi);
        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);
        Cap = findViewById(R.id.btn1);
        Cap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_capicua.class);
                String titulo = Cap.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        ConCa = findViewById(R.id.btn2);
        ConCa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = ConCa.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        BuReCa = findViewById(R.id.btn3);
        BuReCa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_repet.class);
                String titulo = BuReCa.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        BuCaDi = findViewById(R.id.btn4);
        BuCaDi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_split.class);
                String titulo = BuCaDi.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });

    }
}
