package lking.com.univalle.project_movil;

import android.content.Intent;
//AppCompatActivity
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity_semi extends AppCompatActivity {
    Button fib,pri,fac,mul,mod,ex,cri,mcd;
    TextView fib1,pri1,fac1,mul1,mod1,ex1,cri1,mcd1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi);
        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);
        fib = findViewById(R.id.btnFib);
        fib1 = findViewById(R.id.textView1);
        fib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_fibonacci.class);
                String titulo = fib1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        pri = findViewById(R.id.btnPrimos);
        pri1 = findViewById(R.id.textView3);
        pri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_primos.class);
                String titulo = pri1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        fac = findViewById(R.id.btnFac);
        fac1 = findViewById(R.id.textView5);
        fac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_factorial.class);
                String titulo = fac1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        mul = findViewById(R.id.btnMul);
        mul1 = findViewById(R.id.textView7);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_multiplos.class);
                String titulo = mul1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        mod = findViewById(R.id.btnMod);
        mod1 = findViewById(R.id.textView9);
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_modulo.class);
                String titulo = mod1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        ex = findViewById(R.id.btnExp);
        ex1 = findViewById(R.id.textView11);
        ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_elevar.class);
                String titulo = ex1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        cri = findViewById(R.id.btnCri);
        cri1 = findViewById(R.id.textView13);
        cri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_criba.class);
                String titulo = cri1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        mcd = findViewById(R.id.btnMcd);
        mcd1 = findViewById(R.id.textView15);
        mcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_mcm_MCD.class);
                String titulo = mcd1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });



    }
}
