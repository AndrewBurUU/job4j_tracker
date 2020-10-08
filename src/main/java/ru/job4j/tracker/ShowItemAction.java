package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class ShowItemAction implements UserAction {
    private final Output out;

    public ShowItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ====");
        List<Item> items = tracker.findAll();
        for (Item item: items) {
            out.println("id: " + item.getId() + "; name: " + item.getName() + ".");
        }
        return true;
    }
}
