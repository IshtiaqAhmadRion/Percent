package com.toumal.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText amount,percent;
    TextView textView;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = findViewById(R.id.edit_amount_id);
        percent = findViewById(R.id.edit_percent_id);
        submit = findViewById(R.id.submit_btn);
        textView = findViewById(R.id.text_view_id);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price = Integer.parseInt(amount.getText().toString());
                int p = Integer.parseInt(percent.getText().toString());
                int value = price*p/100;
                textView.setVisibility(View.VISIBLE);

                textView.setText("Amount: "+String.valueOf(value));
            }
        });




    }
}
