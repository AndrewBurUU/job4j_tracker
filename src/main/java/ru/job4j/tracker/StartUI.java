package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item(1,"задание по хранилищу");
        tracker.add(item);
        tracker.add(item);
        tracker.add(item);
        item = tracker.findById(1);
        System.out.println(item.getId() + ": " + item.getName());
    }
}
