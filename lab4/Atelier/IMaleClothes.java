package ru.mirea.lab4.Atelier;

public interface IMaleClothes {
    default void dressMale() {
        System.out.println("Одеваем мужчину");
    }
}
