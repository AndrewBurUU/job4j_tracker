package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter item id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Item id is " + item.getId() + " and item name is " +item.getName());
        }
        else {
            System.out.println("Item not found");
        }
        return true;
    }
}
