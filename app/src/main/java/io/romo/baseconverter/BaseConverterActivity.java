package io.romo.baseconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class BaseConverterActivity extends AppCompatActivity {

    private EditText decimalNumberInput;
    private EditText binaryNumberInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_converter);

        decimalNumberInput = findViewById(R.id.decimal_number_input);
        binaryNumberInput = findViewById(R.id.binary_number_input);
    }
}
