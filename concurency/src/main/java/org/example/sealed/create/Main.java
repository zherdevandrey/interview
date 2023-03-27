package org.example.sealed.create;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        try {
            Boolean call = new Main().new Thread3().call();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    class Thread1 implements Runnable{

        @Override
        public void run() {
            System.out.println("Runnable");
        }
    }

    class Thread2 extends Thread {
        @Override
        public void run() {
            if (true) {
                throw new RuntimeException("test");
            }
            System.out.println("Thread");
        }
    }

    class Thread3 implements Callable<Boolean> {
        @Override
        public Boolean call() {
            if (true) {
                throw new RuntimeException("test");
            }
            return true;
        }
    }
}
