package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {this.out = out;}

    @Override
    public String name() {return "Find by name";}

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by name ====");
        String name = input.askStr("Enter item name: ");
        List<Item> items = tracker.findByName(name);
        for (Item item: items) {
            out.println("id: " + item.getId() + "; name: " + item.getName() + ".");
        }
        return true;
    }
}
