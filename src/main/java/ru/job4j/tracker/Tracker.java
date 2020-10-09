package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<Item>(100);
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findAll() {
        List<Item> copy = new ArrayList<Item>(size);
        for (Item item: items) {
            copy.add(item);
        }
        return copy;
    }

    public List<Item> findByName(String key) {
        List<Item> names = new ArrayList<Item>(size);
        for (Item item: items) {
            if (item.getName().equals(key)) {
                names.add(item);
            }
        }
        return names;
    }

    public boolean replace(int id, Item item) {
        int idItem = indexOf(id);
        boolean rsl = idItem != -1;
        if (rsl) {
            item.setId(id);
            items.set(idItem, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean res = index != -1;
        if (res) {
            items.remove(index);
        }
        return res;
    }

}