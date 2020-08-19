package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (key == value[index]) {
                rsl = index;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException();
        }
        return rsl;
    }

    public static void main(String[] args) {
        FindEl findEl = new FindEl();
        String[] elements = {"a","b","c"};
        try {
            int index = findEl.indexOf(elements,"d");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
