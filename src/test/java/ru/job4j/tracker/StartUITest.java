package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.ex.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<UserAction>(Arrays.asList(new ExitAction(out)));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindAll() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1", "2"}
        );
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<UserAction>(Arrays.asList(
                new CreateAction(out),
                new ShowItemAction(out),
                new ExitAction(out)
        ));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Show all" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator() +
                        "=== Create a new Item ====" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Show all" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator() +
                        "=== Show all items ====" + System.lineSeparator() +
                        "id: 1; name: Item name." + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Show all" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1", "Item name", "2"}
        );
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<UserAction>(Arrays.asList(
                new CreateAction(out),
                new FindByNameAction(out),
                new ExitAction(out)
        ));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Find by name" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator() +
                        "=== Create a new Item ====" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Find by name" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator() +
                        "=== Find item by name ====" + System.lineSeparator() +
                        "id: 1; name: Item name." + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Find by name" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1", "1", "2"}
        );
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<UserAction>(Arrays.asList(
                new CreateAction(out),
                new FindByIdAction(out),
                new ExitAction(out)
        )) ;
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Find by id" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator() +
                        "=== Create a new Item ====" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Find by id" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator() +
                        "=== Find item by id ====" + System.lineSeparator() +
                        "Item id is 1 and item name is Item name" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Find by id" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"7","0"}
        );
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<UserAction>(Arrays.asList(
                new ExitAction(out)
        ));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                )
        ));
    }
}