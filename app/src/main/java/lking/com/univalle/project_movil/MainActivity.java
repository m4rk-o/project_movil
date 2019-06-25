package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView num,cad,sin;
    TextView num1,cad1,sin1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.txt_center_layout);


        num = findViewById(R.id.btnnum);
        num1 = findViewById(R.id.textView1);
        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_semi.class);
                String titulo = num1.getText().toString();
                i.putExtra("titulo",titulo);
                i.putExtra("con","num");
                startActivity(i);
            }
        });
        cad = findViewById(R.id.btnstr);
        cad1 = findViewById(R.id.textView2);
        cad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_semi_strings.class);
                String titulo = cad1.getText().toString();
                i.putExtra("titulo",titulo);
                i.putExtra("con","cad");
                startActivity(i);
            }
        });
        sin = findViewById(R.id.btnsint);
        sin1 = findViewById(R.id.textView3);
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_semi_sintaxis.class);
                String titulo = sin1.getText().toString();
                i.putExtra("titulo",titulo);
                i.putExtra("con","sin");
                startActivity(i);
            }
        });

    }
}
