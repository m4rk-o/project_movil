package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_c_fibonacci extends AppCompatActivity {
    Button btnResultado, btnVer_codigo;
    EditText et_der;
    TextView tv_Resultado_fibo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_fibonacci);
        btnResultado = findViewById(R.id.btnResultado_fibo);
        btnVer_codigo = findViewById(R.id.btn_ver_codigoFibo);
        et_der = findViewById(R.id.et_derFibo);
        tv_Resultado_fibo = findViewById(R.id.tv_Resultado_fibo);
        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int n1 = Integer.parseInt(et_der.getText().toString());
                    if(n1 <= 0 || n1 > 46){
                        Toast toast1 = Toast.makeText(getApplicationContext(),"El dígito debe ser positivo y menor a 47", Toast.LENGTH_SHORT);
                        toast1.show();
                    }
                    else {
                        String res = fibonacci(n1);
                        tv_Resultado_fibo.setText(res);
                    }
                }
                catch (Exception ex){

                }
            }
        });
        btnVer_codigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Activity_v_fibonacci.class);
                startActivity(i);
            }
        });
    }
    public String fibonacci(int x){
        String dato = "";
        int a = 1, b = 0, cont = 0, c = 0;
        while(cont < x){
            c = a + b;
            a = b;
            b = c;
            dato += c + ", ";
            cont++;
        }
        return dato;
    }
}
