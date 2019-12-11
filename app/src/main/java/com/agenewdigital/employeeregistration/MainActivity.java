package com.agenewdigital.employeeregistration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
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
                intent.putExtra("employee", employees);
                startActivity(intent);
            }
        });

        /* Get Employee from intent */
        if (getIntent().getExtras() != null) {
            employees = (ArrayList<Employee>) getIntent().getSerializableExtra("employees");
        }

        /* ListView */
        ListView listView = findViewById(R.id.listView);
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(MainActivity.this, R.layout.emplyee_layout, employees);
        try {
            listView.setAdapter(employeeAdapter);
        }catch (Exception e) {
            Log.i("employee_error", "onClick: "+e);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ResultDescriptionActivity.class);
//                intent.putExtra("employees", employees);
                intent.putExtra("employee", employees.get(position));
                startActivity(intent);
            }
        });
    }
}


