package ru.job4j.ex;

import ru.job4j.tracker.Input;

import java.util.Arrays;
import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Fact f = new Fact();
        System.out.println("Factorial is " +f.calc(-2));
    }

    public int calc(int n) {
        int rsl = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Number n shouldn't be less then zero.");
        }
        for (int index = 1; index <= n; index++) {
             rsl *= index;
        }
        return rsl;
    }
}
