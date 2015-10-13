package ru.stetsenko;

/**
 * Абстрактный класс
 *
 * @author Стеценко Алексей
 */
public abstract class Pets {
    /**
     * progress - расстояние, преодолённое животным
     * move() - метод, задающий способ движения животного
     * talk() - метод, задающий способ говора животного
     */
    protected double progress;
    abstract void move();
    abstract void talk();
}
