package com.example.mycalculator;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity{
    EditText etFirstValue,etSecondValue;
    TextView tvAns;
    Button add,subtract,multiple,divide;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondVlue);
        tvAns= findViewById(R.id.tvAns);
         add = findViewById(R.id.btnAdd);
         subtract = findViewById(R.id.btnSubtract);
         multiple = findViewById(R.id.btnMultiply);
         divide = findViewById(R.id.btnDivide);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());

                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue+secondValue;
                tvAns.setText("Ans is = "+ans);



            }
        });






        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());

                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue-secondValue;
                tvAns.setText("Ans is = "+ans);

            }
        });






        multiple.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int firstValue,secondValue,ans;
               firstValue=Integer.parseInt(etFirstValue.getText().toString());

               secondValue=Integer.parseInt(etSecondValue.getText().toString());
               ans=firstValue*secondValue;
               tvAns.setText("Ans is = "+ans);

           }


        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());

                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue/secondValue;
                tvAns.setText("Ans is = "+ans);

            }
        });

    }


}






