package com.pluralsight;

public class Employee {

    //id|name|hours-worked|pay-rate
    private int employeeid;
    private String name;
    private String hoursWorked;
    private String payRate;

    //  10|Dana Wyatt|52.5|12.50
    //  20|Ezra Aiden|17|16.75
    //  30|Brittany Sings|40|16.50
    //   40|Zephaniah Hughes|2|10.0
    public Employee(int id, String name, String hoursWorked, String payRate) {
        this.employeeid = employeeid;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + employeeid +
                ", name='" + name + '\'' +
                ", hoursWorked='" + hoursWorked + '\'' +
                ", payRate='" + payRate + '\'' +
                '}';
    }
    public int getemployeeId() {
        return employeeid;
    }

    public void setId(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(String hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getPayRate() {
        return payRate;
    }

    public void setPayRate(String payRate) {
        this.payRate = payRate;
    }



}
