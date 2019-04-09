package concurrency.future;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Demo {

    public static void main(String[] args) {
        List<Weblink> weblinks = new LinkedList<>();

        weblinks.add(new Weblink(1, "http://tut.by"));
        weblinks.add(new Weblink(2, "http://ya.ru"));
        weblinks.add(new Weblink(3, "http://yahoo.com"));
        weblinks.add(new Weblink(4, "http://google.com"));
        weblinks.add(new Weblink(5, "http://google.by"));
        weblinks.add(new Weblink(6, "http://mail.ru"));
        weblinks.add(new Weblink(7, "http://zzzz.zz.zzzs.s.sda.asd.dd"));
        weblinks.add(new Weblink(8, "http://vk.ru"));
        weblinks.add(new Weblink(9, "http://rambler.ru"));

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        go(weblinks, executorService);
    }


    public static void go(List<Weblink> weblinks, ExecutorService executorService) {

        List<Future<Weblink>> weblinkFutureList = new LinkedList<>();

        weblinks.forEach(weblink -> {

            weblinkFutureList.add(executorService.submit(new Downloader<>(weblink)));

            Thread downloaderThread = new Thread();
            Thread indexerThread = new Thread(new Indexer<>(weblink));

            downloaderThread.start();
            indexerThread.start();
        });

        weblinkFutureList.forEach(future -> {
            try {
                Weblink weblink = future.get(10, TimeUnit.SECONDS);
                executorService.submit(new Indexer<>(weblink));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        });


    }

}
