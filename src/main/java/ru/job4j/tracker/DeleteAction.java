package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ====");
        int id = Integer.valueOf(input.askStr("Enter item id: "));
        if (tracker.delete(id)) {
            System.out.println("Item deleted");
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
