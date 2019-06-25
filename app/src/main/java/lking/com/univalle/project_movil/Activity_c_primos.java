package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_c_primos extends AppCompatActivity {
    Button btnResultado_Primo, btn_ver_codigoPrimo;
    EditText etIzq_primo, etDer_primo;
    TextView tvRes_primo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_primos);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        btnResultado_Primo = findViewById(R.id.btnResultado_Primo);
        btn_ver_codigoPrimo = findViewById(R.id.btn_ver_codigoPrimo);
        etIzq_primo = findViewById(R.id.et_izqPrimo);
        etDer_primo = findViewById(R.id.et_derPrimo);
        tvRes_primo = findViewById(R.id.tv_Resultado_Primo);
        btnResultado_Primo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int n1 = Integer.parseInt(etIzq_primo.getText().toString());
                    int n2 = Integer.parseInt(etDer_primo.getText().toString());
                    if (n1 >= n2){
                        Toast.makeText(getApplicationContext(),"El primer dígito debe ser menor al segundo", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        String res = primos(n1, n2);
                        tvRes_primo.setText(res);
                    }
                }
                catch (Exception ex){

                }
            }
        });
        btn_ver_codigoPrimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Activity_v_primos.class);
                String titulo = "Numeros Primos";
                i.putExtra("titulo",titulo);
                i.putExtra("con","cad");
                startActivity(i);
                finish();
            }
        });
    }

    public String primos(int a, int b){
        int i, j, cont;
        String res = "";
        for (i = a; i <= b; i++){
            cont = 0;
            for (j = 1; j <= i; j++){
                if(i % j == 0){
                    cont++;
                }
            }
            if (cont == 2){
                res += i + ", ";
            }
        }
        res = res.substring(0, res.length()-2);
        return  res;
    }
}
