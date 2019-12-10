package com.agenewdigital.employeeregistration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import classes.Employee;

/*--- Tatiane's Project - C0755772 ---*/
public class MainActivity extends AppCompatActivity {

    ArrayList<Employee> employees;

    {
        employees = new ArrayList<>();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*-- Hide the actionbar, when show the title --*/
        getSupportActionBar().hide();

        Button btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistrationFormActivity.class);
                startActivity(intent);
            }
        });

        /* Get Employee from intent */
        if (getIntent().getExtras() != null) {
            employees = (ArrayList<Employee>) getIntent().getSerializableExtra("employee");
        }

        /* ListView */
        ListView listView = findViewById(R.id.listView);
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(MainActivity.this, R.layout.emplyee_layout, employees);
        listView.setAdapter(employeeAdapter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}


