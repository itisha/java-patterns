package concurrency.consumer.producer.wait.notify;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo {

    private static volatile AtomicInteger index = new AtomicInteger(0);
    private static volatile boolean stop = false;

    public static void main(String[] args) {

        MyBlockingQueue<Integer> queue = new MyBlockingQueue<>(10);

        Runnable producer = () -> {
            try {
                while (!stop) {
                    int value = index.incrementAndGet();
                    if (value > 1000) {
                        stop = true;
                    } else {
                        queue.add(value);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable consumer = () -> {
            try {
                while (!(queue.size() == 0 && stop)) {
                    Integer value = queue.remove();
                    System.out.println(value);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }

}
