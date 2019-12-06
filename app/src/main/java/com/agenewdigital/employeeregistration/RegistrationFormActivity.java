package com.agenewdigital.employeeregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

import classes.Employee;

/*--- Tatiane's Project - C0755772 ---*/
public class RegistrationFormActivity extends AppCompatActivity {

//    private static Employee employee;

    private static ArrayList<Employee> employees;

    String[] strings_employees;

    Spinner employeeType;
    TableRow row_employee_type;
    TextView txtNumber;
    EditText etNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);

        strings_employees = getResources().getStringArray(R.array.employees);

        setEmployeeType();
    }

    private void setEmployeeType() {
        /* Employee Type - Spinner */
        employeeType = findViewById(R.id.spinner_employeeType);
        row_employee_type = findViewById(R.id.row_emplyee_type);
        txtNumber = findViewById(R.id.txtNumber);
        
        employeeType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String type = strings_employees[position];
                if (type.equals(getResources().getString(R.string.chooseType)))
                    row_employee_type.setVisibility(View.GONE);
                else if (type.equals(getResources().getString(R.string.manager))) {
                    row_employee_type.setVisibility(View.VISIBLE);
                    txtNumber.setText(getResources().getString(R.string.number_clients));
                }  else if (type.equals(getResources().getString(R.string.programmer))){
                    row_employee_type.setVisibility(View.VISIBLE);
                    txtNumber.setText(getResources().getString(R.string.number_projects));
                } else {
                    row_employee_type.setVisibility(View.VISIBLE);
                    txtNumber.setText(getResources().getString(R.string.number_bugs));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void vehicleChecked(View view){
        RadioGroup radioGroup = findViewById(R.id.rg_vehicle);
        TableRow rowCar = findViewById(R.id.rowCar);
        TableRow rowMotorbike = findViewById(R.id.rowMotorbike);
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id) {
            case R.id.car_rb:
                rowCar.setVisibility(View.VISIBLE);
                rowMotorbike.setVisibility(View.GONE);
                break;
            case R.id.motorbike_rb:
                rowMotorbike.setVisibility(View.VISIBLE);
                rowCar.setVisibility(View.GONE);
        }
    }
}
