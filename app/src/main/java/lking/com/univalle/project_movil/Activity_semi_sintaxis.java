package lking.com.univalle.project_movil;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_semi_sintaxis extends AppCompatActivity {

    Button HoMu,LeDa,Im,EnOfFi,Ar,DaPr;
    TextView HoMu1,LeDa1,Im1,EnOfFi1,Ar1,DaPr1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi_sintaxis);
        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);
        HoMu = findViewById(R.id.btn1);
        HoMu1 = findViewById(R.id.textView1);
        HoMu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_hola.class);
                String titulo = HoMu1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        LeDa = findViewById(R.id.btn2);
        LeDa1 = findViewById(R.id.textView3);
        LeDa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_leerDatos.class);
                String titulo = LeDa1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        Im = findViewById(R.id.btn3);
        Im1 = findViewById(R.id.textView5);
        Im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = Im1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        EnOfFi = findViewById(R.id.btn4);
        EnOfFi1 = findViewById(R.id.textView7);
        EnOfFi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_EOF.class);
                String titulo = EnOfFi1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        Ar = findViewById(R.id.btn5);
        Ar1 = findViewById(R.id.textView9);
        Ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_arreglos.class);
                String titulo = Ar1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        DaPr = findViewById(R.id.btn6);
        DaPr1 = findViewById(R.id.textView11);
        DaPr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_datos_primitivos.class);
                String titulo = DaPr1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
    }
}
