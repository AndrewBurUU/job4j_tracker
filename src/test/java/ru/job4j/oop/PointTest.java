package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenDistIsTwo() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(4, 0, 0);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(4, 0.001));
    }

    @Test
    public void whenDistIsNull() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(0, 0.001));
    }

    @Test
    public void whenPointIsNegative() {
        Point a = new Point(-1, 0, 0);
        Point b = new Point(0, 0, 0);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(1, 0.001));
    }

}