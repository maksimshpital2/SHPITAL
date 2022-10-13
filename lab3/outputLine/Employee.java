package ru.mirea.lab3.outputLine;

import java.util.Date;

public class Employee extends Person {
    private double salary;
    private Date salaryDate;

    public Employee(String fullName) {
        super(fullName);
    }

    public Employee(String fullName, double salary) {
        this(fullName);
        this.salary = salary;
    }

    public Employee(String fullName, double salary, Date salaryDate) {
        this(fullName, salary);
        this.salaryDate = salaryDate;
    }

    public String getFullName() {
        return super.getFullName();
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getSalaryDate() {
        return this.salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Employee)) {
            return false;
        } else if (!super.equals(o)) {
            return false;
        } else {
            Employee employee = (Employee)o;
            if (Double.compare(employee.salary, this.salary) != 0) {
                return false;
            } else {
                return this.salaryDate != null ? this.salaryDate.equals(employee.salaryDate) : employee.salaryDate == null;
            }
        }
    }

    public int hashCode() {
        int result = super.hashCode();
        long temp = Double.doubleToLongBits(this.salary);
        result = 31 * result + (int)(temp ^ temp >>> 32);
        result = 31 * result + (this.salaryDate != null ? this.salaryDate.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "Employee{salary = " + this.salary + ", salaryDate = " + this.salaryDate + "}";
    }
}

