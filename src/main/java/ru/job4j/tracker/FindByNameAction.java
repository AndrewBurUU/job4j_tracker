package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {this.out = out;}

    @Override
    public String name() {return "Find by name";}

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ====");
        String name = input.askStr("Enter item name: ");
        Item[] items = tracker.findByName(name);
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            System.out.println("id: " + item.getId() + "; name: " + item.getName() + ".");
        }
        return true;
    }
}
