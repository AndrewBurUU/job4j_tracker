package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {
    public static List<Attachment> loop (List<Attachment> list, Predicate<Attachment> func) {
        List<Attachment> newList = new ArrayList<>();
        for (Attachment att: list) {
            if (func.test(att)) {
                newList.add(att);
            }
        }
        return newList;
    }

    public static List<Attachment> filter(List<Attachment> list, int size) {
        Predicate<Attachment> func = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment att) {
                return att.getSize() > size;
            }
        };
        return loop(list, func);
    }

    public static List<Attachment> filter(List<Attachment> list, String name) {
        Predicate<Attachment> func = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment att) {
                return att.getName().contains(name);
            }
        };
        return loop(list, func);
    }

    public static void main(String[] args) {
        List<Attachment> listAttachment = Arrays.asList(
                new Attachment("aaa", 1),
                new Attachment("bug", 10),
                new Attachment("bug", 111)
        );
        List<Attachment> newList = filter(listAttachment,100);
        System.out.println(filter(listAttachment,100));
        System.out.println(filter(listAttachment,"bug"));
    }

}
