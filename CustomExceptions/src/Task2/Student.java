package Task2;

import java.util.Date;

class Student {
    int mark;
    private String fullname;
    private String speciality;
    private int course;
    private String group;

    Student(String fullname, String speciality, int course, String group, int mark) {
        this.fullname = fullname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.mark = mark;
    }

    Student() {
        this.fullname = "";
        this.speciality = "";
        this.course = 0;
        this.group = "";
        this.mark = 0;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getFullname() {
        return fullname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getGroup() {
        return this.group;
    }

    public int getCourse() {
        return this.course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "{" + "ФИО: " + fullname + ", Специальность: " + speciality + ", Курс: " + course + ", Группа: " + group
                + ", Средний балл: " + mark + "}";
    }
}