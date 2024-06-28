package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class divt extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton p1,p2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_divt);
        ed1=(EditText)findViewById(R.id.anum1);
        ed2=(EditText)findViewById(R.id.anum2);
        p1=(AppCompatButton)findViewById(R.id.cal1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getNum1=ed1.getText().toString();
                String getNum2=ed2.getText().toString();
                int num1=Integer.parseInt(getNum1);
                int num2=Integer.parseInt(getNum2);
                if(!getNum1.equals("") && !getNum2.equals(""))
                {
                    try
                    {
                        int num3 = num1 / num2;
                        String getcalc = Integer.toString(num3);
                        Toast.makeText(getApplicationContext(), "RESULT=" + getcalc, Toast.LENGTH_LONG).show();
                    } catch (ArithmeticException e)
                    {
                        Toast.makeText(getApplicationContext(), "DIVISION NOT POSSIBLE", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "NO VALUE IS INSERTED", Toast.LENGTH_LONG).show();
                }

            }
        });
        p2=(AppCompatButton)findViewById(R.id.back1);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}