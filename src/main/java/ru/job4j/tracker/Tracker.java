package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        Item[] namesWithoutNull = new Item[items.length];
        int count = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null) {
                namesWithoutNull[count] = item;
                count++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull,count);
        return namesWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] names = new Item[items.length];
        int count = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                names[count] = item;
                count++;
            }
        }
        names = Arrays.copyOf(names,count);
        return names;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int idItem = indexOf(id);
        if (idItem >= 0) {
            items[idItem].setName(item.getName());
            rsl = true;
        }
        return rsl;
    }

}