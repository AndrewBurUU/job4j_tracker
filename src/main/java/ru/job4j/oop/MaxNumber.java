package ru.job4j.oop;

public class MaxNumber {
    public int compare(int left, int right) {
        return left>right ? left : right;
    }
    public int compare(int one, int two, int three) {
        return compare(one, compare(two,three));
    }
    public int compare(int one, int two, int three, int four) {
        return compare(one, two, compare(three, four));
    }
}
