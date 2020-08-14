package ru.job4j.tracker;

public class ShowItemAction implements UserAction {
    private final Output out;

    public ShowItemAction(Output out) {this.out = out;}

    @Override
    public String name() {return "Show all";}

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            System.out.println("id: " + item.getId() + "; name: " + item.getName() + ".");
        }
        return true;
    }
}
