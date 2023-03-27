package org.example.sealed.deadlock;

import lombok.Data;

import java.util.concurrent.locks.ReentrantLock;

@Data
class Account {
    private int sum;
    private ReentrantLock lock;

    public Account(int sum) {
        this.sum = sum;
        this.lock = new ReentrantLock();
    }
}