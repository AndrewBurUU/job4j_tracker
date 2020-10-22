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

        String[] names = {
                "Ivan",
                "Andrew"
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return left.length() - right.length();
        };

//        Arrays.sort(names, lengthCmp);
//        Arrays.sort(strings, cmpDescSize);
        Arrays.sort(names,lengthCmp);
    }

}
