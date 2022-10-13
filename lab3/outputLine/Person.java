package ru.mirea.lab3.outputLine;

import java.util.Locale;

public class Person {
    private String fullName;
    private int age;
    private Location currentLocation;

    public Person() {
        this("", 0);
    }

    public Person(String fullName) {
        this(fullName, 0);
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int move(Location destinationLocation, double speed) throws InterruptedException {
        double distance = Location.getDistance(this.currentLocation, destinationLocation);

        int wayTime;
        for(wayTime = 0; distance > 0.0; ++wayTime) {
            printLeftDistance(distance);
            Thread.sleep(1000L);
            distance -= speed;
        }

        this.setCurrentLocation(destinationLocation);
        return wayTime;
    }

    private static void printLeftDistance(double distance) {
        System.out.printf(Locale.ROOT, "%d m left to destination point\n", (int)distance);
    }

    public void talk() {
        System.out.printf(Locale.ROOT, "Hello! My name is %s. I am %d years old.\n", this.fullName, this.age);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Person person = (Person)o;
            return this.age != person.age ? false : this.fullName.equals(person.fullName);
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.fullName.hashCode();
        result = 31 * result + this.age;
        return result;
    }

    public String toString() {
        return "Person{fullName='" + this.fullName + "', age=" + this.age + "}";
    }
}
