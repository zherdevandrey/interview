package org.example.record.example;

public record Point(int a, int b) {

    public Point {
        if (a < 0 || b < 0) {
            System.out.println("fail");
        }
    }

    public void print() {
        System.out.println(a + b);
    }

}
