package Task2;

import Task1.InnisWrongexception;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SortingStudent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getMark() == o2.getMark()) {
            return 0;
        }
        if (o1.getMark() < o2.getMark()) {
            return 1;
        }
        return -1;
    }

    public Student search(List<Student> students) throws FioiswrongException {
        System.out.println("Введите ФИО студента");
        try (Scanner scanner = new Scanner(System.in)) {
            String string = scanner.nextLine();
            System.out.println("Ищем студента");
            for (Student student : students) {
                if (Objects.equals(student.getFullname(), string)) {
                    return student;
                }
            }
            throw new FioiswrongException("Такого студента нет");
        } catch (Exception e) {
            System.out.println(" ");
        }
        return null;
    }
}