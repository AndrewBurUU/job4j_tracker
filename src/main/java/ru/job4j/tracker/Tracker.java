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
//        Item[] namesWithoutNull = new Item[items.length];
/*        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                namesWithoutNull[count] = item;
                count++;
            }
        }
 */
        return Arrays.copyOf(items,size);
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
            item.setId(id);
            items[idItem] = item;
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean res = false;
        int index = indexOf(id);
        if (index >= 0) {
            int start = index + 1;
            int distPos = index;
            int length = size - index;
            System.arraycopy(items, start, items, distPos, length);
            items[size - 1] = null;
            size--;
            res = true;
        }
        return res;
    }
}