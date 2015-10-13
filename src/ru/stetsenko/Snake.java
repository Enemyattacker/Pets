package ru.stetsenko;

/**
 * Класс змея
 *
 * @author Стеценко Алексей
 */
public class Snake extends Pets {
    @Override
    void move(){
        progress +=0.2;
        System.out.println("Змейка ползёт " + '\n' + progress + " м");
    }

    @Override
    void talk(){
        System.out.println("Змейка говорит 'Ш-ш-ш' ");
    }
}
