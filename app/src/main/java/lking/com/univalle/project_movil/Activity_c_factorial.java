package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_c_factorial extends AppCompatActivity {
    Button btn_ver_codigoFactorial, btnResultado_Fact;
    EditText et_derFact;
    TextView tv_Resultado_Fact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_factorial);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        btn_ver_codigoFactorial = findViewById(R.id.btn_ver_codigoFactorial);
        btnResultado_Fact = findViewById(R.id.btnResultado_Fact);
        et_derFact = findViewById(R.id.et_derFact);
        tv_Resultado_Fact = findViewById(R.id.tv_Resultado_Fact);
        btnResultado_Fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int n1 = Integer.parseInt(et_derFact.getText().toString());
                    if (n1 > 31){
                        Toast.makeText(getApplicationContext(),"El dígito debe ser menor a 32, averígua por que :)", Toast.LENGTH_LONG).show();
                    }
                    else{
                        String res = factorial(n1);
                        tv_Resultado_Fact.setText(res);
                    }
                }
                catch (Exception ex){

                }
            }
        });
        btn_ver_codigoFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Activity_v_factorial_2.class);
                String titulo = "Factorial";
                i.putExtra("titulo",titulo);
                i.putExtra("con","cad");
                startActivity(i);
            }
        });
    }
    public String factorial(int x){
        int f = 1;
        for (int i = 1; i <= x; i++){
            f = f* i;
        }
        return String.valueOf(f);
    }
}
