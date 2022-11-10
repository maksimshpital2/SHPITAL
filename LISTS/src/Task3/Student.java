package Task3;

class Student {
    private String name;
    private String surname;
    private String speciality;
    private int course;
    private String group;

    Student(String name, String surname, String speciality, int course, String group) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getSurname() {
        return surname;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "{" + "Имя: " + name + ", Фамилия: " + surname + ", Специальность: " + speciality + ", Курс: " + course
                + ", Группа: " + group + "}";
    }
}
