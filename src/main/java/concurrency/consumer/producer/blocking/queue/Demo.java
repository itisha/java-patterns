package concurrency.consumer.producer.blocking.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo {

    private static AtomicInteger index = new AtomicInteger(0);
    private static volatile boolean stop = false;

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        Runnable producer = () -> {
            while (!stop) {
                try {
                    Integer value = createItem();
                    if (value <= 1000) {
                        queue.put(value);
                    } else {
                        stop = true;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable consumer = () -> {
            while (!(stop && queue.isEmpty())) {
                try {
                    Integer value = queue.take();
                    if (value > 1000) {
                        throw new IllegalArgumentException("Value = " + value + " should be less then 1000");
                    }
                    System.out.println(value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(producer).start();
        new Thread(producer).start();

        new Thread(consumer).start();
    }

    private static Integer createItem() {
        return index.incrementAndGet();
    }
}
