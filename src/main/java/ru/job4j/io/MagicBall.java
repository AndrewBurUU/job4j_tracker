package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        System.out.print("");
        if (answer == 0) {
            System.out.print("Да");
        } else if (answer == 1) {
            System.out.print("Нет");
        } else {
            System.out.print("Может быть");
        }
    }
}
