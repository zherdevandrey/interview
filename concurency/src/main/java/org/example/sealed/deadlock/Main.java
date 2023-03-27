package org.example.sealed.deadlock;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        final Account from = new Account(100);
        final Account to = new Account(200);

        Thread thread1 = new Thread(() -> Operation.transferWithReentrantLock(from, to, 10));

        Thread thread2 = new Thread(() -> Operation.transferWithReentrantLock(to, from, 20));

        thread1.start();
        thread2.start();

        Thread.sleep(1000000);

        System.out.println(from.getSum());
        System.out.println(to.getSum());
    }

}
