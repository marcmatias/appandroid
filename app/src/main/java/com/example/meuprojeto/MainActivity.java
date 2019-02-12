package com.example.meuprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button btnEnviar;
    private EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEnviar = findViewById(R.id.btnEnviar);
        edtNome = findViewById(R.id.edtNome);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                Log.v("MainActivity", "Clicando no Botão " + edtNome.getText());
             }
        }
        );
    }


//    public void chamarEvento(View view){
//        Log.v("MainActivity", "Clicando no Botão" + view.getId());
//    }
}
