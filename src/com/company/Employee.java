package com.company;

public final class Employee {
    private double hourlySalary;
    private double hoursOfWorkPerDay;
    public Employee(double hourlySalary, double hoursOfWorkPerDay) {
        setInfo(hourlySalary,hoursOfWorkPerDay);
    }

    public double getHourlySalary() {
        return hourlySalary;
    }


    public double getHoursOfWorkPerDay() {
        return hoursOfWorkPerDay;
    }


    public void setInfo(double hourlySalary, double hoursOfWorkPerDay) {
        this.hourlySalary = hourlySalary;
        this.hoursOfWorkPerDay = hoursOfWorkPerDay;
    }

    private double computeBaseSalary(double hourlySalary, double hoursOfWorkPerDay) {
        return this.getHourlySalary()*this.getHoursOfWorkPerDay()*20;
    }

    private double addSal(double salary) {
        if ((salary < 500) && (salary >0)) {
            return salary += 10;
        } else
            return salary;
    }

    private double addWork(double hoursOfWorkPerDay, double baseSalary) {
        if (hoursOfWorkPerDay > 6) {
            return baseSalary += (5*20);
        } else
            return baseSalary;
    }

    public void getInfo(){
        double baseSalary = addWork(hoursOfWorkPerDay, computeBaseSalary(hourlySalary,hoursOfWorkPerDay));
        double finalSalary = addSal(baseSalary);
        System.out.println("The salary of employee is: " + finalSalary);
    }
}
