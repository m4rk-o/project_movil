package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_c_mcm_MCD extends AppCompatActivity {
    Button btn_codigo_mcm, btn_codigo_MCD, btn_res_mcm, btn_res_MCD;
    EditText et_izq_mcm, et_der_mcm, et_izq_MCD, et_der_MCD;
    TextView tv_res_mcm, tv_res_MCD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_mcm__mcd);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        btn_codigo_mcm = findViewById(R.id.btn_ver_codigomcm);
        btn_codigo_MCD = findViewById(R.id.btn_ver_codigoMCD);
        btn_res_mcm = findViewById(R.id.btnResultado_mcm);
        btn_res_MCD = findViewById(R.id.btnResultado_MCD);
        et_izq_mcm = findViewById(R.id.et_izqmcm);
        et_der_mcm = findViewById(R.id.et_dermcm);
        et_izq_MCD = findViewById(R.id.et_izqMCD);
        et_der_MCD = findViewById(R.id.et_derMCD);
        tv_res_mcm = findViewById(R.id.tv_Resultado_mcm);
        tv_res_MCD = findViewById(R.id.tv_Resultado_MCD);
        btn_codigo_mcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Activity_mcm.class);
                String titulo = "Maximo Comun Multiplo";
                i.putExtra("titulo",titulo);
                i.putExtra("con","cad");
                startActivity(i);
                finish();
            }
        });
        btn_codigo_MCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(), Activity_mcd.class);
                String titulo = "Maximo Comun Divisor";
                j.putExtra("titulo",titulo);
                j.putExtra("con","cad");
                startActivity(j);
                finish();
            }
        });

        btn_res_mcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int n1 = Integer.parseInt(et_izq_mcm.getText().toString());
                    int n2 = Integer.parseInt(et_der_mcm.getText().toString());
                    String res_mcm = mcm(n1, n2);
                    tv_res_mcm.setText(res_mcm);
                }
                catch (Exception ex){

                }
            }
        });
        btn_res_MCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int m1 = Integer.parseInt(et_izq_MCD.getText().toString());
                    int m2 = Integer.parseInt(et_der_MCD.getText().toString());
                    String res_MCD = mcd1(m1, m2);
                    tv_res_MCD.setText(res_MCD);
                }
                catch (Exception ex){

                }
            }
        });
    }

    public String mcm(int num1, int num2) {
        int mcm = 0;
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        mcm = (a/mcd(a, b))*b;
        return String.valueOf(mcm);
    }
    public int mcd(int num1, int num2) {
        int mcd = 0;
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        do {
            mcd = b;
            b = a%b;
            a = mcd;
        } while(b!=0);
        return mcd;
    }
    public String mcd1(int num1, int num2) {
        int mcd = 0;
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        do {
            mcd = b;
            b = a%b;
            a = mcd;
        } while(b!=0);
        return String.valueOf(mcd);
    }
}
