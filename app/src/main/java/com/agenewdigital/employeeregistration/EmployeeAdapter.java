package com.agenewdigital.employeeregistration;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import classes.Employee;

public class EmployeeAdapter extends ArrayAdapter {

    private List<Employee> employees;
    private final LayoutInflater layoutInflater;
    private final int layoutResource;

    public EmployeeAdapter(@NonNull Context context, int resource, List<Employee> employees) {
        super(context, resource);
        this.employees = employees;
        this.layoutInflater = LayoutInflater.from(context);
        this.layoutResource = resource;
    }

    @Override
    public int getCount() {
        return employees.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null)
            v = layoutInflater.inflate(layoutResource, parent, false);
        TextView nameText = v.findViewById(R.id.name);
        TextView idText = v.findViewById(R.id.id);

        String name = "Name:   "+
                employees.get(position).getFirstName()+
                " "+employees.get(position).getLastName();
        nameText.setText(name);

        String id = "Id:   "+
                String.valueOf(employees.get(position).getEmployeeId());
        idText.setText(id);

        return v;
    }
}
