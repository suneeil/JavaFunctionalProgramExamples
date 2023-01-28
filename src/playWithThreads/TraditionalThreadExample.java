package playWithThreads;

public class TraditionalThreadExample {
    public static void main(String[] args) {

        //Traditional var
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100; i++) {
                    System.out.println(Thread.currentThread().getId() + ": " + i);
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        Thread thread3 = new Thread(runnable);
        thread3.start();

    }
}
