package org.example.sealed;

public class Singleton {
    public static void main(String[] args) {

    }

    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }

        }
        return INSTANCE;
    }
}
