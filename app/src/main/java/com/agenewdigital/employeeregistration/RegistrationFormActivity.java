package com.agenewdigital.employeeregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
import java.util.Calendar;

import classes.Car;
import classes.Employee;
import Enums.Profession;
import classes.Manager;
import classes.Motorcycle;
import classes.Programmer;
import classes.Tester;
import classes.Vehicle;

/*--- Tatiane's Project - C0755772 ---*/
public class RegistrationFormActivity extends AppCompatActivity {

    /* Locals */
    private static ArrayList<Employee> employees = new ArrayList<>();
    String[] strings_employeesTypes;
    private String message;
    private boolean isCar = true;

    Spinner employeeType;
    TableRow row_employee_type;
    TextView txtNumber;
    Profession profession;

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
    //RadioGroup was set before.
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
                    profession = Profession.None;
                }
                else if (type.equals(getResources().getString(R.string.manager))) {
                    row_employee_type.setVisibility(View.VISIBLE);
                    txtNumber.setText(getResources().getString(R.string.number_clients));
                    profession = Profession.Manager;
                }  else if (type.equals(getResources().getString(R.string.programmer))){
                    row_employee_type.setVisibility(View.VISIBLE);
                    txtNumber.setText(getResources().getString(R.string.number_projects));
                    profession = Profession.Programmer;
                } else {
                    row_employee_type.setVisibility(View.VISIBLE);
                    txtNumber.setText(getResources().getString(R.string.number_bugs));
                    profession = Profession.Tester;
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
                else
                    setData();

            }
        });
    }

    public void setData() {
        Vehicle vehicle;
        /* Check if is car or motorcycle and add to the correct class */
        if (isCar){
            //(String make, String plate, String color, String category, String type)
            vehicle = new Car(etVehicleModel.getText().toString(),
                    etPlateNumber.getText().toString(),
                    spChoseColor.getSelectedItem().toString(),
                    "car",
                    etCarType.getText().toString());
        } else {
            //(String make, String plate, String color, String category, Boolean sidecar)
//            vehicle = new Motorcycle(
//                    etma
//                    etPlateNumber.getText().toString(),
//                    spChoseColor.getSelectedItem().toString(),
//                    "motorcycle",
//                    etCarType.getText().toString());
        }
        Car car = null;
        Profession employee = null;
        int age = Calendar.YEAR / Integer.valueOf(etBirthYear.getText().toString());
        int rate = etOccupationRate.getText().toString().isEmpty() ? 100 : Integer.valueOf(etOccupationRate.getText().toString());
        /* Manager
         * int employeeId, String firstName, String lastName, int age, int birthYear,
         * double monthlySalary, int rate, int nbClients, Vehicle vehicleId
         * */
        switch (profession) {
            case Manager:
                employees.add(new Manager(Integer.valueOf(etEmployeeId.getText().toString()),
                        etFirstName.getText().toString(),
                        etLastName.getText().toString(), age,
                        Integer.valueOf(etBirthYear.getText().toString()),
                        Double.valueOf(etMonthlySalary.getText().toString()),
                        rate,
                        Integer.valueOf(etNumber.getText().toString()), car));
                break;
            case Programmer:
                employees.add(new Programmer(Integer.valueOf(etEmployeeId.getText().toString()),
                        etFirstName.getText().toString(),
                        etLastName.getText().toString(), age,
                        Integer.valueOf(etBirthYear.getText().toString()),
                        Double.valueOf(etMonthlySalary.getText().toString()),
                        rate,
                        Integer.valueOf(etNumber.getText().toString()), car));
                break;
            case Tester:
                employees.add(new Tester(Integer.valueOf(etEmployeeId.getText().toString()),
                        etFirstName.getText().toString(),
                        etLastName.getText().toString(), age,
                        Integer.valueOf(etBirthYear.getText().toString()),
                        Double.valueOf(etMonthlySalary.getText().toString()),
                        rate,
                        Integer.valueOf(etNumber.getText().toString()), car));
        }
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
            message = "Provide " + profession;
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
                isCar = true;
                rowCar.setVisibility(View.VISIBLE);
                rowMotorbike.setVisibility(View.GONE);
                break;
            case R.id.motorbike_rb:
                isCar = false;
                rowMotorbike.setVisibility(View.VISIBLE);
                rowCar.setVisibility(View.GONE);
        }
    }
}
