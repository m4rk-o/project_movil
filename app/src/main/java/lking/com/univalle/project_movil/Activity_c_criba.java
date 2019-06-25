package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_c_criba extends AppCompatActivity {
    Button btn_ResCriba, btn_codigo_criba;
    EditText et_criba;
    TextView tv_res_criba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_criba);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        btn_ResCriba = findViewById(R.id.btnResultado_Criba);
        btn_codigo_criba = findViewById(R.id.btn_ver_codigoCriba);
        et_criba = findViewById(R.id.et_derCriba);
        tv_res_criba = findViewById(R.id.tv_Resultado_Criba);

        btn_codigo_criba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Activity__criba.class);
                String titulo = "Criba de Erastostenes";
                i.putExtra("titulo",titulo);
                i.putExtra("con","cad");
                startActivity(i);
                finish();
            }
        });
        btn_ResCriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int n1 =  Integer.parseInt(et_criba.getText().toString());
                    String res = Criba(n1);
                    tv_res_criba.setMovementMethod(new ScrollingMovementMethod());
                    tv_res_criba.setText(res);
                }
                catch (Exception ex){

                }
            }
        });
    }

    public String Criba(int n){
        String dato = "";
        int[] numeros = new int[n-1];
        for(int i=0; i<n-1; i++)
            numeros[i] = 0;
        int raiz_n = (int)Math.floor( Math.pow( n, 0.5) );
        for(int i=2; i<=raiz_n; i++)
        {
            for(int j=i; j<=(int)(n/i); j++ )
                numeros[i*j - 2] = 1;
        }
        for(int i=0; i<n-1; i++)
        {
            if( numeros[i]==0 )
            {
                //System.out.println( i+2 );
                dato = dato + (i + 2) + ", ";
            }
        }
        dato = dato.substring(0, dato.length()-2);
        return dato;
    }
}
