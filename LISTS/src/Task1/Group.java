package Task1;

import java.util.ArrayList;
import java.util.List;

public class Group {
    List<Student> list;
    int size;

    Group(Student... students) {
        size = students.length;
        list = new ArrayList<>(size);
        this.list = List.of(students);
    }

    Group() {
        list = new ArrayList<>();
    }

    public List<Student> add(Student student) {
        size++;
        list = new ArrayList<>(size);
        list.add(student);
        return list;
    }

    public List<Student> delete(int index) {
        list.remove(index);
        return list;
    }

    public void print() {
        System.out.println(list);
    }

    public void clear() {
        list.clear();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}