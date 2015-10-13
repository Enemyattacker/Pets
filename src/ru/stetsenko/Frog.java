package ru.stetsenko;

/**
 * Класс лягушка
 *
 * @author Стеценко Алексей
 */
public class Frog extends Pets{

    @Override
    void move() {
        progress += 5;
        System.out.println("Лягушка прыгает "  + '\n' + +progress + " м");
    }

    @Override
    void talk() {
        System.out.println("Лягушка говорит 'Ква-Ква' ");
    }
}
