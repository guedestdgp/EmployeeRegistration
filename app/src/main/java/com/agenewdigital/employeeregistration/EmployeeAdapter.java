package com.agenewdigital.employeeregistration;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import classes.Employee;

public class EmployeeAdapter extends ArrayAdapter implements Filterable {

    private List<Employee> employees;
    private List<Employee> orig;
    private final LayoutInflater layoutInflater;
    private final int layoutResource;

    public List<Employee> getEmployees() { return employees; }

    public Filter getFilter() {
        return new Filter() {

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                final FilterResults oReturn = new FilterResults();
                final ArrayList<Employee> results = new ArrayList<Employee>();
                if (orig == null)
                    orig = employees;
                if (constraint != null) {
                    if (orig != null && orig.size() > 0) {
                        for (final Employee g : orig) {
                            if (g.getFirstName().toLowerCase()
                                    .contains(constraint.toString().toLowerCase()) || g.getLastName().toLowerCase()
                                    .contains(constraint.toString().toLowerCase()))
                                results.add(g);
                        }
                    }
                    oReturn.values = results;
                }
                return oReturn;
            }

            @SuppressWarnings("unchecked")
            @Override
            protected void publishResults(CharSequence constraint,
                                          FilterResults results) {
                employees = (ArrayList<Employee>) results.values;
                notifyDataSetChanged();
            }
        };
    }

    public EmployeeAdapter(@NonNull Context context, int resource, List<Employee> employees) {
        super(context, resource);
        this.employees = employees;
        this.layoutInflater = LayoutInflater.from(context);
        this.layoutResource = resource;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
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
