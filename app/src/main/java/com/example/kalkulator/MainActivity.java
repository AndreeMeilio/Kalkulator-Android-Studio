package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_number1, button_number2, button_number3, button_number4, button_number5,
            button_number6, button_number7, button_number8, button_number9, button_number0,
            button_add, button_sub, button_multiply, button_divide, button_koma, button_count, button_clear;

    private TextView text_hasil;

    private Double angkaPertama, angkaKedua, angkaHasil;
    private boolean isAdditionClicked, isSubtractionClicked, isMultiplyClicked, isDivideClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angkaPertama = null;
        angkaKedua = null;

        button_number1 = (Button) findViewById(R.id.angka1);
        button_number1.setOnClickListener(this);

        button_number2 = (Button) findViewById(R.id.angka2);
        button_number2.setOnClickListener(this);

        button_number3 = (Button) findViewById(R.id.angka3);
        button_number3.setOnClickListener(this);

        button_number4 = (Button) findViewById(R.id.angka4);
        button_number4.setOnClickListener(this);

        button_number5 = (Button) findViewById(R.id.angka5);
        button_number5.setOnClickListener(this);

        button_number6 = (Button) findViewById(R.id.angka6);
        button_number6.setOnClickListener(this);

        button_number7 = (Button) findViewById(R.id.angka7);
        button_number7.setOnClickListener(this);

        button_number8 = (Button) findViewById(R.id.angka8);
        button_number8.setOnClickListener(this);

        button_number9 = (Button) findViewById(R.id.angka9);
        button_number9.setOnClickListener(this);

        button_number0 = (Button) findViewById(R.id.angka0);
        button_number0.setOnClickListener(this);

        button_add = (Button) findViewById(R.id.operator_addition);
        button_add.setOnClickListener(this);

        button_sub = (Button) findViewById(R.id.operator_subtraction);
        button_sub.setOnClickListener(this);

        button_multiply = (Button) findViewById(R.id.operator_multiply);
        button_multiply.setOnClickListener(this);

        button_divide = (Button) findViewById(R.id.operator_divide);
        button_divide.setOnClickListener(this);

        button_koma = (Button) findViewById(R.id.koma_button);
        button_koma.setOnClickListener(this);

        button_count = (Button) findViewById(R.id.hasil_button);
        button_count.setOnClickListener(this);

        button_clear = (Button) findViewById(R.id.clear_button);
        button_clear.setOnClickListener(this);

        text_hasil = (TextView) findViewById(R.id.text_hasil);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.angka1:
                text_hasil.setText(text_hasil.getText() + "1");
                break;
            case R.id.angka2:
                text_hasil.setText(text_hasil.getText() + "2");
                break;
            case R.id.angka3:
                text_hasil.setText(text_hasil.getText() + "3");
                break;
            case R.id.angka4:
                text_hasil.setText(text_hasil.getText() + "4");
                break;
            case R.id.angka5:
                text_hasil.setText(text_hasil.getText() + "5");
                break;
            case R.id.angka6:
                text_hasil.setText(text_hasil.getText() + "6");
                break;
            case R.id.angka7:
                text_hasil.setText(text_hasil.getText() + "7");
                break;
            case R.id.angka8:
                text_hasil.setText(text_hasil.getText() + "8");
                break;
            case R.id.angka9:
                text_hasil.setText(text_hasil.getText() + "9");
                break;
            case R.id.angka0:
                text_hasil.setText(text_hasil.getText() + "0");
                break;

            case R.id.operator_addition:
                angkaPertama = Double.parseDouble(text_hasil.getText().toString());
                isAdditionClicked = true;
                text_hasil.setText(null);
                text_hasil.setHint("Angka Kedua");
                break;
            case R.id.operator_subtraction:
                angkaPertama = Double.parseDouble(text_hasil.getText().toString());
                isSubtractionClicked = true;
                text_hasil.setText(null);
                text_hasil.setHint("Angka Kedua");
                break;
            case R.id.operator_multiply:
                angkaPertama = Double.parseDouble(text_hasil.getText().toString());
                isMultiplyClicked = true;
                text_hasil.setText(null);
                text_hasil.setHint("Angka Kedua");
                break;
            case R.id.operator_divide:
                angkaPertama = Double.parseDouble(text_hasil.getText().toString());
                isDivideClicked = true;
                text_hasil.setText(null);
                text_hasil.setHint("Angka Kedua");
                break;

            case R.id.koma_button:
                text_hasil.setText(text_hasil.getText() + ".");
                break;

            case R.id.hasil_button:
                angkaKedua = Double.parseDouble(text_hasil.getText().toString());

                if (isAdditionClicked){
                    angkaHasil = angkaPertama + angkaKedua;
                    text_hasil.setText(String.valueOf(angkaHasil));
                    isAdditionClicked = false;
                }
                if (isSubtractionClicked){
                    angkaHasil = angkaPertama - angkaKedua;
                    text_hasil.setText(String.valueOf(angkaHasil));
                    isSubtractionClicked = false;
                }
                if (isMultiplyClicked){
                    angkaHasil = angkaPertama * angkaKedua;
                    text_hasil.setText(String.valueOf(angkaHasil));
                    isMultiplyClicked = false;
                }
                if (isDivideClicked){
                    angkaHasil = angkaPertama / angkaKedua;
                    text_hasil.setText(String.valueOf(angkaHasil));
                    isDivideClicked = false;
                }
                angkaPertama = null;
                break;

            case R.id.clear_button:

                if (angkaPertama == null){
                    text_hasil.setHint("Angka Pertama");
                } else if (angkaPertama != null){
                    text_hasil.setHint("Angka Kedua");
                }
                text_hasil.setText("");
                break;
        }
    }
}