package ru.job4j.io;

import java.util.Arrays;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        int select = 0;3
        while (count > 0) {
            System.out.print("Игрок1: ");
            select = Integer.valueOf(input.nextLine());
            count = count - select;
            if (count == 0) {
                System.out.println("Игрок 1 победил! ");
                break;
            }
            System.out.print("Игрок2: ");
            select = Integer.valueOf(input.nextLine());
            count = count - select;
            if (count == 0) {
                System.out.println("Игрок 2 победил! ");
                break;
            }
            System.out.println("Остаток: " + String.valueOf(count));
        }
    }
}
