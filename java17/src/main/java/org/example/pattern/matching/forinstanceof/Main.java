package org.example.pattern.matching.forinstanceof;

public class Main {

    public static void main(String[] args) {

        Object obj = new Object();

        if (obj instanceof String) {
            String st = (String) obj;
            System.out.println(st);
        }

        if (obj instanceof String st) {
            System.out.println(st);
        }

    }

}
