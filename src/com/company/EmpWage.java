package com.company;

public class EmpWage {

    public static void main(String[] args) {

        int  IS_PRESENT = 1;

        double empCheck = Math.floor(Math.random() *10) %2;

        int avrPayPerDay = 20;

        int empSal = avrPayPerDay * 8;

        System.out.println("Welcome to Programming!!");


        if (empCheck == IS_PRESENT)

            System.out.println( "Employee Present!! And Salary is : " + empSal);
        else

            System.out.println("Employee Absent");


    }
}
