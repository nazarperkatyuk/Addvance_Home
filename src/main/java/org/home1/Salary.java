package org.home1;

public class Salary{

    public double SalaryPerDay(double perHour, int numberOfHours) {
        return perHour * numberOfHours;
    }

    public double SalaryPerMonth(int daysWorking, double perHour, int numberOfHoursPerDay, double hospitalPerMonth) {
        return daysWorking * perHour * numberOfHoursPerDay + hospitalPerMonth;

    }
}

