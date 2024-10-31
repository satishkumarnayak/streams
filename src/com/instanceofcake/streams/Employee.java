package com.instanceofcake.streams;

import java.time.LocalDate;

public class Employee {

    private String name;
    private String dept;
    private double salary;
    private String gender;
    private LocalDate doj;

    public Employee(String name, String dept, double salary, String gender, LocalDate doj) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.gender = gender;
        this.doj = doj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }
}
