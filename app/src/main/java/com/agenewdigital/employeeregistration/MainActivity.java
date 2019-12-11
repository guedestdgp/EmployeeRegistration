package com.agenewdigital.employeeregistration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

import classes.Employee;

/*--- Tatiane's Project - C0755772 ---*/
public class MainActivity extends AppCompatActivity {

    ArrayList<Employee> employees;

    {
        employees = new ArrayList<>();
    }
    EmployeeAdapter employeeAdapter;


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
        final ListView listView = findViewById(R.id.listView);
        employeeAdapter = new EmployeeAdapter(MainActivity.this, R.layout.emplyee_layout, employees);
        try {
            listView.setAdapter(employeeAdapter);
        }catch (Exception e) {
            Log.i("employee_error", "onClick: "+e);
        }
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                ArrayAdapter<Employee> newListEmployee = ((EmployeeAdapter)((ListView)parent).FixedViewInfo).employees;
                Intent intent = new Intent(MainActivity.this, ResultDescriptionActivity.class);
//                intent.putExtra("employees", employees);
                intent.putExtra("employee", employeeAdapter.getEmployees().get(position));
                startActivity(intent);
            }
        });

        /* SearchView */
        SearchView searchView = null;
        try {
            searchView = findViewById(R.id.searchView);
        }catch (Exception e){
            Log.i("employee_error", "onClick: "+e);
        }

//        searchView.setActivated(true);
//        searchView.onActionViewExpanded();
//        searchView.setIconified(false);
//        searchView.setIconifiedByDefault(false);
        searchView.setSubmitButtonEnabled(true);
        searchView.setQueryHint("Search Here");
//        searchView.setOnQueryTextFocusChangeListener(MainActivity.this);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                if (TextUtils.isEmpty(newText)) {
                    listView.clearTextFilter();
                } else {
                    listView.setFilterText(newText);
                }
                return false;
            }
        });
    }
}


