package com.agenewdigital.employeeregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import classes.Employee;

/*--- Tatiane's Project - C0755772 ---*/
public class ResultDescriptionActivity extends AppCompatActivity {

    private ArrayList<Employee> employees = new ArrayList<>();
    private Employee employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_description);

        /*-- Hide the actionbar, when show the title --*/
        getSupportActionBar().hide();

        employees = (ArrayList<Employee>) getIntent().getSerializableExtra("Employees");

        employee = employees.get(employees.size()-1);

    }
}
