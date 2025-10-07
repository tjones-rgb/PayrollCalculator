package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println(":Enter Employee id");
        int id = userInput.nextInt();

        System.out.println("Enter Employee Name:");
        String name = userInput.next();

        System.out.println("Enter Hours Worked:");
        double hoursWorked = userInput.nextDouble();

        System.out.println("Enter Pay Rate:");
        double payRate = userInput.nextDouble();

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedWriter writer = new BufferedWriter(fileReader);

//            bufReader.readLine(); //Alternative method to skip first line of csv file

            String input;

            Employee[] employeeList = new Employee[10];

            int count = 0;


            while((input = bufReader.readLine()) != null) {
                String[] tokens = input.split("\\|");
                if (!tokens[0].equals("id")) { //Skipping the header row

                    int id = Integer.parseInt(tokens[0]); //id
                    String name = tokens[1];
                    double hoursWorked = Double.parseDouble(tokens[2]);
                    double payRate = Double.parseDouble(tokens[3]);

                    employeeList[count] = new Employee(id, name, hoursWorked, payRate);

                   String employeeInfo = String.format(("EmployeeID: %d\nEmployee Name: %s\nGross Pay: $%.2f\n\n", employeeList[count].getEmployeeId(), employeeList[count].getName(), employeeList[count].getGrossPay());


                    count++;
                }

            }

            System.out.println(employeeList[0].getName());

            bufWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}


