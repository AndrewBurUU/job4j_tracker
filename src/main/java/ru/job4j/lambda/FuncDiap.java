package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class FuncDiap {
    private static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        Double rslFunc = 1.0;
        for (int x = start; x <= end; x++) {
            Double rslFuncTotal = rslFunc;
            rslFunc = add (
                    () -> {
                        return func.apply(rslFuncTotal);
                    }
            );
            rsl.add(rslFunc);
        }
        return rsl;
    };

    private static Double add (Supplier<Double> calc) {
        return calc.get();
    }

    public static Double linear (Double x) {
        Function<Double,Double> func = new Function<Double, Double>() {
            @Override
            public Double apply(Double aDouble) {
                return aDouble+x;
            }
        };
        return diapason(x,x,func);
    }
}
