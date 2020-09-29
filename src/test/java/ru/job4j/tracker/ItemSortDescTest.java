package ru.job4j.tracker;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemSortDescTest extends TestCase {

    public void testCompare() {
        List<Item> items = Arrays.asList(
                new Item(1,"aaa"),
                new Item(3, "ccc"),
                new Item(2, "bbb")
        );
        List<Item> itemsSorted = Arrays.asList (
                new Item(3, "ccc"),
                new Item(2,"bbb"),
                new Item(1,"aaa")
        );
        assertThat(Collection.sort(items, new ItemSortAscTest()), is(itemsSorted));
    }
}