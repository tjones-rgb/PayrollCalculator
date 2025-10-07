package com.pluralsight;
import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


      //  10|Dana Wyatt|52.5|12.50
      //  20|Ezra Aiden|17|16.75
      //  30|Brittany Sings|40|16.50
     //   40|Zephaniah Hughes|2|10.0

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;

            while((input = bufReader.readLine()) != null) {
               String[] scrolls = input.split("\\|");

                System.out.println(scrolls[0]);
                System.out.println(scrolls[1]);
                System.out.println(scrolls[2]);
                System.out.println(scrolls[3]);
            }

            bufReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
