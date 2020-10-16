package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class SearchAtt {
    public static Attachment loop (Function<Attachment, Attachment> func) {
        Attachment rsl = null;
/*
        for (Attachment att: list) {
            rsl = func(att);
        }

 */
        return rsl;
    }

    public static Attachment filterSize(int size) {
        Function<Attachment, Attachment> func = new Function<Attachment, Attachment>() {
            @Override
            public Attachment apply(Attachment att) {
                return att.getSize() > size ? att : null;
            }
        };
        return loop(func);
    }
}
