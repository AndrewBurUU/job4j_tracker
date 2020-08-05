package ru.job4j.io;

import java.util.Arrays;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        int select = 0;
        while (count > 0) {
            System.out.println("");
            for (int player = 1; player < 3; player++) {
                System.out.print("Игрок " +  String.valueOf(player) + ": ");
                select = Integer.valueOf(input.nextLine());
                count = count - select;
                System.out.println("Остаток: " + String.valueOf(count));
                if (count == 0) {
                    System.out.print("Игрок "  + String.valueOf(player) + " победил!");
                    break;
                }
            }
        }
    }
}
