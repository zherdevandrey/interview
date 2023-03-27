package org.example.sealed;

import java.util.HashMap;
import java.util.Map;

public class TreeMapTest {

    public static void main(String[] args) {

        Person a = new Person(1);
        Person b = new Person(2);
        Person c = new Person(3);
        Person d = new Person(4);

        Map<Person, Integer> personObjectTreeMap = new HashMap<>();

        personObjectTreeMap.put(b, 2);
        personObjectTreeMap.put(d, 4);
        personObjectTreeMap.put(c, 3);
        personObjectTreeMap.put(a, 1);

        System.out.println(personObjectTreeMap.get(b));

        b.setAge(1000000000);

//        personObjectTreeMap.put(new Person(11), 10);
//        personObjectTreeMap.put(new Person(12), 10);
//        personObjectTreeMap.put(new Person(13), 10);
//        personObjectTreeMap.put(new Person(14), 10);
//        personObjectTreeMap.put(new Person(15), 10);
//        personObjectTreeMap.put(new Person(16), 10);
//        personObjectTreeMap.put(new Person(17), 10);
//        personObjectTreeMap.put(new Person(18), 10);
//        personObjectTreeMap.put(new Person(19), 10);
//        personObjectTreeMap.put(new Person(20), 10);
//        personObjectTreeMap.put(new Person(21), 10);


        System.out.println(personObjectTreeMap.get(b));
    }

}
