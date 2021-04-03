package com.hfad.selectioncontrols;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SwitchCompat switchCompat;
    private AppCompatCheckBox checkBox;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchCompat = findViewById(R.id.switchButton);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), "Ligado", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Desligado", Toast.LENGTH_LONG).show();
                }
            }

        });

        checkBox = findViewById(R.id.checkboxButton);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), "Marcado", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Desmarcado", Toast.LENGTH_LONG).show();
                }
            }

        });

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.opcao1: {
                        Toast.makeText(getApplicationContext(), "Opção 1", Toast.LENGTH_LONG).show();

                        break;
                    }

                    case R.id.opcao2: {
                        Toast.makeText(getApplicationContext(), "Opção 2", Toast.LENGTH_LONG).show();

                        break;
                    }

                    case R.id.opcao3: {
                        Toast.makeText(getApplicationContext(), "Opção 3", Toast.LENGTH_LONG).show();

                        break;
                    }
                }
            }

        });
    }
}
