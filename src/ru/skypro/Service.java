package ru.skypro;

public interface Service {
     default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
