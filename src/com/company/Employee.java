package com.company;

public class Employee {
    private String name;
    private String surename;
    private int salary;

    public Employee(String name, String surename, int salary) {
        this.name = name;
        this.surename = surename;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
