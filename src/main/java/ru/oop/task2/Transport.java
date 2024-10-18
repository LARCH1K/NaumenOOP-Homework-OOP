package ru.oop.task2;

/**
 * Транспорт для перевозки человека
 */
public interface Transport extends Positioned {

    /**
     * Переехать из текущего места в заданную точку
     */
    void driveTo(Person person, Position destination);
}
