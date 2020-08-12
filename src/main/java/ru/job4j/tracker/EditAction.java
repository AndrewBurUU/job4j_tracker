package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter item id: "));
        String name = input.askStr("Enter new name: ");
        Item item = new Item(id, name);
        if (tracker.replace(id, item)) {
            System.out.println("Item replaced");
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
