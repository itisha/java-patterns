package concurrency.yield;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new EmailProcessor());
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setName("EmailProcessor");

        Thread t2 = new Thread(new DataAggregator());
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.setName("DataAggregator");

        t1.start();
        t2.start();

        //main will wait for t2 to finish and only then will continue execution
        t2.join();
        System.out.println("main finished");
    }
}


class EmailProcessor implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println(Thread.currentThread().getName() + ".yield()");
                //scheduler would decide to yield or not
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName());
        }

    }
}

class DataAggregator implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}