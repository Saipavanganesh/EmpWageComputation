package com.empwage;

import java.lang.Math;
public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("********************************************");

        int wagePerHour=20;
        int fullDayHours=0;
        int totalWorkingDays=20;
        int maxHours=100;
        int totalHoursWorked=0;
        int daysPresent=0;
        int salary;

        while(daysPresent<totalWorkingDays && totalHoursWorked<maxHours){
            double empCheck=Math.floor(Math.random()*10)%3;
            switch (Double.toString(empCheck)){
                case "1.0":
                    //System.out.println("Employee is present");
                    daysPresent++;
                    fullDayHours=8;
                    totalHoursWorked = totalHoursWorked+fullDayHours;
                    break;
                case "2.0":
                    //System.out.println("Emp is Part time present");
                    fullDayHours=4;
                    totalHoursWorked = totalHoursWorked+fullDayHours;
                    daysPresent++;
                    break;
                default:
                    //System.out.println("Employee is absent");
                    fullDayHours=0;
                    totalHoursWorked = totalHoursWorked+fullDayHours;
                    break;
            }
        }

        salary=totalHoursWorked*wagePerHour;
        System.out.println("No.of days employee worked: "+daysPresent);
        System.out.println("Total Hours="+totalHoursWorked);
        System.out.println("Total Salary is "+salary);
    }
}
