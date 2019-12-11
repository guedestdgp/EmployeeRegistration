package com.agenewdigital.employeeregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import Enums.Profession;
import classes.Employee;

/*--- Tatiane's Project - C0755772 ---*/
public class ResultDescriptionActivity extends AppCompatActivity {

    private ArrayList<Employee> employees = new ArrayList<>();
    private Employee employee;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_description);

        /*-- Hide the actionbar, when show the title --*/
        getSupportActionBar().hide();

        textView = findViewById(R.id.textView);

        employees = (ArrayList<Employee>) getIntent().getSerializableExtra("employees");
//        Profession.Tester
//        employee = employees.get(employees.size()-1);
        employee = (Employee) getIntent().getSerializableExtra("employee");
        textView.setText(employee.toDisplay());

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
//        Intent intent = new Intent(ResultDescriptionActivity.this, MainActivity.class);
//        intent.putExtra("employees", employees);
//        startActivity(intent);
    }
}
