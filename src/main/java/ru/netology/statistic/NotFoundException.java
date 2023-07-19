package ru.netology.statistic;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Товара с номером " + id + " не существует");
    }
}
