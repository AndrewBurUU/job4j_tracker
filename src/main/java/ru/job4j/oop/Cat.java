package ru.job4j.oop;

public class Cat {
    private String name;

    private String food;

    public void show() {
        System.out.println("This is " + this.name + "'s food: " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public String sound() {
        String voice = "meow-meow";
        return voice;
    }

    /*
    HISTORY
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
    */
    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("cutlet");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}
