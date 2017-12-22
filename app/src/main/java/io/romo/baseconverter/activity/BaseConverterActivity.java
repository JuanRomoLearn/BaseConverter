package io.romo.baseconverter.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;

import io.romo.baseconverter.R;
import io.romo.baseconverter.util.BaseConverterUtils;

public class BaseConverterActivity extends AppCompatActivity {

    private EditText decimalNumberInput;
    private EditText binaryNumberInput;
    private EditText hexadecimalNumberInput;
    private EditText ocatalNumberInput;

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
                    hexadecimalNumberInput.setText(BaseConverterUtils.convertDecimalStringToHexadecimalString(s.toString()));
                    ocatalNumberInput.setText(BaseConverterUtils.convertDecimalStringToOctalString(s.toString()));
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
                    hexadecimalNumberInput.setText(BaseConverterUtils.convertBinaryStringToHexadecimalString(s.toString()));
                    ocatalNumberInput.setText(BaseConverterUtils.convertBinaryStringToOctalString(s.toString()));
                }
            }
        });

        hexadecimalNumberInput = findViewById(R.id.hexadecimal_number_input);
        hexadecimalNumberInput.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        hexadecimalNumberInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (getCurrentFocus() == hexadecimalNumberInput) {
                    decimalNumberInput.setText(BaseConverterUtils.convertHexadecimalStringToDecimalString(s.toString()));
                    binaryNumberInput.setText(BaseConverterUtils.convertHexadecimalStringToBinaryString(s.toString()));
                    ocatalNumberInput.setText(BaseConverterUtils.convertHexadecimalStringToOctalString(s.toString()));
                }
            }
        });

        ocatalNumberInput = findViewById(R.id.octal_number_input);
        ocatalNumberInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (getCurrentFocus() == ocatalNumberInput) {
                    decimalNumberInput.setText(BaseConverterUtils.convertOctalStringToDecimalString(s.toString()));
                    binaryNumberInput.setText(BaseConverterUtils.convertOctalStringToBinaryString(s.toString()));
                    hexadecimalNumberInput.setText(BaseConverterUtils.convertOctalStringToHexadecimalString(s.toString()));
                }
            }
        });
    }
}
