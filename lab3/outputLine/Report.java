package ru.mirea.lab3.outputLine;

import ru.mirea.lab3.outputLine.Employee;

import java.util.Locale;

public class Report {
    public Report() {
    }

    public static void generateReport(Employee[] employees) {
        System.out.printf("|          ФИО          | %-10s |%n", "Оклад, руб");
        printBorder();
        Employee[] var1 = employees;
        int var2 = employees.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Employee employee = var1[var3];
            String[] fio = employee.getFullName().split("\\s+");
            System.out.printf(Locale.ROOT, "|  %s.%s. %-16s|%12.2f|%n", fio[1].substring(0, 1), fio[2].substring(0, 1), fio[0], employee.getSalary());
            printBorder();
        }

    }

    private static void printBorder() {
        System.out.printf("|-----------------------+------------|%n");
    }
}
