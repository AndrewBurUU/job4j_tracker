package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare kosoy = new Hare();
        Fox alice = new Fox();
        Wolf seriy = new Wolf();
        kosoy.tryEat(kolobok);
        alice.tryEat(kolobok);
        seriy.tryEat(kolobok);
    }
}
