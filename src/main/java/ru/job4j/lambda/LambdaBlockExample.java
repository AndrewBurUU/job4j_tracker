package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaBlockExample {
    public static void main(String[] args) {
        String[] strings = {
                "aaaaa",
                "aaa",
                "aaaaaa"
        };
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("cmpDescSize - " + right + " : " + left);
            return right.length() - left.length();
        };
        Arrays.sort(strings, cmpDescSize);
    }

}
