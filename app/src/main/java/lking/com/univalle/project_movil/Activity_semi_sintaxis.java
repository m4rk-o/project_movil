package lking.com.univalle.project_movil;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_semi_sintaxis extends AppCompatActivity {

    Button HoMu,LeDa,Im,EnOfFi,Ar,DaPr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi_sintaxis);
        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);
        HoMu = findViewById(R.id.btn1);
        HoMu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = HoMu.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        LeDa = findViewById(R.id.btn2);
        LeDa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = LeDa.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        Im = findViewById(R.id.btn3);
        Im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = Im.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        EnOfFi = findViewById(R.id.btn4);
        EnOfFi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = EnOfFi.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        Ar = findViewById(R.id.btn5);
        Ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = Ar.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        DaPr = findViewById(R.id.btn6);
        DaPr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = DaPr.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
    }
}
