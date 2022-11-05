package Task2;

import Task1.InnisWrongexception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("asojfg sigujh", "asf", 234, "asf", 100));
        list.add(new Student("sgag aef", ",yti", 234, "asf", 23));
        list.add(new Student("aenr szeg", "sher", 234, "asf", 32));
        list.add(new Student("asojdtzjfg sazeg", "szehr", 234, "aasegsf", 14));
        list.add(new Student("Вася Петров", "hwb", 234, "assegf", 11));

        SortingStudent sort = new SortingStudent();
        list.sort(sort);

        for (Student student : list) {
            System.out.println(student.getMark());
        }
        try {
            System.out.println(sort.search(list));
        } catch (FioiswrongException e) {
            System.out.println(e.getMessage());
        }
    }
}