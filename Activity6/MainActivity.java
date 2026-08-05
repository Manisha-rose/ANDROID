package com.example.activity6;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    EditText n1, n2;

    Button add, sub, mul, div;

    TextView t1, result;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(EditText)findViewById(R.id.editTextText6);
        n2=(EditText)findViewById(R.id.editTextText7);

        add = findViewById(R.id.button6);

        sub = findViewById(R.id.button2);

        mul = findViewById(R.id.button3);

        div = findViewById(R.id.button5);

        result = findViewById(R.id.textView2);
        t1 = findViewById(R.id.textView);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double f1 = Double.parseDouble(n1.getText().toString());
                Double f2 = Double.parseDouble(n2.getText().toString());
                double cal = f1 + f2;
                result.setText("Addition =" + cal);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double f1 = Double.parseDouble(n1.getText().toString());
                Double f2 = Double.parseDouble(n2.getText().toString());
                double cal = f1 - f2;
                result.setText("Subtraction =" + cal);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double f1 = Double.parseDouble(n1.getText().toString());
                Double f2 = Double.parseDouble(n2.getText().toString());
                double cal = f1 * f2;
                result.setText("Multiplication =" + cal);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double f1 = Double.parseDouble(n1.getText().toString());
                Double f2 = Double.parseDouble(n2.getText().toString());
                double cal = f1 / f2;
                result.setText("Division =" + cal);
            }
        });
    }
}
