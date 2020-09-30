package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemSortAscTest {

    @Test
    public void testCompare() {
        List<Item> items = Arrays.asList(
          new Item(1,"aaa"),
          new Item(3, "ccc"),
          new Item(2, "bbb")
        );
        List<Item> itemsSorted = Arrays.asList (
                new Item(1, "aaa"),
                new Item(2,"bbb"),
                new Item(3,"ccc")
        );
        Collections.sort(items, new ItemSortAsc());
        assertThat(items, is(itemsSorted));
    }
}