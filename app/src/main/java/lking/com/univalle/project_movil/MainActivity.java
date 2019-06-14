package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button num,cad,sin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = findViewById(R.id.btnnum);
        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_semi.class);
                String titulo = num.getText().toString();
                i.putExtra("titulo",titulo);
                i.putExtra("con","num");
                startActivity(i);
            }
        });
        cad = findViewById(R.id.btnstr);
        cad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_semi.class);
                String titulo = cad.getText().toString();
                i.putExtra("titulo",titulo);
                i.putExtra("con","cad");
                startActivity(i);
            }
        });
        sin = findViewById(R.id.btnsint);
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_semi.class);
                String titulo = sin.getText().toString();
                i.putExtra("titulo",titulo);
                i.putExtra("con","sin");
                startActivity(i);
            }
        });

    }
}
