package com.example.cw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText num1 = findViewById(R.id.FirstNumber);
        EditText num2 = findViewById(R.id.SecondeNumber);
        Button add = findViewById(R.id.Calculate);
        TextView result = findViewById(R.id.Total);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int FirstNumber = Integer.parseInt(num1.getText().toString());
                int SecondeNumber = Integer.parseInt(num2.getText().toString());
                int Total = FirstNumber + SecondeNumber ;
                result.setText(Total+"");
            }
        });
    }
}