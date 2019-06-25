package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_c_capicua extends AppCompatActivity {
    Button operar, ver;
    EditText entrada,salida;
    TextView capi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_capicua);

        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        setTitle(titulo);

        operar = findViewById(R.id.operar_capi);
        ver = findViewById(R.id.ver_capi);
        entrada = findViewById(R.id.et_capi);
        salida= findViewById(R.id.res_capi);
        capi=findViewById(R.id.capi);



        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), Activity_v_capicua.class);
                startActivity(m);
                finish();
            }
        });

        operar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String st="",res="";
                    st=entrada.getText().toString();
                    res = palindromo_cadena(st);
                    String p="";
                    //     if(res==st){capi.setText("Es palindromo");}
                    //   if(res!=st){capi.setText("No es palindromo");}
                    salida.setText(res);
                    salida.setFocusable(false);
                    salida.setClickable(false);
                }
                catch(Exception ex){

                }
            }
        });

    }
    public String palindromo_cadena(String s){
        int length = s.length();
        String reverse="", q="";
        for (int i = length - 1 ; i >= 0 ; i--){
            reverse = reverse + s.charAt(i);}
        return reverse;
    }
}
