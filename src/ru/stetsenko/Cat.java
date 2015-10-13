package ru.stetsenko;

/**
 * Класс кошка
 *
 * @author Стеценко Алексей
 */
public class Cat extends Pets {
    @Override
    void move() {
        System.out.println("Кошка крадётся " + '\n' + ++progress + " м");
    }

    @Override
    void talk() {
        System.out.println("Кошка говорит 'Мяу-Мяу' ");
    }
}
