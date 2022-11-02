package com.bsi.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtWidht, edtHeight, edtLenght;
    private Button btnCalculate;
    private TextView tvResult;
    private static final String STATE_HASIL = "State Hasil";

    @Override
    protected  void onSaveInstanceState(Bundle outState){
        outState.putString(STATE_HASIL,tvResult.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtWidht = findViewById(R.id.edit_widht);
        edtLenght = findViewById(R.id.edit_lenght);
        edtHeight = findViewById(R.id.edit_height);
        btnCalculate = findViewById(R.id.button_calculate);
        tvResult = findViewById(R.id.tv_result);
        btnCalculate.setOnClickListener(this);
        if (savedInstanceState !=null){
            String hasil = savedInstanceState.getString(STATE_HASIL);
            tvResult.setText(hasil);
        }
    }
    @Override
    public   void onClick(View v){
        if (v.getId()==R.id.button_calculate){
            String lenght = edtLenght.getText().toString().trim();
            String widht = edtWidht.getText().toString().trim();
            String height = edtHeight.getText().toString().trim();
            boolean isEmptyFields=false;
            if (TextUtils.isEmpty(lenght)){
                isEmptyFields = true;
                edtLenght.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(widht)){
                isEmptyFields = true;
                edtWidht.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(height)){
                isEmptyFields = true;
                edtHeight.setError("Field ini tidak boleh kosong");
            }
            if (!isEmptyFields){
                double l = Double.parseDouble(lenght);
                double w = Double.parseDouble(widht);
                double h = Double.parseDouble(height);
                double volume = l*w*h;
                tvResult.setText(String.valueOf(volume));
            }
        }
    }
}