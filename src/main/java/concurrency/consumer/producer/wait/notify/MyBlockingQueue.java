package concurrency.consumer.producer.wait.notify;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<T> {

    private final Queue<T> queue;
    private final int max;

    //used same shared lock for both methods
    private final ReentrantLock lock = new ReentrantLock(true);

    //two events
    private final Condition notEmpty = lock.newCondition();
    private final Condition notFull = lock.newCondition();

    MyBlockingQueue(int max) {
        this.queue = new LinkedList<>();
        this.max = max;
    }

    boolean add(T entry) throws InterruptedException {
        lock.lock();
        try {
            if (queue.size() >= max) {
                notFull.await();
            }
            boolean result = queue.add(entry);
            notEmpty.signalAll();
            return result;
        } finally {
            lock.unlock();
        }
    }

    T remove() throws InterruptedException {
        lock.lock();
        try {
            if (queue.size() == 0) {
                notEmpty.await();
            }
            T item = queue.remove();
            notFull.signalAll();
            return item;
        } finally {
            lock.unlock();
        }
    }

    public int size() {
        return queue.size();
    }
}
