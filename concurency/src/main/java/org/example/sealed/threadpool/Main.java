package org.example.sealed.threadpool;

import lombok.SneakyThrows;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        executorService.scheduleWithFixedDelay(Main::sleep, 1, 1, TimeUnit.SECONDS);
        executorService.scheduleWithFixedDelay(Main::sleep, 1, 1, TimeUnit.SECONDS);
        executorService.scheduleWithFixedDelay(Main::sleep, 1, 1, TimeUnit.SECONDS);
        executorService.scheduleWithFixedDelay(Main::sleep, 1, 1, TimeUnit.SECONDS);
        executorService.scheduleWithFixedDelay(Main::sleep, 1, 1, TimeUnit.SECONDS);
        executorService.scheduleWithFixedDelay(Main::sleep, 1, 1, TimeUnit.SECONDS);



        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.DAYS);


        Thread.sleep(10000000);
    }

    @SneakyThrows
    private static Integer sleep() {
        System.out.println(Thread.currentThread().getName());
        //Thread.sleep(1000);
        return 1;
    }

}
