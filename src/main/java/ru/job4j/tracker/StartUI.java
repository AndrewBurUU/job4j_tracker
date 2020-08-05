package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                boolean enterNewItem = true;
                while (enterNewItem) {
                    System.out.print("Enter name (press * for exit): ");
                    String name = scanner.nextLine();
                    if (name.equals("*")) {
                        enterNewItem = false;
                    } else {
                        Item item = new Item(name);
                        tracker.add(item);
                    }
                }
                System.out.println("Items added");
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] items = tracker.findAll();
                for (int index = 0; index < items.length; index++) {
                    Item item = items[index];
                    System.out.println("id: " + item.getId() + "; name: " + item.getName() + ".");
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter item id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Current name is " +item.getName());
                    System.out.print("Enter new name: ");
                    String name = scanner.nextLine();
                    item.setName(name);
                    if (tracker.replace(id, item)) {
                        System.out.println("Item replaced");
                    } else {
                        System.out.println("Item not found");
                    }
                } else {
                    System.out.println("Item not found");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter item id: ");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(id)) {
                        System.out.println("Item deleted");
                } else {
                    System.out.println("Item not found");
                    }
            } else if (select == 4) {
                System.out.println("=== Find item by id ====");
                System.out.print("Enter item id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Item id is " + item.getId() + " and item name is " +item.getName());
                } else {
                    System.out.println("Item not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find item by name ====");
                System.out.print("Enter item name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (int index = 0; index < items.length; index++) {
                        Item item = items[index];
                        System.out.println("id: " + item.getId() + "; name: " + item.getName() + ".");
                    }
                } else {
                    System.out.println("Item not found");
                }
            } else if (select == 6) {
                run = false;
            }
            System.out.println("");
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
