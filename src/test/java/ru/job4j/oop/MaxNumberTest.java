package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxNumberTest {

    @Test
    public void whenMax1To2Then2() {
        MaxNumber set12 = new MaxNumber();
        int result = set12.Compare(10,12);
        assertThat(result, is(12));
    }

    @Test
    public void whenMax1To3Then3() {
        MaxNumber set12 = new MaxNumber();
        int result = set12.Compare(10,12, 15);
        assertThat(result, is(15));
    }

    @Test
    public void whenMax1To4Then1() {
        MaxNumber set12 = new MaxNumber();
        int result = set12.Compare(20,12, 1, 19);
        assertThat(result, is(20));
    }

    @Test
    public void whenMax1To4ThenAll() {
        MaxNumber set12 = new MaxNumber();
        int result = set12.Compare(0,0, 0, 0);
        assertThat(result, is(0));
    }

}