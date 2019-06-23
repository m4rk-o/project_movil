package lking.com.univalle.project_movil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_c_modulo extends AppCompatActivity {
    EditText etmod1, etmod2, etResmod;
    Button btnResmod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_modulo);
        etmod1 = findViewById(R.id.etmod1);
        etmod2 = findViewById(R.id.etmod2);
        etResmod = findViewById(R.id.etresmod);
        btnResmod = findViewById(R.id.btnresmod);
        btnResmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int n1 = Integer.parseInt(etmod1.getText().toString());
                    int n2 = Integer.parseInt(etmod2.getText().toString());
                    String res = (String.valueOf(mod(n1, n2)));
                    etResmod.setText(res);
                    etResmod.setFocusable(false);
                    etResmod.setClickable(false);
                }
                catch (Exception ex){

                }
            }
        });
    }
    public static int mod(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return mod(a - b, b);
        }
    }
}
