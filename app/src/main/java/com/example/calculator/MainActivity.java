package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView resultTV;
    EditText firstET, secondET;
    Button plusButton, minusButton, mulButton, divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTV = findViewById(R.id.calc_display_result);

        firstET = findViewById(R.id.calc_first_number);
        secondET = findViewById(R.id.calc_second_number);

        plusButton = findViewById(R.id.calc_plus_button);
        minusButton = findViewById(R.id.calc_minus_button);
        mulButton = findViewById(R.id.calc_mul_button);
        divideButton = findViewById(R.id.calc_divide_button);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumber = Integer.parseInt(firstET.getText().toString());
                int secondNumber = Integer.parseInt(secondET.getText().toString());

                int result = firstNumber + secondNumber;

                resultTV.setText("The Result is: " + result);

                Toast.makeText(getApplicationContext(),
                        "Result is: " + result,
                        Toast.LENGTH_SHORT).show();
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumber = Integer.parseInt(firstET.getText().toString());
                int secondNumber = Integer.parseInt(secondET.getText().toString());

                int result = firstNumber - secondNumber;

                resultTV.setText("The Result is: " + result);

                Toast.makeText(getApplicationContext(),
                        "Result is: " + result,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumber = Integer.parseInt(firstET.getText().toString());
                int secondNumber = Integer.parseInt(secondET.getText().toString());

                int result = firstNumber * secondNumber;

                resultTV.setText("The Result is: " + result);

                Toast.makeText(getApplicationContext(),
                        "Result is: " + result,
                        Toast.LENGTH_SHORT).show();
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumber = Integer.parseInt(firstET.getText().toString());
                int secondNumber = Integer.parseInt(secondET.getText().toString());

                int result = firstNumber / secondNumber;

                resultTV.setText("The Result is: " + result);

                Toast.makeText(getApplicationContext(),
                        "Result is: " + result,
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}
