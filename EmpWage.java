package com.empwage;

import java.lang.Math;
public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        double empCheck=Math.floor(Math.random()*10)%2;
        int wagePerHour=20;
        int fullDayHours=8;
        int salary;

        if(empCheck==1.0){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
            fullDayHours=0;
        }
        salary=fullDayHours*wagePerHour;
        System.out.println("Daily Wage is "+salary);

    }
}
