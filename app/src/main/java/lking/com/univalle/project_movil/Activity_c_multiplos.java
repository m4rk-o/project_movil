package lking.com.univalle.project_movil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_c_multiplos extends AppCompatActivity {
    Button operar;
    EditText etmult1, etmult2, etresmult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_multiplos);
        operar = findViewById(R.id.operarmult);
        etmult1 = findViewById(R.id.etMult1);
        etmult2 = findViewById(R.id.etMult2);
        etresmult = findViewById(R.id.etResMult);
        operar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int n1 = Integer.parseInt(etmult1.getText().toString());
                    int n2 = Integer.parseInt(etmult2.getText().toString());
                    String res = multiplos(n1, n2);
                    etresmult.setText(res);
                    etresmult.setFocusable(false);
                    etresmult.setClickable(false);
                }
                catch(Exception ex){

                }
            }
        });

    }
    public String multiplos(int a, int b){
        String cad = "";
        for(int i = a; i<=a*b; i+=a){
            cad += i + ", ";
        }
        return cad;
    }
}
