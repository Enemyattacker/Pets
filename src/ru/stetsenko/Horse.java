package ru.stetsenko;

/**
 * Класс лошадка
 *
 * @author Стеценко Алексей
 */
public class Horse extends Pets {
    @Override
    void move() {
        progress += 10;
        System.out.println("Лошадка скачет " +  '\n' +  +progress + " м");
    }

    @Override
    void talk() {
        System.out.println("Лошадка говорит 'И-го-го' ");
    }
}
