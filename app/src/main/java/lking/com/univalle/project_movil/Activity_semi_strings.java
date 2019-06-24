package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_semi_strings extends AppCompatActivity {

    Button Cap,ConCa,BuReCa,BuCaDi;
    TextView Cap1,ConCa1,BuReCa1,BuCaDi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi_strings);
        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);
        Cap = findViewById(R.id.btn1);
        Cap1 = findViewById(R.id.textView1);
        Cap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_capicua.class);
                String titulo = Cap1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        ConCa = findViewById(R.id.btn2);
        ConCa1 = findViewById(R.id.textView3);
        ConCa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = ConCa1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        BuReCa = findViewById(R.id.btn3);
        BuReCa1 = findViewById(R.id.textView5);
        BuReCa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_repet.class);
                String titulo = BuReCa1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
        BuCaDi = findViewById(R.id.btn4);
        BuCaDi1 = findViewById(R.id.textView7);
        BuCaDi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_c_split.class);
                String titulo = BuCaDi1.getText().toString();
                i.putExtra("titulo",titulo);
                startActivity(i);
            }
        });
    }
}
