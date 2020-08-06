package ru.job4j.io;

import java.util.Arrays;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        int select = 0;
        boolean player = true;
        while (count > 0) {
            String playerName = player ? "Игрок 1" : "Игрок 2";
            System.out.print(playerName + ": ");
            select = Integer.valueOf(input.nextLine());
            while (select < 1 || select > 3) {
                System.out.print("Надо брать от 1 до 3 спичек! Попробуйте ещё раз: ");
                select = Integer.valueOf(input.nextLine());
            }
            count = count - select;
            System.out.println("Остаток: " + String.valueOf(count));
            if (count == 0) {
                System.out.print(playerName + " победил!");
                break;
            }
            player = ! player;
        }
    }
}
