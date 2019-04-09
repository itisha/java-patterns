package concurrency.future;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Demo {

    private static final long TIME_FRAME = 2_000_000_000L;// 2 seconds

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Weblink> weblinks = new LinkedList<>();

        weblinks.add(new Weblink(1, "http://tut.by"));
        weblinks.add(new Weblink(2, "http://ya.ru"));
        weblinks.add(new Weblink(3, "http://yahoo.com"));
        weblinks.add(new Weblink(4, "http://google.com"));
        weblinks.add(new Weblink(5, "http://google.by"));
        weblinks.add(new Weblink(6, "http://mail.ru"));
        weblinks.add(new Weblink(7, "http://t54t54t4"));
        weblinks.add(new Weblink(8, "http://vk.ru"));
        weblinks.add(new Weblink(9, "http://rambler.ru"));

        ExecutorService downloadExecutor = Executors.newFixedThreadPool(2);
        ExecutorService indexerExecutor = Executors.newFixedThreadPool(2);

        go(weblinks, downloadExecutor, indexerExecutor);
    }


    public static void go(List<Weblink> weblinks, ExecutorService downloadExecutor, ExecutorService indexerExecutor) throws InterruptedException, ExecutionException {


        List<Downloader<Weblink>> downloaders = new LinkedList<>();
        weblinks.forEach(weblink -> downloaders.add(new Downloader<>(weblink)));


        //It’s not stated explicitly, but it uses Future.cancel(true), i.e. interrupt the running tasks
        //Call to all the future.get() will not block here
        List<Future<Weblink>> futures = downloadExecutor.invokeAll(downloaders, TIME_FRAME, TimeUnit.NANOSECONDS);


        for (Future<Weblink> future : futures) {
            if (future.isCancelled()) {
                System.out.println("Task is cancelled!");
            } else if (!future.isDone()) {
                System.out.println("Task is not done!");
            } else {
                indexerExecutor.execute(new Indexer<>(future.get()));
            }
        }


        downloadExecutor.shutdown();
        indexerExecutor.shutdown();

        weblinks.forEach(weblink -> System.out.println(weblink.toString()));


    }
}