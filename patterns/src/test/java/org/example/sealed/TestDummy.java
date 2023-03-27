package org.example.sealed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDummy {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);

        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        integers.forEach(System.out::println);

    }

}
