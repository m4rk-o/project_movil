package lking.com.univalle.project_movil;

import android.content.Intent;
//AppCompatActivity
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_semi extends AppCompatActivity {
    Button fib,pri,fac,mul,mod,ex,cri,mcd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi);
        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);
        fib = findViewById(R.id.btnFib);
        fib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = fib.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        pri = findViewById(R.id.btnPrimos);
        pri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = pri.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        fac = findViewById(R.id.btnFac);
        fac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = fac.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        mul = findViewById(R.id.btnMul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_multiplos.class);
                String titulo = mul.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        mod = findViewById(R.id.btnMod);
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_modulo.class);
                String titulo = mod.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        ex = findViewById(R.id.btnExp);
        ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_elevar.class);
                String titulo = ex.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        cri = findViewById(R.id.btnCri);
        cri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = cri.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        mcd = findViewById(R.id.btnMcd);
        mcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = mcd.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });



    }
}
