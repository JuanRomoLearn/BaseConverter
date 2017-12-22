package io.romo.baseconverter.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import io.romo.baseconverter.R;
import io.romo.baseconverter.util.BaseConverterUtils;

public class BaseConverterActivity extends AppCompatActivity {

    private EditText decimalNumberInput;
    private EditText binaryNumberInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_converter);

        decimalNumberInput = findViewById(R.id.decimal_number_input);
        decimalNumberInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (getCurrentFocus() == decimalNumberInput) {
                    binaryNumberInput.setText(BaseConverterUtils.convertDecimalStringToBinaryString(s.toString()));
                }
            }
        });

        binaryNumberInput = findViewById(R.id.binary_number_input);
        binaryNumberInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (getCurrentFocus() == binaryNumberInput) {
                    decimalNumberInput.setText(BaseConverterUtils.convertBinaryStringToDecimalString(s.toString()));
                }
            }
        });
    }
}
