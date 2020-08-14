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
        out.println("=== Delete Item ====");
        int id = Integer.valueOf(input.askStr("Enter item id: "));
        if (tracker.delete(id)) {
            out.println("Item deleted");
        } else {
            out.println("Item not found");
        }
        return true;
    }
}
