package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class FuncDiap {
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (int x = start; x < end; x++) {
            rsl.add(func.apply((double) x));
        }
        return rsl;
    };

    private static Double add (Supplier<Double> calc) {
        return calc.get();
    }
}
