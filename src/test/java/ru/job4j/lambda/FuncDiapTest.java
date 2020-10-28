package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.exp;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FuncDiapTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        FuncDiap function = new FuncDiap();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadFunctionThenQuadResults() {
        FuncDiap function = new FuncDiap();
        List<Double> result = function.diapason(5, 8, x -> 2 * x * x + 1);
        List<Double> expected = Arrays.asList(51D, 73D, 99D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExpFunctionThenExpResults() {
        FuncDiap function = new FuncDiap();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(32D, 64D, 128D);
        assertThat(result, is(expected));
    }

}