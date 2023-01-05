package com.example.second_inclass_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /*
    *   App of One Activity --> 2 sections
    *
    *   1.) Enter Employee Details --> Name, Salary, Spinner(Ful Time/ Part Time), Add Button
    *   2.) ListView --> when clicking Add the list will add employee with the name + salary
    * */

    private EditText name_txt;
    private EditText salary_txt;
    private Spinner spinner;
    private Button add_btn;
    private ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupView();

        List<Employee> employees = new ArrayList<Employee>();

        String[] employeeType = new String[2];
        employeeType[0] = "Part-Time";
        employeeType[1] = "Full-Time";

        ArrayAdapter<String> type = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, employeeType);
        spinner.setAdapter(type);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = name_txt.getText().toString();
                String salary = salary_txt.getText().toString();
                String empType = spinner.getSelectedItem().toString();

                Employee emp = new Employee(name,salary,empType);

                employees.add(emp);

                ArrayAdapter<Employee> emps = new ArrayAdapter<Employee>(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,employees);

                list.setAdapter(emps);

            }
        });


    }

    private void setupView() {
        name_txt = findViewById(R.id.name_txt);
        salary_txt = findViewById(R.id.salary_txt);
        spinner = findViewById(R.id.spinner);
        add_btn = findViewById(R.id.add_btn);
        list = findViewById(R.id.list);
    }
}