package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {this.out = out;}

    @Override
    public String name() {return "Find by id";}

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ====");
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
