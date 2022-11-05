package Task6;

public class Employer {
    private String firstName;
    private String lastName;
    private double income;

    public double getIncome() {
        return this.income;
    }

    Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
