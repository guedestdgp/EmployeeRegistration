package com.agenewdigital.employeeregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/*--- Tatiane's Project - C0755772 ---*/
public class ResultDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_description);

        /*-- Hide the actionbar, when show the title --*/
        getSupportActionBar().hide();

    }
}
