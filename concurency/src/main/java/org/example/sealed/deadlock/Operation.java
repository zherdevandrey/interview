package org.example.sealed.deadlock;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

public class Operation {
    @SneakyThrows
    public static void transferWithDeadLock(Account from, Account to, int amount) {
        synchronized (from) {
            Thread.sleep(500);
            synchronized (to) {
                from.setSum(from.getSum() - amount);
                to.setSum(to.getSum() + amount);
            }
        }
        System.out.println("transfer");
    }

    @SneakyThrows
    public static void transferWithReentrantLock(Account from, Account to, int amount) {
        if (from.getLock().tryLock(2, TimeUnit.SECONDS)) {
            try {
                // Thread.sleep(500);
                if (from.getLock().tryLock(2, TimeUnit.SECONDS)) {
                    from.setSum(from.getSum() - amount);
                    to.setSum(to.getSum() + amount);
                }
            } finally {
                from.getLock().unlock();
                to.getLock().unlock();
            }

        }

    }
}
