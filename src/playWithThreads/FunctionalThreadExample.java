package playWithThreads;

import java.util.stream.IntStream;

public class FunctionalThreadExample {
    public static void main(String[] args) {


        Runnable runnable =  () -> {
            IntStream.rangeClosed(1, 1000)
                    .forEach(it -> System.out.println(Thread.currentThread().getId() + ": " + it));
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        Thread thread3 = new Thread(runnable);
        thread3.start();

    }
}
