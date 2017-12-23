package io.romo.baseconverter.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import io.romo.baseconverter.R;
import io.romo.baseconverter.model.NumeralSystem;
import io.romo.baseconverter.util.BaseConverterUtils;

public class BaseConverterActivity extends AppCompatActivity {

    private EditText decimalNumberInput;
    private EditText binaryNumberInput;
    private EditText hexadecimalNumberInput;
    private EditText octalNumberInput;

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

                    binaryNumberInput.setText(
                            BaseConverterUtils.convertNumberBase(
                                    s.toString(), NumeralSystem.Decimal, NumeralSystem.Binary));

                    hexadecimalNumberInput.setText(
                            BaseConverterUtils.convertNumberBase(
                                    s.toString(), NumeralSystem.Decimal, NumeralSystem.Hexadecimal));

                    octalNumberInput.setText(
                            BaseConverterUtils.convertNumberBase(
                                    s.toString(), NumeralSystem.Decimal, NumeralSystem.Octal));
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

                    decimalNumberInput.setText(
                            BaseConverterUtils.convertNumberBase(
                                    s.toString(), NumeralSystem.Binary, NumeralSystem.Decimal));

                    hexadecimalNumberInput.setText(
                            BaseConverterUtils.convertNumberBase(
                                    s.toString(), NumeralSystem.Binary, NumeralSystem.Hexadecimal));

                    octalNumberInput.setText(
                            BaseConverterUtils.convertNumberBase(
                                    s.toString(), NumeralSystem.Binary, NumeralSystem.Octal));
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

                    decimalNumberInput.setText(
                            BaseConverterUtils.convertNumberBase(
                                    s.toString(), NumeralSystem.Hexadecimal, NumeralSystem.Decimal));

                    binaryNumberInput.setText(
                            BaseConverterUtils.convertNumberBase(
                                    s.toString(), NumeralSystem.Hexadecimal, NumeralSystem.Binary));

                    octalNumberInput.setText(
                            BaseConverterUtils.convertNumberBase(
                                    s.toString(), NumeralSystem.Hexadecimal, NumeralSystem.Octal));
                }
            }
        });

        octalNumberInput = findViewById(R.id.octal_number_input);
        octalNumberInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (getCurrentFocus() == octalNumberInput) {

                    decimalNumberInput.setText(
                            BaseConverterUtils.convertNumberBase(
                                    s.toString(), NumeralSystem.Octal, NumeralSystem.Decimal));

                    binaryNumberInput.setText(
                            BaseConverterUtils.convertNumberBase(
                                    s.toString(), NumeralSystem.Octal, NumeralSystem.Binary));

                    hexadecimalNumberInput.setText(
                            BaseConverterUtils.convertNumberBase(
                                    s.toString(), NumeralSystem.Octal, NumeralSystem.Hexadecimal));
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_base_converter, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.action_clear:

                decimalNumberInput.getText().clear();

                binaryNumberInput.getText().clear();

                hexadecimalNumberInput.getText().clear();

                octalNumberInput.getText().clear();

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
