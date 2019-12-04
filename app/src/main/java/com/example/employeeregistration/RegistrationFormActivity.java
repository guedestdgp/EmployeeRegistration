package com.example.employeeregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TableRow;
import android.widget.Toast;

/*--- Tatiane's Project - C0755772 ---*/
public class RegistrationFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);
    }

    public void vehicleChecked(View view){
        RadioGroup radioGroup = findViewById(R.id.rg_vehicle);
        TableRow rowCar = findViewById(R.id.rowCar);
        TableRow rowMotorbike = findViewById(R.id.rowMotorbike);
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id) {
            case R.id.car:
                rowCar.setVisibility(View.VISIBLE);
                rowMotorbike.setVisibility(View.GONE);
            case R.id.motorbike:
                rowCar.setVisibility(View.GONE);
                rowMotorbike.setVisibility(View.VISIBLE);
        }
    }
}
