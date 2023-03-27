package org.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = List.of(new Camera(), new Phone());
        ArrayList<Product> objects = new ArrayList<>();

        new Main().copy(products ,objects);

        objects.forEach(System.out::println);

    }

    private void print(List<? extends Product> list) {
        list.forEach(System.out::println);
    }

    private <T extends Product> List<T> test(List<T> list) {
        list.forEach(System.out::println);
        return list;
    }

    private void copy(List<? extends Product> in, List<? super Product> out) {
        for (Product product : in) {
            out.add(product);
        }
    }

}
