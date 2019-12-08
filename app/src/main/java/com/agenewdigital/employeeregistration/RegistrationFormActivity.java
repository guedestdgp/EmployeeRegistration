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

    String[] strings_employeesTypes;

    Spinner employeeType;
    TableRow row_employee_type;
    TextView txtNumber;

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
