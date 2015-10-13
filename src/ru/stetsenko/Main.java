package ru.stetsenko;

/**
 * Демо класс, демонстрирующий класс pets
 */
public class Main {
    public static void main(String[] args){
        Cat matilda = new Cat();
        Horse flash = new Horse();
        Snake piton = new Snake();
        Frog icefrog = new Frog();
        matilda.move();
        matilda.talk();
        flash.move();
        flash.talk();
        matilda.move();
        flash.move();
        piton.move();
        piton.talk();
        icefrog.move();
        icefrog.move();
        icefrog.talk();
    }
}
