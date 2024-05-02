package com.example.sumadoscombinatorios;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText cajaC1numero1, cajaC1numero2, cajaC2numero1, cajaC2numero2;
    Button btnCalculate;
    TextView etiResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cajaC1numero1 = findViewById(R.id.cajaC1numero1);
        cajaC1numero2 = findViewById(R.id.cajaC1numero2);
        cajaC2numero1 = findViewById(R.id.cajaC2numero1);
        cajaC2numero2 = findViewById(R.id.cajaC2numero2);
        btnCalculate = findViewById(R.id.btnCalculate);
        etiResultado = findViewById(R.id.etiResultado);

    btnCalculate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            calculateSum();
        }
    });

    }

    private void calculateSum() {
        int n1 = Integer.parseInt(cajaC1numero1.getText().toString());
        int r1 = Integer.parseInt(cajaC1numero2.getText().toString());
        int n2 = Integer.parseInt(cajaC2numero1.getText().toString());
        int r2 = Integer.parseInt(cajaC2numero2.getText().toString());

        int result = combinatorial(n1, r1) + combinatorial(n2, r2);
        etiResultado.setText("Resultado: " + result);
    }

    private int combinatorial(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        } else {
            return combinatorial(n - 1, r - 1) + combinatorial(n - 1, r);
        }
    }

}