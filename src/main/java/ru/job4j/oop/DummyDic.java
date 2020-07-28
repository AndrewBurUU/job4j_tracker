package ru.job4j.oop;

import java.util.Arrays;

public class DummyDic {
    public String engToRus(String eng) {
        String translation = "Неизвестное слово: " + eng;
        return translation;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String translate = word.engToRus("DummyDic");
        System.out.println(translate);
    }
}
