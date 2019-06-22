package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_c_elevar extends AppCompatActivity {
    EditText etelev1, etelev2, etreselev;
    Button btnreselev, verelev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_elevar);
        etelev1 = findViewById(R.id.etelev1);
        etelev2 = findViewById(R.id.etelev2);
        etreselev = findViewById(R.id.etreselev);
        btnreselev = findViewById(R.id.btnreselev);
        verelev = findViewById(R.id.btnverelevar);
        btnreselev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int n1 = Integer.parseInt(etelev1.getText().toString());
                    int n2 = Integer.parseInt(etelev2.getText().toString());
                    String res = String.valueOf(elevar(n1, n2));
                    etreselev.setText(res);
                    etreselev.setClickable(false);
                    etreselev.setFocusable(false);
                }
                catch (Exception ex){

                }
            }
        });
        verelev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Activity_v_elevar.class);
                startActivity(i);
            }
        });
    }
    public int elevar(int a, int b) {
        if (b == 0)
            return 1;
        else {
            return a * (elevar(a, b - 1));
        }
    }

    }
