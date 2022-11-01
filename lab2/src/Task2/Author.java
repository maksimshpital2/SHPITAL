package Task1;

public class Author {
    private final String name;
    private String email;
    private final char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGender() {
        return this.gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" + "Имя: " + name + ", Почта: " + email + ", Пол: " + gender + "}";
    }
}