package lking.com.univalle.project_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_c_split extends AppCompatActivity {
    Button operar,ver;
    EditText entrada,entrada1;
    TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_split);
        operar = findViewById(R.id.operar_split);
        ver = findViewById(R.id.ver_split);
        entrada = findViewById(R.id.et_split);
        entrada1 = findViewById(R.id.et_split1);
        salida= findViewById(R.id.res_split);

        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), Activity_v_split.class);
                startActivity(m);
                finish();
            }
        });
        //cm
        operar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String st="",res="",chr1="";
                    st=entrada.getText().toString();
                    chr1=entrada1.getText().toString();
                    res = dividir_cadena(st,chr1)+"";
                    salida.setText(res);
                    salida.setFocusable(false);
                    salida.setClickable(false);
                }
                catch(Exception ex){

                }
            }
        });
    }
    public String dividir_cadena(String cad, String chr)
    {
        String div="";
        String[] arrOfStr = cad.split(chr);

        for (String a : arrOfStr){
            div=div+a+" "; }
        return(div);
    }
}
