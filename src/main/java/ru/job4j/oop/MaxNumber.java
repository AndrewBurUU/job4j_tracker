package ru.job4j.oop;

public class MaxNumber {
    public int Compare(int left, int right) {
        return left>right ? left : right;
    }
    public int Compare(int one, int two, int three) {
        return Compare(one, Compare(two,three));
    }
    public int Compare(int one, int two, int three, int four) {
        return Compare(one, two, Compare(three, four));
    }
}
