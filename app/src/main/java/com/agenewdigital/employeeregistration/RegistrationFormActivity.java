package com.agenewdigital.employeeregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import classes.Employee;

/*--- Tatiane's Project - C0755772 ---*/
public class RegistrationFormActivity extends AppCompatActivity {

    /* Locals */
    private static ArrayList<Employee> employees;
    String[] strings_employeesTypes;
    private String message;

    Spinner employeeType;
    TableRow row_employee_type;
    TextView txtNumber;
    String number_showed;

    /*
    * Fields to save data
    * */
    EditText etFirstName;
    EditText etLastName;
    EditText etBirthYear;
    EditText etMonthlySalary;
    EditText etOccupationRate;
    EditText etEmployeeId;
    //Spinner was set before.
    EditText etNumber;
    //RadioButtons were set before.
    //RadioGroup Vehicle Chose and Motorcycle Type.
    EditText etCarType;
    EditText etVehicleModel;
    EditText etPlateNumber;
    Spinner spChoseColor;

    /*
    * Button Register
    * */
    Button btRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);

        strings_employeesTypes = getResources().getStringArray(R.array.employees);

        setEmployeeType();
    }

    private void setEmployeeType() {

        /* Employee Type - Spinner */
        employeeType = findViewById(R.id.spinner_employeeType);
        row_employee_type = findViewById(R.id.row_emplyee_type);
        txtNumber = findViewById(R.id.txtNumber);

        /* Spinner of employee type */
        employeeType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String type = strings_employeesTypes[position];
                if (type.equals(getResources().getString(R.string.chooseType))) {
                    row_employee_type.setVisibility(View.GONE);
                    number_showed = getResources().getString(R.string.chooseType);
                }
                else if (type.equals(getResources().getString(R.string.manager))) {
                    row_employee_type.setVisibility(View.VISIBLE);
                    txtNumber.setText(getResources().getString(R.string.number_clients));
                    number_showed = getResources().getString(R.string.number_clients);
                }  else if (type.equals(getResources().getString(R.string.programmer))){
                    row_employee_type.setVisibility(View.VISIBLE);
                    txtNumber.setText(getResources().getString(R.string.number_projects));
                    number_showed = getResources().getString(R.string.programmer);
                } else {
                    row_employee_type.setVisibility(View.VISIBLE);
                    txtNumber.setText(getResources().getString(R.string.number_bugs));
                    number_showed = getResources().getString(R.string.number_bugs);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        /* Setting id's */
        etFirstName = findViewById(R.id.firstName);
        etLastName = findViewById(R.id.lastName);
        etBirthYear = findViewById(R.id.birthYear);
        etMonthlySalary = findViewById(R.id.monthlySalary);
        etOccupationRate = findViewById(R.id.occupationRate);
        etEmployeeId = findViewById(R.id.employeeId);
        //Spinner was set before.
        etNumber = findViewById(R.id.number);
        //RadioButtons were set before.
        //RadioGroup Vehicle Chose and Motorcycle Type.
        etCarType = findViewById(R.id.carType);
        etVehicleModel = findViewById(R.id.model);
        etPlateNumber = findViewById(R.id.plateNumber);
        spChoseColor = findViewById(R.id.spinner_color);
        btRegister = findViewById(R.id.btRegister);

        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmptyField())
                    Toast.makeText(RegistrationFormActivity.this, message, Toast.LENGTH_LONG).show();
                else {

                }

            }
        });
    }

    public boolean isEmptyField(){
        if (etFirstName.getText().toString().isEmpty()) {
            message = "Provide first name";
            return true;
        } else if (etLastName.getText().toString().isEmpty()) {
            message = "Provide last name";
            return true;
        } else if (etBirthYear.getText().toString().isEmpty()) {
            message = "Provide Birth Year";
            return true;
        } else if (etMonthlySalary.getText().toString().isEmpty()) {
            message = "Provide Monthly Salary";
            return true;
        } else if (etEmployeeId.getText().toString().isEmpty()) {
            message = "Provide Employee ID";
            return true;
        } else if (etNumber.getText().toString().isEmpty()) {
            message = "Provide " + number_showed;
            return true;
        } else if (etCarType.getText().toString().isEmpty()) {
            message = "Provide Car Type";
            return true;
        } else if (etVehicleModel.getText().toString().isEmpty()) {
            message = "Provide Vehicle Model";
            return true;
        } else if (etPlateNumber.getText().toString().isEmpty()) {
            message = "Provide Plate Number";
            return true;
        } else if (spChoseColor.getSelectedItem() == getResources().getString(R.string.chooseColor)) {
            message = "Provide Vehicle's Color";
            return true;
        } else
            return false;
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
