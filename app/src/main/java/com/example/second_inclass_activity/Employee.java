package com.example.second_inclass_activity;

public class Employee {

    private String name;
    private String salary;
    private String type;

    public Employee(String name, String salary, String type) {
        this.name = name;
        this.salary = salary;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Name : " + name + "," + "Salary : " + salary+"$";
    }
}
