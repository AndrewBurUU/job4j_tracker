package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {this.out = out;}

    @Override
    public String name() {return "Edit";}

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit Item ====");
        int id = Integer.valueOf(input.askStr("Enter item id: "));
        String name = input.askStr("Enter new name: ");
        Item item = new Item(id, name);
        if (tracker.replace(id, item)) {
            out.println("Item replaced");
        } else {
            out.println("Item not found");
        }
        return true;
    }
}
