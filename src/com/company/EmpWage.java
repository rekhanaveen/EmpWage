package com.company;

public class EmpWage {

    public static void main(String[] args) {

        int  IS_PRESENT = 1;

        double empCheck = Math.floor(Math.random() *10) %2;

        if(empCheck == IS_PRESENT)
            System.out.println("Employee Present!!");
        else
            System.out.println("Employee Absent");


    }
}
